package com.pjq.glamour_xiapu.hotel;


import android.widget.ImageView;
import android.widget.TextView;
import com.pjq.adapter.ListViewAdapter;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;
import com.pjq.listener.HotelListClickListener; 

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class HotelActivity extends BaseActivity{
	private ListView listView;
	private int[] imageID = new int[]{
			R.drawable.dijing, R.drawable.xindongfang,
			R.drawable.su8, R.drawable.manhadun,
			R.drawable.huandao
	}; 
	
	//存放各功能的名称
	private String[] illustrates = new String[]{
			"帝景国际酒店","新东方大酒店",
			"速8","曼哈顿大酒店",
			"环岛大酒店"
	};
	private int item;  //listView 子view的布局文件ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener siteListClcikListener;
    private ImageView mImgviewBack;
    private TextView mTxtTitle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.hotel);
		
		item = R.layout.hotel_item;
		imageViewID = R.id.activity_hotel_item_imageview;
		textViewID = R.id.activity_hotel_item_textview_title;
		siteListClcikListener = new HotelListClickListener(this);
		
		listView = (ListView) this.findViewById(R.id.activity_hotel_listview);
		listView.setAdapter(new ListViewAdapter(this,imageID,illustrates,item,
												imageViewID,textViewID,siteListClcikListener));

        mImgviewBack = (ImageView) this.findViewById(R.id.title_imgview_back);
        mImgviewBack.setOnClickListener(new BaseActivity.BackClickListener());

        mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("住宿");
	}
}
