package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class XiapuTantuActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         距霞浦县城五公里，是有名的紫菜养殖场。" +
			"依山坡而行，印入眼帘的是一排排错落有致的小舟鱼网，点缀其中的浮标竹竿，" +
			"穿梭忙碌的一叶小舟，和对面连绵的山峰。走上坡顶，豁然开阔，远处模糊的岛屿与近处成片的鱼网，" +
			"浑然一体，好一幅壮观的场景。当海水退潮，滩头的纹理也初见端倪。那霞光映衬下长长的倒影，" +
			"好似优美的舞者在流动；蓝天白云下的光彩，在鱼网、浮标、竹竿间穿梭，那明与暗的交替，" +
			"加上波光鳞鳞的海面，一叶小舟游离其中，让人如痴如醉。\n" +
			"         每当随着太阳的下沉，插在滩涂的竹竿和大面积的海带网渐渐也露出水面时，" +
			"遥望这片滩涂连接天际的滩涂，海风拂过，顿生“心旷神怡，宠辱皆忘”的心境。";
	private String hotelTraffic = "         在新建的霞浦一中对面，北歧村的后山的山路就可以徒步到达拍摄点"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_xiaputantu);
		
		textView = (TextView) this.findViewById(R.id.activity_site_xiaputantu_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_xiaputantu_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_xiaputantu_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_xiaputantu_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_xiaputantu_tabthree:
				break;
			}
			
		}
		
	}
}
