package com.pjq.glamour_xiapu.hotel;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class ManHaDunActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         宁德霞浦曼哈顿大酒店是一家豪华商务酒店，" +
			"座落于霞浦最繁华的商业街——太康路上。酒店装修豪华典雅，格局新颖别致，客房装修精致瑰丽，" +
			"设有大屏幕液晶电视机、卫星电视频道、空调、宽带上网、小酒吧等设施，" +
			"国内直拨电话免费畅打，更有24小时不间断的高级淋浴设备，" +
			"可充分满足高端宾客的居停与休闲需要。\n" + 
			"         酒店注重客人入住期间的私密性，提供温馨、卓越的酒店服务，" +
			"使每位宾客都能拥有尽享非凡的入住体验。";
	private String hotelTraffic = 
		"酒店位于宁德霞浦县，太康路与目海路交汇处，步行可至霞浦汽车站，交通便利.\n" +
		"- 距离宁德火车站73.6公里；\n" +
		"- 距离福州长乐国际机场约176公里；\n" +
		"- 距离霞浦汽车站990米。";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hotel_manhadun);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_manhadun_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_manhadun_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_hotel_manhadun_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_hotel_manhadun_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_hotel_manhadun_tabthree:
				break;
			}
			
		}
		
	}
}
