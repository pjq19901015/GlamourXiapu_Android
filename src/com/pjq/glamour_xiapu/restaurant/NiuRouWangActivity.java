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
	private String hotelMessage = "         只在晚上经营，也是一家老店了。那里的除了牛肉丸、还有牛杂，牛排，" +
			"最好吃的是牛肉丸和牛排，其他的一般，牛肉丸一碗7元，牛杂12元，牛排15元.\n\n" +
			"推荐菜：牛肉丸，拌面，牛杂，牛排。\n\n" +
			"营业时间：晚上 \n\n" +
			"人均消费：10-15（元）";
	private String hotelTraffic = 
		"福建省宁德市霞浦县龙首路61号（肯得利旁那条小巷进去 ）";
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
