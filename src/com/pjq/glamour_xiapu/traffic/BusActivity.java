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
		"         ϼ�����سǵĹ�����������ɿյ�����������ʵ�е�һƱ��һԪ��" +
		"ϼ��Ŀǰӵ�м�ʮ������������·����ϼ����Ҫ��ͨ��ʽ֮һ\n\n";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_bus);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_bus_textview);
		textView.setText(message);
	}
	
}
