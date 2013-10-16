package com.pjq.glamour_xiapu.fun;
import android.widget.ImageView;
import android.widget.TextView;
import com.pjq.adapter.ListViewAdapter;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;
import com.pjq.listener.FunListClickListener;

import android.os.Bundle;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class FunActivity extends BaseActivity {
	private ListView listView;
	private int[] imageID = new int[]{
			R.drawable.fun_whgc,R.drawable.fun_hj1h,
			R.drawable.fun_fnwhgy,R.drawable.fun_jdg,
			R.drawable.fun_bd,R.drawable.fun_tysg
	}; 
	
	//存放各功能的名称
	private String[] illustrates = new String[]{
			"文化广场","皇家一号KTV",
			"福宁文化公园","九大馆",
			"百度音乐会所","同一首歌"
	};
	
	
	private int item;  //listView 子view的布局文件ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener listClcikListener;
    private TextView mTxtTitle;
    private ImageView mImgviewBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fun);
		
		item = R.layout.fun_item;
		imageViewID = R.id.activity_fun_item_imageview;
		textViewID = R.id.activity_fun_item_textview_title;
		listClcikListener = new FunListClickListener(this);
		
		listView = (ListView) this.findViewById(R.id.activity_fun_listview);
		listView.setAdapter(new ListViewAdapter(this,imageID,illustrates,item,
												imageViewID,textViewID,listClcikListener));

        mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("娱乐");

        mImgviewBack = (ImageView) this.findViewById(R.id.title_imgview_back);
        mImgviewBack.setOnClickListener(new BackClickListener());
	}
}
