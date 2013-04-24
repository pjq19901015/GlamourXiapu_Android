package com.pjq.glamour_xiapu.fun;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class FuNingParkActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         福宁公园，位于霞浦县新城区，东至赤岸大道，南至三河，西至东吾路，北至山河路，" +
		"规划面积约19.7公顷；拟建成集浏览、健身、观光、休闲娱乐、文化艺术、" +
		"科普教育等多位一体的市级城市综合性公园；体现霞浦海洋风情和历史文化两大主题。\n"+
		"         河南岸景观带，位于三河南侧，东至三河与高速公路交界处，" +
		"南至高速公路，西至周家亭桥，北至三河，规划长度约2500米，" +
		"面积约13公顷；分盆景园和儿童公园两大部分。\n" +
		"         南峰山公园，位于县城南面，东至职业中专学校，南至面域一重山，" +
		"西至宏翔高级中学学校，北至高速公路，规划面积约70公顷（其中核心景区约11公顷），" +
		"在现有寺庙园林建筑和自然植被等景观资源基础上，拟建成集观光游览、登山健身、宗教朝拜、" +
		"休闲娱乐等多位一体的山地休闲公园，其中含烈士陵园区。\n\n" ;
	private String hotelTraffic = 
		"福建省宁德市霞浦县福宁长途汽车站对面 ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_fun_funingpark);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_funingpark_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_funingpark_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_funingpark_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_funingpark_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_funingpark_tabthree:  
				break;
			}
			
		}
		
	}
}
