package com.pjq.glamour_xiapu.shopping;


import com.pjq.adapter.ListViewAdapter;
import com.pjq.glamour_xiapu.R;
import com.pjq.listener.RestaurantListClickListener;
import com.pjq.listener.ShoppingListClickListener;
import com.pjq.listener.SiteListClickListener;
import com.pjq.utils.Utility;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class ShoppingActivity extends Activity {
	private ListView listView;
	private int[] imageID = new int[]{
			R.drawable.traffic_jiedao_longshoulu,R.drawable.shopping_buxingjie,
			R.drawable.traffic_jiedao_funing,R.drawable.shopping_baisheng,
			R.drawable.shopping_nanjiebaihuo
	}; 
	
	//存放各功能的名称
	private String[] illustrates = new String[]{
			"龙首路","步行街",
			"太康路","百盛购物中心",
			"南街百货"
	};
	
	
	private int item;  //listView 子view的布局文件ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener listClcikListener;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_shopping);
		
		item = R.layout.activity_shopping_item;
		imageViewID = R.id.activity_shopping_item_imageview;
		textViewID = R.id.activity_shopping_item_textview_title;
		listClcikListener = new ShoppingListClickListener(this);
		
		listView = (ListView) this.findViewById(R.id.activity_shopping_listview);
		listView.setAdapter(new ListViewAdapter(this,imageID,illustrates,item,
												imageViewID,textViewID,listClcikListener));
		
	}
}
