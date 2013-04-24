package com.pjq.glamour_xiapu.fun;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class TonyYiShouGeActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         位于福宁大道吃喝玩乐住一条街，世纪景园旁同一首歌是一家高档娱乐KTV；" +
		"内设43于间豪华包厢，全进口音响设备，前卫的点歌系统；一流的服务理念；" +
		"欧式装修风格，打造杨浦第一娱乐品牌；百余位漂亮佳丽期待您的光临；" +
		"是您朋友聚会及客户宴请的尊贵选择。\n";
	private String hotelTraffic = 
		"霞浦县福宁大道世纪锦园旁 ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_fun_tongyishouge);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_tongyishouge_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_tongyishouge_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_tongyishouge_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_tongyishouge_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_tongyishouge_tabthree:
				textView.setText("18059314833");
				break;
			}
			
		}
		
	}
}
