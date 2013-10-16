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


public class XiongDiHuoGuoActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ������ϼ������һ�һ���ꡣ���Ʋ���ˮ����㣬" +
			"�������ˮ������õ��㲻һ������ҵ��õ��Ǻ��㣬�����ۣ����Ҵ��١�\n\n" +
			"�Ƽ��ˣ�ˮ����㣬�����\n\n" +
			"Ӫҵʱ�䣺���� \n\n" +
			"�˾����ѣ�50��Ԫ��";
	private String hotelTraffic = 
		"����ʡ������ϼ����̫��·596�ţ����мұ����Աߣ�";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.xiongdihuoguo);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_xiongdihuoguo_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_xiongdihuoguo_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("�ֵܻ��");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_xiongdihuoguo_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_xiongdihuoguo_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_xiongdihuoguo_tabthree:
				break;
			}
			
		}
		
	}
}
