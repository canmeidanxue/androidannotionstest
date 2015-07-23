package com.example.androidannotions.examle.view;

import org.androidannotations.annotations.EView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
@EView
public class CustomButton extends Button {
	
	public CustomButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

}
