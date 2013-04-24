package com.pjq.glamour_xiapu.fun;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class JiuDaGuanActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         ��ϼ���ز���ݽ��蹤���ϣ����������ӽ�ʩ����ϼ���ؾŴ�ݰ�������ݡ�" +
		"ͼ��ݡ��Ƽ��ݡ�Ӱ��Ժ�ȣ��Ǹ�����ʷ��������������Ŀ��ռ��49.3Ķ��" +
		"�ܽ������57341ƽ���ף���Ͷ�ʴ�3.5��Ԫ��Ŀǰ��Ͷ��2��Ԫ��\n";
	private String hotelTraffic = 
		"����ʡ������ϼ���ظ������";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_fun_jiudaguan);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_jiudaguan_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_jiudaguan_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_jiudaguan_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_jiudaguan_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_jiudaguan_tabthree:  
				break;
			}
			
		}
		
	}
}