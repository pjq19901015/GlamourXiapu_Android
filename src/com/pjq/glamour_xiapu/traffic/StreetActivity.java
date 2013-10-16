package com.pjq.glamour_xiapu.traffic;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class StreetActivity extends BaseActivity {
	private TextView textView;
	private TextView textView1;
	private TextView textView2;
	private String message = 
		"         �ɳǽֵ���ϼ�����ɳǽֵ�Ͻ12��������6�������塣ʡ��ɳ���Ρ�С�ֶι�����" +
		"1949��Ϊ�ɳ�����1958�����ɳǹ��磬1984�꽨��1997�꣬���165.5ƽ��ǧ�ף�" +
		"�˿�9.4��Ͻ���ء����ء����͡��гˡ����ǡ��ร���߱���ӿɽ��Ĺ�������塢" +
		"���󡢳�ɳ����ɳ��ɳͷ�����桢��᪡���᪡���᪡������¡����¡���ũ����ۡ�������" +
		"�శ����ͷ�����ߡ����¡�ˮ�ӡ�������ͷ���Ѻ����´塢�¼��h���˶�����Сɳ35����ί������ء�" +
		"���ء����͡��гˡ�����5����ί�ᡣ" +
		"2003�곷������ɳǡ��ɸ�2���ֵ����ɳǽֵ�Ͻ���͡����ǡ��гˡ����ء�����5����ί������͡�" +
		"���ǡ��гˡ����ء��ร��Ĺ����ӿɽ�����󡢱��塢�߱���10�������塣���´�פԭ�ɳ�������פ�ء�" +
		"���ؾ�ί��������25�廮���ɸ۽ֵ���\n\n";
	private String message1 = 
		"         ����·��ϼ������ϣ��������ҵ�֣�ϼ�ֵ���ҵ���ġ�";
	private String message2 = 
		"         ������������������λ��ϼ�ֵ��³�����\n\n" +
		"         ̫��·��ϼ���µ���ҵ�֣������³�����ɳ�����\n\n" +
		"         ��һ��·��ϼ�ֱ��֣�ϼ�ֵ�һ���Ͻ֣���ž��Ǵ������ֿ�ʼ�ġ�ϼ����ʷ�ļ�֤��";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.street);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_street_textview);
		textView1 = (TextView) this.findViewById(R.id.activity_traffic_street_textview1);
		textView2 = (TextView) this.findViewById(R.id.activity_traffic_street_textview2);
		textView.setText(message);
		textView1.setText(message1);
		textView2.setText(message2);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("�ֵ�");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
}
