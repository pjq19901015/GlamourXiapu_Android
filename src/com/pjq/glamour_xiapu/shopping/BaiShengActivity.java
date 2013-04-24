package com.pjq.glamour_xiapu.shopping;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class BaiShengActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         �������ǽ�ʨ����������׿����ҵ���Ԫ�������ʻ��Ĺ��̼��ţ���ʮ������չѸ�٣�" +
		"��Ϊ�������֮һ����֯��ȫ���ʽ��ۺ�ҵ��Χ�������졢ó�ס����ۡ����ز������ڷ�������Ѷ�Ƽ�������" +
		"�����ж�����ҹ�˾����ϵ��ҵ����������'��ʢ'Ϊ�������ǰٻ���˾�泬���г�.\n"+
		"         ��ʢ���������ǽ�ʨ������1987�괴���Ĵ��Ͱٻ�����������ҵ��Ϊ��ʨ����������ҵ��ó�׵�һ����,"+
		"�ڶ�ʮ��ǰ��ʱ���﷢չ�����������ٻ����������������Ҫ���У�" +
		"���������������Ǹ�����п�����34�乺�����ĺʹ��ͳ����г���" +
		"��Ϊ�������ǰٻ��������ɹ��������������š�" +
		" 2004��7��17�տ�ʼ��Ӫҵ��ϼ�ְ�ʢ����㳡�ǰ�ʢ�������й�����ĵ�38�ҷֵꡣ" +
		"������ȷ��ʱ�ж�λ�����ŵĹ��ﻷ��Ӯ���������ߵ�������ͬʱҲΪϼ����������ĳ��и����ɣ�" +
		"��ϼ�������ٴ˳��׵�������������������һʱ�ж���ܰ�����Ѹ��\n\n" ;
	private String hotelTraffic = 
		"����ʡ������ϼ��������·218��  ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_shopping_baisheng);
		
		textView = (TextView) this.findViewById(R.id.activity_shopping_baisheng_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_shopping_baisheng_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_shopping_baisheng_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_shopping_baisheng_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_shopping_baisheng_tabthree:
				break;
			}
			
		}
		
	}
}
