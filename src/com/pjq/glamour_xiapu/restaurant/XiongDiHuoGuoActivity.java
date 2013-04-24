package com.pjq.glamour_xiapu.restaurant;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class XiongDiHuoGuoActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         不解释霞浦最火的一家火锅店。招牌菜是水煮活鱼，" +
			"与外面的水煮活鱼用的鱼不一样，这家店用的是黑鱼，鱼肉嫩，滑且刺少。\n\n" +
			"推荐菜：水煮活鱼，酸菜鱼\n\n" +
			"营业时间：晚上 \n\n" +
			"人均消费：50（元）";
	private String hotelTraffic = 
		"福建省宁德市霞浦县太康路596号（家中家宾馆旁边）";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_restaurant_xiongdihuoguo);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_xiongdihuoguo_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_xiongdihuoguo_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_xiongdihuoguo_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_xiongdihuoguo_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_xiongdihuoguo_tabthree:
				break;
			}
			
		}
		
	}
}
