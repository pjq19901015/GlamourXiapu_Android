package com.pjq.glamour_xiapu.hotel;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class Su8Activity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ��8�Ƶ꣨ϼ�ֹ���꣩λ��ϼ��������������" +
			"����λ����Խ����ͨ�����������������Ƶ�ӵ�и����������ʱ�еĿͷ���װ�޿�����ʱ�б��¡�" +
			"���߸��Ի����о���ܰ���ʡ�ÿ��ͷ��䱸��Һ�����ӣ������̨����ѹ��ڳ�;��" +
			"24Сʱ��ˮѭ��ϵͳ�ȣ����������׷����е���15�׸��ٹ�ǥ������������" +
			"�Ƶ�Ϊ���ṩ�ɾ�Ӫ����ζ�����������ͣ���������������ɹ�����ʱ������ѯ��" +
			"��ѵ�ͣ����Ϊ���ĳ��д�����ݡ�";
	private String hotelTraffic = 
		"�Ƶ�λ��ɽ��·������·����ڣ��ڽ�ϼ������վ��ͬ�����ٹ�·����ͨ������\n" +
		"- ����ϼ�ֻ�վ4.4���\n" +
		"- ���븣�ݳ��ֹ��ʻ���Լ176���\n" +
		"- ����ϼ������վ1.7���";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.su8);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_su8_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_su8_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("��8");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_hotel_su8_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_hotel_su8_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_hotel_su8_tabthree:
				break;
			}
			
		}
		
	}
}
