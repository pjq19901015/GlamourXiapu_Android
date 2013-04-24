package com.pjq.listener;

import com.pjq.glamour_xiapu.site.GaoLuoActivity;
import com.pjq.glamour_xiapu.site.LiuYunSiActivity;
import com.pjq.glamour_xiapu.site.XiYangDaoiActivity;
import com.pjq.glamour_xiapu.site.XiapuTantuActivity;
import com.pjq.glamour_xiapu.site.YangjiaxiActivity;

import android.content.Context;
import android.content.Intent;
import android.view.View; 

public class SiteListClickListener extends MyClickListener {
	
	private Context context;

	public SiteListClickListener(Context context) {
		this.context = context;
	}
	/*public SiteListClickListener(Context context,int i) {
		this(context);
	}*/
	@Override
	public void onClick(View v) {
		if(!b){
			id = v.getId();
		}
		switch(id){
		case 0:
			Intent intent = new Intent();
			intent.setClass(context, YangjiaxiActivity.class);
			context.startActivity(intent);
			break;
		case 1:
			Intent intent2 = new Intent();
			intent2.setClass(context, XiYangDaoiActivity.class);
			context.startActivity(intent2);
			break;
		case 2:
			Intent intent3 = new Intent();
			intent3.setClass(context, LiuYunSiActivity.class);
			context.startActivity(intent3);
			break;
		case 3:
			Intent intent4 = new Intent();
			intent4.setClass(context, GaoLuoActivity.class);
			context.startActivity(intent4);
			break;
		case 4:
			Intent intent5 = new Intent();
			intent5.setClass(context, XiapuTantuActivity.class);
			context.startActivity(intent5);
			break;  

		}

	}
	
}