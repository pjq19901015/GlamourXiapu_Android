package com.pjq.listener;

import com.pjq.glamour_xiapu.restaurant.HuTangActivity;
import com.pjq.glamour_xiapu.restaurant.NiuRouWangActivity;
import com.pjq.glamour_xiapu.restaurant.TianTianMianGuanActivity;
import com.pjq.glamour_xiapu.restaurant.XiongDiHuoGuoActivity;
import com.pjq.glamour_xiapu.restaurant.YanTianDaDiActivity; 

import android.content.Context;
import android.content.Intent;
import android.view.View;  

public class RestaurantListClickListener extends MyClickListener {
	
	private Context context;
	
	public RestaurantListClickListener(Context context) {
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
			intent.setClass(context, HuTangActivity.class);
			context.startActivity(intent);
			break;
		case 1:
			Intent intent2 = new Intent();
			intent2.setClass(context, NiuRouWangActivity.class);
			context.startActivity(intent2);
			break;
		case 2:
			Intent intent3 = new Intent();
			intent3.setClass(context, TianTianMianGuanActivity.class);
			context.startActivity(intent3);
			break;
		case 3:
			Intent intent4 = new Intent();
			intent4.setClass(context, XiongDiHuoGuoActivity.class);
			context.startActivity(intent4);
			break;
		case 4:
			Intent intent5 = new Intent();
			intent5.setClass(context, YanTianDaDiActivity.class);
			context.startActivity(intent5);
			break;  

		}

	}
	
}