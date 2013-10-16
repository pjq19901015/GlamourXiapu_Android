package com.pjq.glamour_xiapu.fun;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class JiuDaGuanActivity extends BaseActivity{
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         在霞浦县博物馆建设工地上，工人们正加紧施工。霞浦县九大馆包括博物馆、" +
		"图书馆、科技馆、影剧院等，是该县有史以来最大的民生项目，占地49.3亩，" +
		"总建筑面积57341平方米，总投资达3.5亿元，目前已投资2亿元。\n";
	private String hotelTraffic = 
		"福建省宁德市霞浦县福宁大道";
    private TextView mTxtTitle;
    private ImageView mImgviewBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.jiudaguan);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_jiudaguan_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_jiudaguan_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("九大馆");

        mImgviewBack = (ImageView) this.findViewById(R.id.title_imgview_back);
        mImgviewBack.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_jiudaguan_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_jiudaguan_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_jiudaguan_tabthree:  
				break;
			}
			
		}
		
	}
}
