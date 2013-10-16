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


public class DiJingActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         霞浦帝景国际酒店介于动车站、高速路出入口及长途汽车站交汇处。" +
			"距国家4A级景区杨家溪仅20分钟车程，与国家名胜旅游区太姥山仅有30分钟的车程。" +
			"素有“海滨邹鲁”之誉的霞浦，前来摄影的人更是络绎不绝，被誉为“中国十大摄影基地”之一，" +
			"而我们酒店距所有的摄影点车程都在40分钟之内，近则仅需10分钟（北岐摄影点）。 \n" +
			"         帝景国际酒店融合霞浦当地风情和福宁文化精髓，兼具时尚，优雅与舒适。帝景酒店愿与您分享...";
	private String hotelTraffic = 
		"酒店位于宁德市霞浦县县城，太康路与赤岸大道交汇处，邻近霞浦汽车站，交通便利。\n" +
		"- 距离霞浦汽车站2.3公里；\n" +
		"- 距离福州长乐国际机场约176公里；\n" +
		"- 距离霞浦火车站3.3公里。";
    private ImageView mImgviewBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dijing);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_dijing_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_dijing_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("帝景国际酒店");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_hotel_dijing_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_hotel_dijing_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_hotel_dijing_tabthree:
				break;
			}
			
		}
		
	}
}
