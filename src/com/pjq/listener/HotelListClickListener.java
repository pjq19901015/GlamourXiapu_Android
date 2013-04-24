package com.pjq.listener;

import com.pjq.glamour_xiapu.hotel.DiJingActivity;
import com.pjq.glamour_xiapu.hotel.HuanDaoActivity;
import com.pjq.glamour_xiapu.hotel.ManHaDunActivity;
import com.pjq.glamour_xiapu.hotel.Su8Activity;
import com.pjq.glamour_xiapu.hotel.XinDongFangActivity;
 

import android.content.Context;
import android.content.Intent;
import android.view.View; 

public class HotelListClickListener extends MyClickListener {
	
	private Context context;
	
	public HotelListClickListener(Context context) {
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
			intent.setClass(context, DiJingActivity.class);
			context.startActivity(intent);
			break;
		case 1:
			Intent intent2 = new Intent();
			intent2.setClass(context, XinDongFangActivity.class);
			context.startActivity(intent2);
			break;
		case 2:
			Intent intent3 = new Intent();
			intent3.setClass(context, Su8Activity.class);
			context.startActivity(intent3);
			break;
		case 3:
			Intent intent4 = new Intent();
			intent4.setClass(context, ManHaDunActivity.class);
			context.startActivity(intent4);
			break;
		case 4:
			Intent intent5 = new Intent();
			intent5.setClass(context, HuanDaoActivity.class);
			context.startActivity(intent5);
			break;  

		}

	}
	
}