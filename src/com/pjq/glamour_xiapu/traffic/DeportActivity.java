package com.pjq.glamour_xiapu.traffic;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class DeportActivity extends Activity {
	private TextView textView;
	private String message = 
		"         ϼ��վ ���س�4�������ң������ʷ��Ʒ��վ���ܽ������3100" +
		"��ƽ���ף���ͨ�������760��ƽ���ף�δ����ϯ���Һ͹���ң���"+
		"�߾ۼ�����Ϊ600�ˡ�\n\n" +
		"         �¸���·���ǹ����ص㽨����Ŀ��" +
		"�ǹ����г�����·���滮�������ĺᡱ���˿���ͨ��֮һ��" +
		"�����Ң�˫�ߵ�������·���������㽭ʡ�����У�" +
		"���𰲡�ƽ�������ϡ�������ϼ�֡����������¡���Դ�����������������У�" +
		"��·ȫ��Լ298����ù��̴�2004��12�¶���������4���Ľ��裬" +
		"�ڽ���6��30�����ȿ�ͨ���ˣ�28����ʽ��ͨ���ˡ�����ϼ�־���ȫ��41.858���" +
		";�����ǡ���ɳ���ɸۡ�����4�������Ⱥ��Խ��Ϫ���޺�Ϫ����Ϫ����Ϫ����" +
		"��������ɽ������ɽ��ϼ�֡������롢����β�����������Ͷ��Լ25.29��Ԫ��" +
		"����ϼ�������ȫ����·����ר��Ŀǰ��ͨ�ڶ���������������غ���·��������ȫ��13.1����"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_deport);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_deport_textview);
		textView.setText(message);
	}
	
}
