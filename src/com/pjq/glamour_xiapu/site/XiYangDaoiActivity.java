package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class XiYangDaoiActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         西洋岛位于霞浦县东南海域，扼闽、浙海上交通要道之咽喉，与霞浦县城相距20海里，" +
		 "是海岛乡的一个部分，同时也是乡政府所在地。海岛乡由四礵列岛、浮鹰、西洋、魁山、马刺、小西洋等 " +
		 "43个岛屿组成，海域面积广阔，海岸线总长度为 104.5公里，陆地总面积29.8平方公里。\n" +
		 "         常年气候温和、雨量适中，属亚热带海洋性季风气候，年平均气温18℃--20℃，冬暖夏凉，年平均降水量800—1200mm ，气候宜人。\n" +
		 "         现辖6 个行政村，一个捕捞队和一个海运站，25 个自然村。总人口 12540人，是霞浦县唯一的纯渔业乡。\n" +
		 "全乡90% 以上劳力从事渔业生产，渔业收入占全乡国民经济总收入的95%以上，水产品年总量约占霞浦县捕捞总量的四分之一强。\n" +
		 "         西洋岛都是属于霞浦县的一个海岛，这里有着众多名型各异、特色不同的岛屿以及淳朴浓厚的海岛民俗风情；" +
		 "这里坐拥著名的闽东渔场，渔业资源丰富；这里扼守南北海上交通要道，濒临台湾马祖列岛，" +
		 "曾经是两岸军事斗争的前沿阵地，也是福建省最早的民间对台渔货交易点之一；" +
		 "这里出现了令敌闻风丧胆的“渔家英雄”，诞生了中国海军的雏形；这里处处是阳光、沙滩、海浪，是休闲旅游者梦中追寻的天堂。" +
		 "这里，就是中国行政版图上唯一以“海岛”命名的群岛之乡，一个养在福建省霞浦县东南沿海的“深闺秀女”。\n" +
		 "         西洋岛的历史颇有些神奇的意味。据说很久以前，也说不清是什么年代，有渔船经过这里，" +
		 "远远看到岸上有红发蓝眼的异国人，疑是到了西洋地界，于是取名“西洋岛”。" +
		 "西洋岛的水域渔产丰富，大约在一百多年前，从长乐和连江来的十八户渔民背井离乡，" +
		 "占领了这个曾经是海鸟天堂的小岛。在此扎寨捕鱼，繁衍下来，成了西洋人的开基祖先。" +
		 "我的同事小陈祖上就是从闽候浪歧岛迁徙到此的。岛上是闽东一块方言飞地，讲的全是有点变调的福州话。\n";
	private String hotelTraffic = "霞浦区间车站做班车到下浒，在下浒码头做船到西洋岛（每天一班，12:00）"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_xiyangdao);
		
		textView = (TextView) this.findViewById(R.id.activity_site_xiyangdao_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_xiyangdao_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_xiyangdao_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_xiyangdao_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_xiyangdao_tabthree:
				break;
			}
			
		}
		
	}
}
