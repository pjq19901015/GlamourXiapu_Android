package com.pjq.glamour_xiapu.shopping;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class BaiShengActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         马来西亚金狮集团是信誉卓著、业务多元化、国际化的工商集团，近十年来发展迅速，" +
		"成为跨国集团之一，组织健全，资金雄厚。业务范围囊括制造、贸易、零售、房地产、金融服务与资讯科技等领域。" +
		"旗下有二百余家公司及关系企业。集团属下'百盛'为马来西亚百货公司兼超级市场.\n"+
		"         百盛是马来西亚金狮集团与1987年创立的大型百货零售连锁企业，为金狮集团中零售业及贸易的一部分,"+
		"在二十年前的时间里发展显著。连锁百货店遍设马来西亚主要城市，" +
		"至今已在马来西亚各大城市开设了34间购物中心和大型超级市场，" +
		"成为马来西亚百货店最大，最成功的零售连锁集团。" +
		" 2004年7月17日开始试营业的霞浦百盛购物广场是百盛集团再中国开设的第38家分店。" +
		"它以明确的时尚定位和优雅的购物环境赢得了消费者的青昧，同时也为霞浦这个美丽的城市更添风采，" +
		"让霞浦人民再此彻底的真正体验享受消费这一时尚而温馨的消费概念。\n\n" ;
	private String hotelTraffic = 
		"福建省宁德市霞浦县龙首路218号  ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.baisheng);
		
		textView = (TextView) this.findViewById(R.id.activity_shopping_baisheng_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_shopping_baisheng_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("百盛");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_shopping_baisheng_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_shopping_baisheng_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_shopping_baisheng_tabthree:
				break;
			}
			
		}
		
	}
}
