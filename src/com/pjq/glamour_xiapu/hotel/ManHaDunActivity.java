package com.pjq.glamour_xiapu.hotel;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class ManHaDunActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ����ϼ�������ٴ�Ƶ���һ�Һ�������Ƶ꣬" +
			"������ϼ���������ҵ�֡���̫��·�ϡ��Ƶ�װ�޺������ţ������ӱ���£��ͷ�װ�޾��¹�����" +
			"���д���ĻҺ�����ӻ������ǵ���Ƶ�����յ������������С�ưɵ���ʩ��" +
			"����ֱ���绰��ѳ��򣬸���24Сʱ����ϵĸ߼���ԡ�豸��" +
			"�ɳ������߶˱��͵ľ�ͣ��������Ҫ��\n" + 
			"         �Ƶ�ע�ؿ�����ס�ڼ��˽���ԣ��ṩ��ܰ��׿Խ�ľƵ����" +
			"ʹÿλ���Ͷ���ӵ�о���Ƿ�����ס���顣";
	private String hotelTraffic = 
		"�Ƶ�λ������ϼ���أ�̫��·��Ŀ��·���㴦�����п���ϼ������վ����ͨ����.\n" +
		"- �������»�վ73.6���\n" +
		"- ���븣�ݳ��ֹ��ʻ���Լ176���\n" +
		"- ����ϼ������վ990�ס�";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hotel_manhadun);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_manhadun_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_manhadun_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_hotel_manhadun_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_hotel_manhadun_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_hotel_manhadun_tabthree:
				break;
			}
			
		}
		
	}
}
