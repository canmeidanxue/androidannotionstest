package com.example.androidannotions.examle;

import org.androidannotations.annotations.EActivity;

import android.app.Activity;
import android.os.Bundle;
@EActivity(R.layout.fragment_main)
public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

}
