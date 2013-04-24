package com.pjq.glamour_xiapu.fun;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class FuNingParkActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         ������԰��λ��ϼ�����³����������శ������������ӣ���������·������ɽ��·��" +
		"�滮���Լ19.7���ꣻ�⽨�ɼ�����������۹⡢�������֡��Ļ�������" +
		"���ս����ȶ�λһ����м������ۺ��Թ�԰������ϼ�ֺ���������ʷ�Ļ��������⡣\n"+
		"         ���ϰ����۴���λ�������ϲ࣬������������ٹ�·���紦��" +
		"�������ٹ�·�������ܼ�ͤ�ţ��������ӣ��滮����Լ2500�ף�" +
		"���Լ13���ꣻ���辰԰�Ͷ�ͯ��԰���󲿷֡�\n" +
		"         �Ϸ�ɽ��԰��λ���س����棬����ְҵ��רѧУ����������һ��ɽ��" +
		"��������߼���ѧѧУ���������ٹ�·���滮���Լ70���꣨���к��ľ���Լ11���꣩��" +
		"����������԰�ֽ�������Ȼֲ���Ⱦ�����Դ�����ϣ��⽨�ɼ��۹���������ɽ�����ڽ̳��ݡ�" +
		"�������ֵȶ�λһ���ɽ�����й�԰�����к���ʿ��԰����\n\n" ;
	private String hotelTraffic = 
		"����ʡ������ϼ���ظ�����;����վ���� ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_fun_funingpark);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_funingpark_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_funingpark_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_funingpark_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_funingpark_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_funingpark_tabthree:  
				break;
			}
			
		}
		
	}
}
