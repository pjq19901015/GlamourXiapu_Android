package com.pjq.glamour_xiapu.restaurant;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class TianTianMianGuanActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         �����������ζ�����ʣ���Ϊ�ϰ嶼���û�Ϻ����ġ�" +
			"��ϼ��������С�س��ϰ��Ѿ������˷ֵ���,����õ�û��˵��\n\n" +
			"�Ƽ��ˣ�������\n\n" +
			"Ӫҵʱ�䣺ȫ�� \n\n" +
			"�˾����ѣ�10��Ԫ��";
	private String hotelTraffic = 
		"����ʡ������ϼ���ض���·186�ţ��¶�����Ƶ��ԣ�";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_restaurant_tiantianmianguan);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_tiantianmianguan_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_tiantianmianguan_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_tiantianmianguan_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_tiantianmianguan_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_tiantianmianguan_tabthree:
				break;
			}
			
		}
		
	}
}
