package com.pjq.glamour_xiapu.traffic;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class BusActivity extends BaseActivity {
	private TextView textView;
	private String message = 
		"         ϼ�����سǵĹ�����������ɿյ�����������ʵ�е�һƱ��һԪ��" +
		"ϼ��Ŀǰӵ�м�ʮ������������·����ϼ����Ҫ��ͨ��ʽ֮һ\n\n";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.bus);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_bus_textview);
		textView.setText(message);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("����");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
}
