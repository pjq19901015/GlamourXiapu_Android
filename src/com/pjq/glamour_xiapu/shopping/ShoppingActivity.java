package com.pjq.glamour_xiapu.shopping;
import android.widget.ImageView;
import android.widget.TextView;
import com.pjq.adapter.ListViewAdapter;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;
import com.pjq.listener.ShoppingListClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ListView;

public class ShoppingActivity extends BaseActivity {
	private ListView listView;
	private int[] imageID = new int[]{
			R.drawable.traffic_jiedao_longshoulu,R.drawable.shopping_buxingjie,
			R.drawable.traffic_jiedao_funing,R.drawable.shopping_baisheng,
			R.drawable.shopping_nanjiebaihuo
	}; 
	
	//��Ÿ����ܵ�����
	private String[] illustrates = new String[]{
			"����·","���н�",
			"̫��·","��ʢ��������",
			"�Ͻְٻ�"
	};

	private int item;  //listView ��view�Ĳ����ļ�ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener listClcikListener;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.shopping);
		
		item = R.layout.shopping_item;
		imageViewID = R.id.activity_shopping_item_imageview;
		textViewID = R.id.activity_shopping_item_textview_title;
		listClcikListener = new ShoppingListClickListener(this);
		
		listView = (ListView) this.findViewById(R.id.activity_shopping_listview);
		listView.setAdapter(new ListViewAdapter(this,imageID,illustrates,item,
												imageViewID,textViewID,listClcikListener));
        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("����");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
}
