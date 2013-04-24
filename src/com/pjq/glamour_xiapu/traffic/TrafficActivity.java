package com.pjq.glamour_xiapu.traffic;


import com.pjq.adapter.ListViewAdapter;
import com.pjq.glamour_xiapu.R;
import com.pjq.listener.HotelListClickListener; 
import com.pjq.listener.TrafficListClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class TrafficActivity extends Activity {
	private ListView listView;
	private int[] imageID = new int[]{
			R.drawable.traffic_airport, R.drawable.traffic_deport,
			R.drawable.traffic_bus, R.drawable.traffic_jiedao_funing,
			R.drawable.traffic_taxi,R.drawable.traffic_ship
	}; 
	
	//存放各功能的名称
	private String[] illustrates = new String[]{
			"航空","铁路",
			"公交","街道",
			"出租车","水上交通"
	};
	private int item;  //listView 子view的布局文件ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener siteListClcikListener;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic);
		
		item = R.layout.activity_traffic_item;
		imageViewID = R.id.activity_traffic_item_imageview;
		textViewID = R.id.activity_traffic_item_textview_title;
		siteListClcikListener = new TrafficListClickListener(this);
		
		listView = (ListView) this.findViewById(R.id.activity_traffic_listview);
		listView.setAdapter(new ListViewAdapter(this,imageID,illustrates,item,
												imageViewID,textViewID,siteListClcikListener));
		
	}
}
