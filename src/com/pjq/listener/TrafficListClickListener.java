package com.pjq.listener;
 
import com.pjq.glamour_xiapu.traffic.AirportActivity;
import com.pjq.glamour_xiapu.traffic.BusActivity;
import com.pjq.glamour_xiapu.traffic.DeportActivity;
import com.pjq.glamour_xiapu.traffic.StreetActivity;
import com.pjq.glamour_xiapu.traffic.TaxiActivity;
import com.pjq.glamour_xiapu.traffic.WaterTransportationActivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class TrafficListClickListener implements OnClickListener {
	
	private Context context;
	
	public TrafficListClickListener(Context context) {
		this.context = context;
	}
	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch(id){
		case 0:
			Intent intent = new Intent();
			intent.setClass(context, AirportActivity.class);
			context.startActivity(intent);
			break;
		case 1:
			Intent intent2 = new Intent();
			intent2.setClass(context, DeportActivity.class);
			context.startActivity(intent2);
			break;
		case 2:
			Intent intent3 = new Intent();
			intent3.setClass(context, BusActivity.class);
			context.startActivity(intent3);
			break;
		case 3:
			Intent intent4 = new Intent();
			intent4.setClass(context, StreetActivity.class);
			context.startActivity(intent4);
			break;
		case 4:
			Intent intent5 = new Intent();
			intent5.setClass(context, TaxiActivity.class);
			context.startActivity(intent5);
			break;  
		case 5:
			Intent intent6 = new Intent();
			intent6.setClass(context, WaterTransportationActivity.class);
			context.startActivity(intent6);
			break;

		}

	}
	
	
}