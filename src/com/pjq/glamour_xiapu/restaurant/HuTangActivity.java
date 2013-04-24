package com.pjq.glamour_xiapu.restaurant;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class HuTangActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         一碗糊汤、一碟蒸饺，这应该是霞浦街头最常见的早餐形式了。" +
			"直到今天，令不少出门在外的霞浦人怀念的，仍然是那一碗带着家乡味道的糊汤。" +
			"开在王爷宫旁边的这家绝对是霞浦地道的口味。" +
			"每晚早餐和夜宵的时间，你就得排队等位子了。\n\n" +
			"推荐菜：糊汤，饺子，煎包，糯米饭，炒粉。\n\n" +
			"营业时间：一天24小时 \n\n" +
			"人均消费：5-8（元）";
	private String hotelTraffic = 
		"福建省宁德市霞浦县府前路271号（利民电器制冷维修旁）";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_restaurant_hutang);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_hutang_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_hutang_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_hutang_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_hutang_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_hutang_tabthree:
				break;
			}
			
		}
		
	}
}
