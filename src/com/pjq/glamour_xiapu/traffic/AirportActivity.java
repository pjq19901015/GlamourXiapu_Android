package com.pjq.glamour_xiapu.traffic;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class AirportActivity extends BaseActivity {
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
		setContentView(R.layout.ariport);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_airport_textview);
		textView.setText(message);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("����");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
}
