package com.pjq.glamour_xiapu.restaurant;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class TianTianMianGuanActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         这里的三鲜面味道很鲜，因为老板都是用活虾来煮的。" +
			"在霞浦这样的小县城老板已经开起了分店了,生意好的没话说。\n\n" +
			"推荐菜：三鲜面\n\n" +
			"营业时间：全天 \n\n" +
			"人均消费：10（元）";
	private String hotelTraffic = 
		"福建省宁德市霞浦县东吾路186号（新东方大酒店旁）";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_restaurant_tiantianmianguan);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_tiantianmianguan_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_tiantianmianguan_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_tiantianmianguan_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_tiantianmianguan_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_tiantianmianguan_tabthree:
				break;
			}
			
		}
		
	}
}
