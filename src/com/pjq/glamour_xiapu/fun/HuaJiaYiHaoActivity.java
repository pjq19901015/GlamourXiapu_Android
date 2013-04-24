package com.pjq.glamour_xiapu.fun;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class HuaJiaYiHaoActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         一是向人们宣染文化内涵，二是提供休闲、娱乐、文化活动的场所。\n"+
		"         二是一个城市的文化广场常被比作这个城市的“会客厅”，" +
		"它不但是展示城市文化的窗口，也是吸引游人的一道风景。\n" +
		"         三是城市文化广场是以突出文化主题而在城市中人为设置以提供市民公共活动休闲学习，" +
		"改善城市环境具有多重社会文化含义的一种现代开放空间。城市文化广场的建设作为一种公共文化事业，" +
		"与当地历史、文化相结合对本地文化和各地外来文化起到了传承、开拓、创新的作用，" +
		"达到了本地居民外地居民聚集、交流、引导的目的。\n\n" ;
	private String hotelTraffic = 
		"福建省宁德市霞浦县太康路116号 ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_fun_huangjiayihao);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_huangjiayihao_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_huangjiayihao_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_huangjiayihao_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_huangjiayihao_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_huangjiayihao_tabthree:
				textView.setText("电话：0593-8876668");
				break;
			}
			
		}
		
	}
}
