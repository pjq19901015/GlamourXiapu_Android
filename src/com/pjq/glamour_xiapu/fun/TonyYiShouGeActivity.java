package com.pjq.glamour_xiapu.fun;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class TonyYiShouGeActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         λ�ڸ�������Ժ�����סһ���֣����;�԰��ͬһ�׸���һ�Ҹߵ�����KTV��" +
		"����43�ڼ�������ᣬȫ���������豸��ǰ���ĵ��ϵͳ��һ���ķ������" +
		"ŷʽװ�޷�񣬴������ֵ�һ����Ʒ�ƣ�����λƯ�������ڴ����Ĺ��٣�" +
		"�������Ѿۻἰ�ͻ���������ѡ��\n";
	private String hotelTraffic = 
		"ϼ���ظ���������ͽ�԰�� ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_fun_tongyishouge);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_tongyishouge_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_tongyishouge_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_tongyishouge_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_tongyishouge_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_tongyishouge_tabthree:
				textView.setText("18059314833");
				break;
			}
			
		}
		
	}
}
