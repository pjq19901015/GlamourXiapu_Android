package com.pjq.glamour_xiapu.traffic;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class AirportActivity extends Activity {
	private TextView textView;
	private String message = 
		"         海西经济区合理布局支线机场的要求，近期按4C飞行区等级，" +
		"抓好宁德霞浦机场民航扩建工程建设，争取2015年前建成，满足B737、A320、MD90等系列I、" +
		"II类飞机起降。有序开辟国内大中城市航线，积极拓展民航业务。" +
		"到2015年，力争旅客吞吐量达30万人次，货邮吞吐量达0.3万吨。";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_ariport);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_airport_textview);
		textView.setText(message);
	}
	
}
