package com.example.androidannotions.examle;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
@EActivity(R.layout.second_main)
public class MainActivity extends Activity {
	@ViewById(R.id.button1)
	Button button;
	@Click(R.id.button1)
	public void startActivity(){
		startActivity(new Intent(this,SecondActivity.class));
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

}
