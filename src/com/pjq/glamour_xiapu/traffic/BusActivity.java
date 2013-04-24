package com.pjq.glamour_xiapu.traffic;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class BusActivity extends Activity {
	private TextView textView;
	private String message = 
		"         霞浦县县城的公交基本上完成空调车的升级，实行单一票价一元，" +
		"霞浦目前拥有几十条公共汽车线路，是霞浦主要交通方式之一\n\n";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_bus);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_bus_textview);
		textView.setText(message);
	}
	
}
