package com.pjq.glamour_xiapu.traffic;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class DeportActivity extends Activity {
	private TextView textView;
	private String message = 
		"         霞浦站 距县城4公里左右，建筑呈仿唐风格。站房总建筑面积3100" +
		"多平方米，普通候车室面积760多平方米，未设软席候车室和贵宾室，最"+
		"高聚集人数为600人。\n\n" +
		"         温福铁路线是国家重点建设项目，" +
		"是国家中长期铁路网规划“四纵四横”客运快速通道之一，" +
		"属国家Ⅰ级双线电气化铁路。它北起浙江省温州市，" +
		"经瑞安、平阳、苍南、福鼎、霞浦、福安、宁德、罗源、连江，南至福州市，" +
		"线路全长约298公里。该工程从2004年12月动工，经过4年多的建设，" +
		"于今年6月30日率先开通货运，28日正式开通客运。其中霞浦境内全长41.858公里，" +
		"途经牙城、三沙、松港、盐田4个乡镇，先后跨越赤溪、罗汉溪、杯溪三条溪流，" +
		"穿过大湾山、青沃山、霞浦、黄土岭、官岭尾五条隧道，总投资约25.29亿元。" +
		"尤其霞浦隧道是全国铁路客运专线目前贯通第二长的隧道、东南沿海铁路最长的隧道，全长13.1公里"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_deport);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_deport_textview);
		textView.setText(message);
	}
	
}
