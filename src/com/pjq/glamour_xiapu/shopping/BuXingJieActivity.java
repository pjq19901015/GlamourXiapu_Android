package com.pjq.glamour_xiapu.shopping;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class BuXingJieActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         龙首路步行街是霞浦的精品店集中的名街,汇集了各种品牌服饰、婚纱摄影、咖啡座等," +
		"是白天或晚上大家都喜欢的商业步行街,曾经有段时间这条街卫生环境较差,地面几乎没有清洗过," +
		"日前中乘社区对步行街重新进行了整顿,每天有专人清洗地面,摆放了许多鲜花和盆景等,让步行街变了容颜," +
		"现在我每天经过这里都能感觉到步行街浓浓的人情味,毕竟有人管理就好多了,也希望大家以后多爱护公共设施," +
		"爱护环境,让步行街不断发出迷人的异彩.\n\n" ;
	private String hotelTraffic = 
		"福建省宁德市霞浦县迎客松宾馆 ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_shopping_buxingjie);
		
		textView = (TextView) this.findViewById(R.id.activity_shopping_buxingjie_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_shopping_buxingjie_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_shopping_buxingjie_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_shopping_buxingjie_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_shopping_buxingjie_tabthree:
				break;
			}
			
		}
		
	}
}
