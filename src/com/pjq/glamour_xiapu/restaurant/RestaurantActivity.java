package com.pjq.glamour_xiapu.restaurant;


import android.widget.ImageView;
import android.widget.TextView;
import com.pjq.adapter.ListViewAdapter;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;
import com.pjq.listener.RestaurantListClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class RestaurantActivity extends BaseActivity{
	private ListView listView;
	private int[] imageID = new int[]{
			R.drawable.hutang,R.drawable.niurouwang,
			R.drawable.tiantianmianguan,R.drawable.xiongdihuoguo,
			R.drawable.yantiandadi
	}; 
	
	//存放各功能的名称
	private String[] illustrates = new String[]{
			"糊汤","老字号牛肉馆",
			"天天面馆","兄弟火锅",
			"盐田大弟排挡"
	};
	private int item;  //listView 子view的布局文件ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener listClcikListener;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.restaurant);
		
		item = R.layout.restaurant_item;
		imageViewID = R.id.activity_restaurant_item_imageview;
		textViewID = R.id.activity_restaurant_item_textview_title;
		listClcikListener = new RestaurantListClickListener(this);
		
		listView = (ListView) this.findViewById(R.id.activity_restaurant_listview);
		listView.setAdapter(new ListViewAdapter(this,imageID,illustrates,item,
												imageViewID,textViewID,listClcikListener));
        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("餐馆");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
}
