package com.pjq.glamour_xiapu.site;


import android.widget.ImageView;
import android.widget.TextView;
import com.pjq.adapter.ListViewAdapter;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;
import com.pjq.listener.SiteListClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class SiteActivity extends BaseActivity {
	private ListView listView;
	private int[] imageID = new int[]{
			R.drawable.yangjiaxi,R.drawable.xiyangdao,
			R.drawable.liuyunsi,R.drawable.gaoluo,
			R.drawable.tantu
	}; 
	
	//存放各功能的名称
	private String[] illustrates = new String[]{
			"杨家溪","西洋岛",
			"流云寺","高罗",
			"霞浦滩涂"
	};
	private int item;  //listView 子view的布局文件ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener siteListClcikListener;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.site);
		
		item = R.layout.site_item;
		imageViewID = R.id.activity_site_item_imageview;
		textViewID = R.id.activity_site_item_textview_title;
		siteListClcikListener = new SiteListClickListener(this);
		
		listView = (ListView) this.findViewById(R.id.activity_site_listview);
		listView.setAdapter(new ListViewAdapter(this,imageID,illustrates,item,
												imageViewID,textViewID,siteListClcikListener));
		
		//Utility.setListViewHeightBasedOnChildren(listView);//重新计算Listview的高度
        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("景点");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
}
