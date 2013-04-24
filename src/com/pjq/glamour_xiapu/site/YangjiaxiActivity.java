package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class YangjiaxiActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         杨家溪位于福建太姥山西侧，其下游经霞浦县牙城镇境内。" +
			"相传北宋名将杨宗保、穆桂英的儿女杨文广与杨金花曾率兵在此平定南蛮第十八洞，" +
			"并派杨家将驻守此地，所以把此 溪叫杨家溪。\n" +
			"         杨家溪以川景幽美称著。1988年8月经国务院批准，" +
			"与太姥山山岳区并列于国家第二批重点旅游风景区之“太姥山名胜区”，" +
			"是太姥山“山、海、川“三大主景区之一。\n"+                               
			"         杨家溪景区约35平方公里，" +
			"由九鲤溪景区、龙亭瀑布景区、钱大王村区、青龙寺区、杨家溪村景区、下坪洋村区、" +
			"半岭亭区、渡头 村区和雉溪龟山村区等九个小区构成，" +
			"现更新辟位于通津古桥至环石 潭2公里长流域之间的“原野生态休闲区”，" +
			"拥有野宿、垂钓、游泳、 烧烤、美食等独具特色、雅俗共享的游乐、休闲、憩息功能区20多 个.";
private String hotelTraffic = "1、霞浦牙城下高速路按指示牌行驶(自由方便推荐)\n" +
						"2、乘坐动车到霞浦站后，出站后有公交车，上车后，在霞浦汽车北站下车（老车站），" +
						"乘坐霞浦到牙城的客车后可到牙城，之后转车到杨家溪（可以打的、摩托车、公交车等）。"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_yangjiaxi);
		
		textView = (TextView) this.findViewById(R.id.activity_site_yangjiaxi_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_yangjiaxi_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_yangjiaxi_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_yangjiaxi_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_yangjiaxi_tabthree:
				break;
			}
			
		}
		
	}
}
