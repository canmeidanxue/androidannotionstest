package com.example.androidannotions.examle.bean;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import android.app.Activity;
import android.app.Service;
import android.content.Context;

/**
 * 
 * @author hong
 *注意：这个类必须仅仅只能有一个构造函数，参数最多有一个context。
 */
@EBean
public class WarThree {
	private String Ud;
	private String Hum;
	private String Orc;
	private String Ne;
	//在普通类中还可以注入根环境:
	 @RootContext
	  Context context;
	  // Only injected if the root context is an activity
	  @RootContext
	  Activity activity;

	  // Only injected if the root context is a service
	  @RootContext
	  Service service;

	  // Only injected if the root context is an instance of MyActivity
	public String getUd() {
		return Ud;
	}
	public void setUd(String ud) {
		Ud = ud;
	}
	public String getHum() {
		return Hum;
	}
	public void setHum(String hum) {
		Hum = hum;
	}
	public String getOrc() {
		return Orc;
	}
	public void setOrc(String orc) {
		Orc = orc;
	}
	public String getNe() {
		return Ne;
	}
	public void setNe(String ne) {
		Ne = ne;
	}
}
