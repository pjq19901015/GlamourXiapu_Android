package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class XiapuTantuActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ��ϼ���س��幫����������ϲ���ֳ����" +
			"��ɽ�¶��У�ӡ����������һ���Ŵ������µ�С����������׺���еĸ�����ͣ�" +
			"����æµ��һҶС�ۣ��Ͷ��������ɽ�塣�����¶�����Ȼ������Զ��ģ���ĵ����������Ƭ��������" +
			"��Ȼһ�壬��һ��׳�۵ĳ���������ˮ�˳���̲ͷ������Ҳ�������ߡ���ϼ��ӳ���³����ĵ�Ӱ��" +
			"������������������������������µĹ�ʣ������������ꡢ��ͼ䴩�������밵�Ľ��棬" +
			"���ϲ������۵ĺ��棬һҶС���������У������������\n" +
			"         ÿ������̫�����³�������̲Ϳ����ͺʹ�����ĺ���������Ҳ¶��ˮ��ʱ��" +
			"ң����Ƭ̲Ϳ������ʵ�̲Ϳ������������������Ŀ�������������������ľ���";
	private String hotelTraffic = "         ���½���ϼ��һ�ж��棬�����ĺ�ɽ��ɽ·�Ϳ���ͽ�����������"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_xiaputantu);
		
		textView = (TextView) this.findViewById(R.id.activity_site_xiaputantu_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_xiaputantu_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_xiaputantu_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_xiaputantu_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_xiaputantu_tabthree:
				break;
			}
			
		}
		
	}
}
