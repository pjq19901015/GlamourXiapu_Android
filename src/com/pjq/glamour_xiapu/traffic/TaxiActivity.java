package com.pjq.glamour_xiapu.traffic;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class TaxiActivity extends BaseActivity {
	private TextView textView;
	private TextView textView1; 
	private String message = 
		"         霞浦出租车以桑塔纳系列为主，也有帕萨特等车型，价格和普通出租车相同，但部分特许车型需要提前预定。" +
		"出租车的起步价为6元（3公里），超过3公里后每公里计价1.5元\n\n";
	private String message1 = 
		"         红包车：霞浦古老的交通工具，至今还存在。起步价5元\n\n" +
		"         摩的：起步价4元。";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.taxi);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_taxi_textview);
		textView1 = (TextView) this.findViewById(R.id.activity_traffic_taxi_textview1); 
		textView.setText(message);
		textView1.setText(message1);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("出租车");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
}
