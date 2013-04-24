package com.pjq.listener;
 
import com.pjq.glamour_xiapu.shopping.BaiShengActivity;
import com.pjq.glamour_xiapu.shopping.BuXingJieActivity;
import com.pjq.glamour_xiapu.shopping.LongShouLuActivity;
import com.pjq.glamour_xiapu.shopping.NanJieBaiHuoActivity;
import com.pjq.glamour_xiapu.shopping.TaiKangLuActivity;

import android.content.Context;
import android.content.Intent;
import android.view.View; 

public class ShoppingListClickListener extends MyClickListener {
	
	private Context context;
	
	public ShoppingListClickListener(Context context) {
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
			intent.setClass(context, LongShouLuActivity.class);
			context.startActivity(intent);
			break;
		case 1:
			Intent intent2 = new Intent();
			intent2.setClass(context, BuXingJieActivity.class);
			context.startActivity(intent2);
			break;
		case 2:
			Intent intent3 = new Intent();
			intent3.setClass(context, TaiKangLuActivity.class);
			context.startActivity(intent3);
			break;
		case 3:
			Intent intent4 = new Intent();
			intent4.setClass(context, BaiShengActivity.class);
			context.startActivity(intent4);
			break;
		case 4:
			Intent intent5 = new Intent();
			intent5.setClass(context, NanJieBaiHuoActivity.class);
			context.startActivity(intent5);
			break;  

		}

	}
	
}