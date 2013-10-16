package com.pjq.glamour_xiapu.fun;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class WenHuaGuangChangActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         һ����������Ⱦ�Ļ��ں��������ṩ���С����֡��Ļ���ĳ�����\n"+
		"         ����һ�����е��Ļ��㳡��������������еġ����������" +
		"��������չʾ�����Ļ��Ĵ��ڣ�Ҳ���������˵�һ���羰��\n" +
		"         ���ǳ����Ļ��㳡����ͻ���Ļ�������ڳ�������Ϊ�������ṩ���񹫹������ѧϰ��" +
		"���Ƴ��л������ж�������Ļ������һ���ִ����ſռ䡣�����Ļ��㳡�Ľ�����Ϊһ�ֹ����Ļ���ҵ��" +
		"�뵱����ʷ���Ļ����϶Ա����Ļ��͸��������Ļ����˴��С����ء����µ����ã�" +
		"�ﵽ�˱��ؾ�����ؾ���ۼ���������������Ŀ�ġ�\n\n" ;
	private String hotelTraffic = 
		"����ʡ������ϼ�����Ļ��㳡   ";
    private TextView mTxtTitle;
    private ImageView mImgviewBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.wenhuaguangchang);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_wenhuaguangchang_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_wenhuaguangchang_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("�Ļ��㳡");

        mImgviewBack = (ImageView) this.findViewById(R.id.title_imgview_back);
        mImgviewBack.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_wenhuaguangchang_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_wenhuaguangchang_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_wenhuaguangchang_tabthree:
				break;
			}
			
		}
		
	}
}
