package com.pjq.glamour_xiapu.traffic;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class WaterTransportationActivity extends BaseActivity {
	private TextView textView;
	private TextView textView1;
	private TextView textView2;
	private String message = 
		"         ��ɳ������������泡��������Դ�ḻ��ˮ�Ͻ�ͨ������" +
		"���С�����Ҫ�塱֮�ƣ��ǽ��������۽�Ϊ�������Ȼ���ۡ�\n"+
		"         2006�꣬ϼ�����걨����ɳһ���������Ϊ������۲�����ϼ��̨��ˮ��Ʒ��ɢ���Ľ���滮��" +
		"��ɳ������۹滮Ϊ��һ����ַ����������Ľ�����������������Ľ���ܷ������" +
		"�������к�ʹ��ɳ���γ��桢����óһ�廯��װж�����ޡ������ۺ����׵Ĵ�����ҵ�������ء�\n" + 
		"         ũҵ����2009��7��28����ʽ��׼���2010��8���������̳��裬��Ŀ����Ͷ��7136��Ԫ��" +
		"����24���¡���Ŀ����2010�긣��ʡ�ڽ��ص㹤�̣�ͬ�꿪�����衣Ŀǰ��" +
		"��Ŀ����������ʩ����֯�ƻ������Ͷ�ʵĹ��ڽڵ�Ҫ�������ƽ���" +
		"�ƻ��ڽ���6�µ������ĸ�����ͷ���幤�̽��衣\n" + 
		"         ���˽⣬����Ŀ�Ľ��ɺ����У�������������ɳ�ڰ��ı�׼�����ʩ��" +
		"ͬʱ����Ч���ϼ��̨��ˮ��Ʒ��ɢ���ĵĹ���ó�������ף���һ��������ɳ�ڰ���̨���ƣ�" +
		"�Լ�������ɳС����������ò������������ó���������Ρ���ҵ��ҵ����չ��" +
		"���ּ���ˮƽ�ͱ����������������Ʋ���ȫ�ȣ������м�����Ҫ�����塣\n\n";
	private String message1 = 
		"         ����ബ��һ��һ��";  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.water_transportation);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_water_transportation_textview);
		textView1 = (TextView) this.findViewById(R.id.activity_traffic_water_transportation_textview1);
		textView.setText(message);
		textView1.setText(message1);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("ˮ�Ͻ�ͨ");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
}
