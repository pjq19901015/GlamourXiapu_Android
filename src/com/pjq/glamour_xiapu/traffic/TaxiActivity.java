package com.pjq.glamour_xiapu.traffic;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class TaxiActivity extends Activity {
	private TextView textView;
	private TextView textView1; 
	private String message = 
		"         ϼ�ֳ��⳵��ɣ����ϵ��Ϊ����Ҳ�������صȳ��ͣ��۸����ͨ���⳵��ͬ����������������Ҫ��ǰԤ����" +
		"���⳵���𲽼�Ϊ6Ԫ��3���������3�����ÿ����Ƽ�1.5Ԫ\n\n";
	private String message1 = 
		"         �������ϼ�ֹ��ϵĽ�ͨ���ߣ����񻹴��ڡ��𲽼�5Ԫ\n\n" +
		"         Ħ�ģ��𲽼�4Ԫ��";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_taxi);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_taxi_textview);
		textView1 = (TextView) this.findViewById(R.id.activity_traffic_taxi_textview1); 
		textView.setText(message);
		textView1.setText(message1);  
	}
	
}
