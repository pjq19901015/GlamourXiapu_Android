package com.pjq.listener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class BackClickListener implements OnClickListener {
	private Activity activity;
	public BackClickListener(Class  c) {
		try {
			   //Class.forName(c.getName());
			   activity = (Activity) c.newInstance();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onClick(View v) {
		activity.finish();
	}
	

}
