package com.pjq.glamour_xiapu.fun;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.os.Bundle;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class BaiDuKTVActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         霞浦百度音乐会所，本会所秉持“尊贵、欢乐、时尚、”的经营理念，以透明、自助，" +
		"人性化的娱乐休闲模式，重金打造福宁城顶级娱乐王朝。\n"+
		"         百度音乐会所位于景缘居对面，包间比较大，设施新，歌曲更新速度快，隔音设施也不错，" +
		"服务比较周到，是三五好友小聚消磨时间的好去处。服务热情周到外，还会主动推荐最新优惠活动感觉很贴心。\n";
	private String hotelTraffic = 
		"霞浦县福宁大道景缘居对面 ";
    private TextView mTxtTitle;
    private ImageView mImgviewBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.baiduktv);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_baiduktv_textView_tab);
		mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_baiduktv_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        mTxtTitle.setText("百度音乐会所");

        mImgviewBack = (ImageView) this.findViewById(R.id.title_imgview_back);
        mImgviewBack.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_baiduktv_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_baiduktv_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_baiduktv_tabthree:
				textView.setText("13626986566");
				break;
			}
		}
	}
}
