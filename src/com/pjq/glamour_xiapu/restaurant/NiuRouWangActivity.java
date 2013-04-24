package com.pjq.glamour_xiapu.restaurant;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class NiuRouWangActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ֻ�����Ͼ�Ӫ��Ҳ��һ���ϵ��ˡ�����ĳ���ţ���衢����ţ�ӣ�ţ�ţ�" +
			"��óԵ���ţ�����ţ�ţ�������һ�㣬ţ����һ��7Ԫ��ţ��12Ԫ��ţ��15Ԫ.\n\n" +
			"�Ƽ��ˣ�ţ���裬���棬ţ�ӣ�ţ�š�\n\n" +
			"Ӫҵʱ�䣺���� \n\n" +
			"�˾����ѣ�10-15��Ԫ��";
	private String hotelTraffic = 
		"����ʡ������ϼ��������·61�ţ��ϵ���������С���ȥ ��";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_restaurant_niurouwang);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_niurouwang_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_niurouwang_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_niurouwang_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_niurouwang_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_niurouwang_tabthree:
				break;
			}
			
		}
		
	}
}
