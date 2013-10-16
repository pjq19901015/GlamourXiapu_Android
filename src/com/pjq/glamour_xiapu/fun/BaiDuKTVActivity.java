package com.pjq.glamour_xiapu.fun;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.os.Bundle;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class BaiDuKTVActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         ϼ�ְٶ����ֻ��������������֡���󡢻��֡�ʱ�С����ľ�Ӫ�����͸����������" +
		"���Ի�����������ģʽ���ؽ���츣���Ƕ�������������\n"+
		"         �ٶ����ֻ���λ�ھ�Ե�Ӷ��棬����Ƚϴ���ʩ�£����������ٶȿ죬������ʩҲ����" +
		"����Ƚ��ܵ������������С����ĥʱ��ĺ�ȥ�������������ܵ��⣬���������Ƽ������Żݻ�о������ġ�\n";
	private String hotelTraffic = 
		"ϼ���ظ��������Ե�Ӷ��� ";
    private TextView mTxtTitle;
    private ImageView mImgviewBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.baiduktv);
		
		textView = (TextView) this.findViewById(R.id.activity_fun_baiduktv_textView_tab);
		mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_fun_baiduktv_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        mTxtTitle.setText("�ٶ����ֻ���");

        mImgviewBack = (ImageView) this.findViewById(R.id.title_imgview_back);
        mImgviewBack.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_fun_baiduktv_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_fun_baiduktv_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_fun_baiduktv_tabthree:
				textView.setText("13626986566");
				break;
			}
		}
	}
}
