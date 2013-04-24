package com.pjq.glamour_xiapu.hotel;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class HuanDaoActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ������ϼ���ػ�����Ƶ�λ��̫��ɽ����´��ϼ��������������ģ�" +
			"��ϼ������ʤ�����Ϫ��15���ӳ��̣�" +
			"����������ʤ��̫��ɽ��20���ӳ���.�Ǹ��ݡ����š�Ȫ�ݵȵ�����̫��ɽ��," +
			"�����Ϫ��������ѡ����齾Ƶꡣ\n" + 
			"         ϼ�ֻ�����Ƶ��ܽ������12083ƽ���ף�һ��Ϊ�Ƶ���ã�" +
			"����Ϊ�����������������ΪKTV����Ͷ๦������" +
			"�Ĳ���ʮ���㹲��147��/�ױ�׼�ͺ����ͷ���" +
			"��һ�Ҽ�ס�ޡ����������֡�������һ��Ķ�Ԫ����չ�ľƵꡣ";
	private String hotelTraffic = 
		"�Ƶ�λ������ϼ���أ�����·��ɽ��·���㴦�����п���ϼ������վ����ͨ����.\n" +
		"- ����ϼ������վ1.2���\n" +
		"- ���븣�ݳ��ֹ��ʻ���Լ177���\n" +
		"- ����ϼ�ֻ�վ5.2���";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hotel_huandao);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_huandao_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_huandao_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
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
