package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class GaoLuoActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         高罗海滨度假村位于霞浦县东南，面临浩瀚的太平洋，距县城35公里。" +
			"宽阔沙滩长达2000余米，面积90公顷。碧波荡漾，舣天舟点点，海鸟成群。" +
			"海面上星罗棋布的大小岛屿风光秀丽、美不胜收，构成一幅幅天然的海景画卷.\n" +
			"         度假村座落于海滩林荫之中，更具天然质朴的格调。" +
			"海鲜楼、茶座、客房，淡水沐浴室、美容按摩厅、快艇、游船等旅游设施齐全。" +
			"游客心情享受天然海水浴、日光浴，清晨观看日出，夜晚聆听涛声，白天林中吕茗，" +
			"亦可在沙滩开展排球、足球、放风筝等有益寿身心健康的活动。" +
			"抑或乘快艇在海上自由飞驰、上岛探险、观礁、垂钓、拾贝、摸螺，更富情趣和刺激。\n" +
			"         乘游艇在海上乐园游览，一个又一个美丽的岛屿从身边掠过。登上对岸的鲸沙岛，" +
			"海滩上散布着奇形怪状的卵石，叫人爱不释手。" +
			"岛上礁石嶙峋，洞穴奇特，有海龙洞、桃子峰、插平峰、狮子屿等景点，形状惟妙惟肖。" +
			"退潮时，游客们在礁石中捡螺、挖海蛎，抓小蟹，到岸边钓鱼，" +
			"然后用收获的“战利品”进行烧烤，其乐无穷。\n" +
			"         高罗海滩边还有绿荫醉人的天然防护林，有铁树、棕树、剑麻、木麻黄等1．2万多株，" +
			"筑成了绿色的屏障。夏天人们在树林里乘凉，玩游戏，别有一番情趣。" +
			"轻松自在、享受自然、搏击大海、体验人生——高罗海滨度假村的真正含义。";
	private String hotelTraffic = 
		"1.霞浦到高罗大概一个小时左右，但是直达高罗的班车就早上9点左右和中午两点半左右的。票价13元\n" +
		"2.在车站做区间车，到小溪下，打摩的进去。";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_gaoluo);
		
		textView = (TextView) this.findViewById(R.id.activity_site_gaoluo_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_gaoluo_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_gaoluo_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_gaoluo_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_gaoluo_tabthree:
				break;
			}
			
		}
		
	}
}
