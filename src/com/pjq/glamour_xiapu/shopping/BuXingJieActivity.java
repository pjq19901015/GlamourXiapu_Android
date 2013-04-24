package com.pjq.glamour_xiapu.shopping;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class BuXingJieActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         ����·���н���ϼ�ֵľ�Ʒ�꼯�е�����,�㼯�˸���Ʒ�Ʒ��Ρ���ɴ��Ӱ����������," +
		"�ǰ�������ϴ�Ҷ�ϲ������ҵ���н�,�����ж�ʱ�����������������ϲ�,���漸��û����ϴ��," +
		"��ǰ�г������Բ��н����½���������,ÿ����ר����ϴ����,�ڷ�������ʻ����辰��,�ò��нֱ�������," +
		"������ÿ�쾭�����ﶼ�ܸо������н�ŨŨ������ζ,�Ͼ����˹���ͺö���,Ҳϣ������Ժ�మ��������ʩ," +
		"��������,�ò��нֲ��Ϸ������˵����.\n\n" ;
	private String hotelTraffic = 
		"����ʡ������ϼ����ӭ���ɱ��� ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_shopping_buxingjie);
		
		textView = (TextView) this.findViewById(R.id.activity_shopping_buxingjie_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_shopping_buxingjie_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_shopping_buxingjie_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_shopping_buxingjie_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_shopping_buxingjie_tabthree:
				break;
			}
			
		}
		
	}
}
