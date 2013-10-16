package com.pjq.glamour_xiapu.restaurant;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class YanTianDaDiActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         位于城乡那种的市中心的店，都是霞浦的特色产，" +
			"海鲜也很多的，霞浦的菜，口味比较偏甜。"+
			"最想推荐的就是她们家的糯米蒸饭，里面有很多配料，青豆，玉米，香菇，蟹棒，方肠等等，" +
			"糯米饭很想，吃的来很有嚼头，糯糯得很好吃；" +
			"他们的醋溜油炸带鱼，味道也很不错，酸酸甜甜的，带鱼也很大条，还挺新鲜的；" +
			"三鲜冻豆腐汤：汤汁很鲜美，豆腐应该用得老豆腐吧，总体感觉还不错," +
			"他们家的饭也很有特色，有铁饭盒蒸的，一人一份，量挺大的\n\n" +
			"推荐菜：牛腩煲，醋溜带鱼，椒盐小鱿鱼，苦菜小肠汤，糯米蒸饭\n\n" +
			"营业时间：晚上 \n\n" +
			"人均消费：50（元）";
	private String hotelTraffic = 
		"福建省宁德市霞浦县太康路120号（霞浦县第二小学对面）";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.yantiandadi);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_yantiandadi_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_yantiandadi_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("盐田大弟排挡");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_yantiandadi_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_yantiandadi_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_yantiandadi_tabthree:
				break;
			}
			
		}
		
	}
}
