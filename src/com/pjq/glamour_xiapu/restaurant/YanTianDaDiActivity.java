package com.pjq.glamour_xiapu.restaurant;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class YanTianDaDiActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         λ�ڳ������ֵ������ĵĵ꣬����ϼ�ֵ���ɫ����" +
			"����Ҳ�ܶ�ģ�ϼ�ֵĲˣ���ζ�Ƚ�ƫ��"+
			"�����Ƽ��ľ������Ǽҵ�Ŵ�������������кܶ����ϣ��ඹ�����ף��㹽��з���������ȵȣ�" +
			"Ŵ�׷����룬�Ե������н�ͷ��ŴŴ�úܺóԣ�" +
			"���ǵĴ�����ը���㣬ζ��Ҳ�ܲ�����������ģ�����Ҳ�ܴ�������ͦ���ʵģ�" +
			"���ʶ�����������֭������������Ӧ���õ��϶����ɣ�����о�������," +
			"���Ǽҵķ�Ҳ������ɫ�������������ģ�һ��һ�ݣ���ͦ���\n\n" +
			"�Ƽ��ˣ�ţ���ң�������㣬����С���㣬���С������Ŵ������\n\n" +
			"Ӫҵʱ�䣺���� \n\n" +
			"�˾����ѣ�50��Ԫ��";
	private String hotelTraffic = 
		"����ʡ������ϼ����̫��·120�ţ�ϼ���صڶ�Сѧ���棩";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.yantiandadi);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_yantiandadi_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_yantiandadi_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("�������ŵ�");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_yantiandadi_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_yantiandadi_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_yantiandadi_tabthree:
				break;
			}
			
		}
		
	}
}
