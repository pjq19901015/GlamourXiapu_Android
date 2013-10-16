package com.pjq.glamour_xiapu.traffic;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class StreetActivity extends BaseActivity {
	private TextView textView;
	private TextView textView1;
	private TextView textView2;
	private String message = 
		"         松城街道：霞浦县松城街道辖12个社区、6个行政村。省道沙吕段、小浦段过境。" +
		"1949年为松城区，1958年设松城公社，1984年建镇。1997年，面积165.5平方千米，" +
		"人口9.4万，辖西关、东关、万贤、中乘、俊星、青福、七宝洋、涌山、墓斗、宝清、" +
		"马洋、长沙、大沙、沙头、松渔、北岐、青岐、后岐、古岭下、塔下、松农、后港、利埕、" +
		"赤岸、桥头、江边、竹下、水坑、利洋、岭头、佳湖、下村、章家衕、八斗洞、小沙35个村委会和西关、" +
		"东关、万贤、中乘、俊星5个居委会。" +
		"2003年撤镇改设松城、松港2个街道。松城街道辖万贤、俊星、中乘、西关、龙贤5个居委会和万贤、" +
		"俊星、中乘、西关、青福、墓斗、涌山、马洋、宝清、七宝洋10个行政村。办事处驻原松城镇政府驻地。" +
		"东关居委会与其余25村划归松港街道。\n\n";
	private String message1 = 
		"         龙首路：霞浦最古老，最繁华的商业街，霞浦的商业中心。";
	private String message2 = 
		"         福宁大道：福宁大道是位于霞浦的新城区。\n\n" +
		"         太康路：霞浦新的商业街，连接新城区与旧城区。\n\n" +
		"         六一北路：霞浦北街，霞浦的一条老街，解放就是从这条街开始的。霞浦历史的见证。";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.street);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_street_textview);
		textView1 = (TextView) this.findViewById(R.id.activity_traffic_street_textview1);
		textView2 = (TextView) this.findViewById(R.id.activity_traffic_street_textview2);
		textView.setText(message);
		textView1.setText(message1);
		textView2.setText(message2);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("街道");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
}
