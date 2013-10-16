package com.pjq.listener;

import com.pjq.glamour_xiapu.fun.*;
import com.pjq.glamour_xiapu.fun.TongYiShouGeActivity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public class FunListClickListener extends MyClickListener {
	
	private Context context;
	
	public FunListClickListener(Context context) {
		this.context = context;
	}
	@Override
	public void onClick(View v) {
		if(!b){
			id = v.getId();
		}
		switch(id){
		case 0:
			Intent intent = new Intent();
			intent.setClass(context, WenHuaGuangChangActivity.class);
			context.startActivity(intent);
			break;
		case 1:
			Intent intent2 = new Intent();
			intent2.setClass(context, HuaJiaYiHaoActivity.class);
			context.startActivity(intent2);
			break;
		case 2:
			Intent intent3 = new Intent();
			intent3.setClass(context, FuNingParkActivity.class);
			context.startActivity(intent3);
			break;
		case 3:
			Intent intent4 = new Intent();
			intent4.setClass(context, JiuDaGuanActivity.class);
			context.startActivity(intent4);
			break;
		case 4:
			Intent intent5 = new Intent();
			intent5.setClass(context, BaiDuKTVActivity.class);
			context.startActivity(intent5);
			break;  
		case 5:
			Intent intent6 = new Intent();
			intent6.setClass(context, TongYiShouGeActivity.class);
			context.startActivity(intent6);
			break;  
		}

	}
	
}