package com.pjq.glamour_xiapu.hotel;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.pjq.listener.BackClickListener;


public class HuanDaoActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         宁德市霞浦县环岛大酒店位于太姥山脉南麓的霞浦县最繁华的市中心，" +
			"距霞浦旅游胜地杨家溪仅15分钟车程，" +
			"跟福鼎旅游胜地太姥山仅20分钟车程.是福州、厦门、泉州等地至“太姥山”," +
			"“杨家溪”旅游首选的下榻酒店。\n" + 
			"         霞浦环岛大酒店总建筑面积12083平方米，一层为酒店大堂；" +
			"二层为餐厅和宴会厅；三层为KTV包厢和多功能厅；" +
			"四层至十二层共有147间/套标准和豪华客房，" +
			"是一家集住宿、餐饮、娱乐、会议于一身的多元化发展的酒店。";
	private String hotelTraffic = 
		"酒店位于宁德霞浦县，龙首路与山河路交汇处，步行可至霞浦汽车站，交通便利.\n" +
		"- 距离霞浦汽车站1.2公里；\n" +
		"- 距离福州长乐国际机场约177公里；\n" +
		"- 距离霞浦火车站5.2公里。";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.huandao);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_huandao_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_huandao_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("环岛大酒店");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_hotel_huandao_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_hotel_huandao_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_hotel_huandao_tabthree:
				break;
			}
			
		}
		
	}
}
