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
		"         ����������������֧�߻�����Ҫ�󣬽��ڰ�4C�������ȼ���" +
		"ץ������ϼ�ֻ������������̽��裬��ȡ2015��ǰ���ɣ�����B737��A320��MD90��ϵ��I��" +
		"II��ɻ��𽵡����򿪱ٹ��ڴ��г��к��ߣ�������չ��ҵ��" +
		"��2015�꣬�����ÿ���������30���˴Σ�������������0.3��֡�";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_ariport);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_airport_textview);
		textView.setText(message);
	}
	
}
