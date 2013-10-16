package com.pjq.glamour_xiapu.hotel;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class Su8Activity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         速8酒店（霞浦国谊店）位于霞浦商务中心区域，" +
			"地理位置优越，交通便利，环境优美。酒店拥有格调高雅清新时尚的客房，装修考究、时尚别致、" +
			"极具个性化，感觉温馨舒适。每间客房配备有液晶电视，迷你吧台、免费国内长途、" +
			"24小时热水循环系统等，豪华房、套房配有电脑15兆高速光钎宽带免费上网。" +
			"酒店为您提供干净营养美味的免费自助早餐，大堂免费上网区可供您及时掌握咨询。" +
			"免费的停车场为您的出行带来便捷。";
	private String hotelTraffic = 
		"酒店位于山河路及东吾路交叉口，邻近霞浦汽车站、同三高速公路，交通便利。\n" +
		"- 距离霞浦火车站4.4公里；\n" +
		"- 距离福州长乐国际机场约176公里；\n" +
		"- 距离霞浦汽车站1.7公里。";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.su8);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_su8_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_su8_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("速8");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_hotel_su8_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_hotel_su8_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_hotel_su8_tabthree:
				break;
			}
			
		}
		
	}
}
