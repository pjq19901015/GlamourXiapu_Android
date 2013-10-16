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


public class HuTangActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         һ�������һ�����ȣ���Ӧ����ϼ�ֽ�ͷ����������ʽ�ˡ�" +
			"ֱ�����죬��ٳ��������ϼ���˻���ģ���Ȼ����һ����ż���ζ���ĺ�����" +
			"������ү���Աߵ���Ҿ�����ϼ�ֵص��Ŀ�ζ��" +
			"ÿ����ͺ�ҹ����ʱ�䣬��͵��Ŷӵ�λ���ˡ�\n\n" +
			"�Ƽ��ˣ����������ӣ������Ŵ�׷������ۡ�\n\n" +
			"Ӫҵʱ�䣺һ��24Сʱ \n\n" +
			"�˾����ѣ�5-8��Ԫ��";
	private String hotelTraffic = 
		"����ʡ������ϼ���ظ�ǰ·271�ţ������������ά���ԣ�";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.hutang);
		
		textView = (TextView) this.findViewById(R.id.activity_restaurant_hutang_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_restaurant_hutang_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("����");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_restaurant_hutang_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_restaurant_hutang_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_restaurant_hutang_tabthree:
				break;
			}
			
		}
		
	}
}
