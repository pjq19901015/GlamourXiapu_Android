package com.pjq.glamour_xiapu.shopping;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class NanJieBaiHuoActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = 
		"         �Ͻְٻ���¥�ڹ�����С����������ֶ���ܣ�����ͳ����ҵ�Ļ����ִ��������ϡ�" +
		"�ϱ�¥��2400ƽ���׵�Ӫҵ���أ������̳�Ӫҵ���2200ƽ���ף�����Ӫ��Ʒ���໮��Ϊ5���̳���" +
		"��¥��¥Ϊ�ۺϳ��У���Ӫ���ðٻ���ʳƷ�ȣ���һ¥��ӪƤ�����ջ���ʳƷ����Ʒ��" +
		"����ʳƷ�̳��ѿ���������á�ͬ���á������졢������ε����ֺ�ר����һ¥Ϊ�ƽ������̳���" +
		"����¥��ӪŮװ�������Ʒ�����϶�¥����֯�̳����ᣬ�Թ������ƺ͹������Ʒ��Ϊ����" +
		"ΪŮ��Ӫ���һ��Ѥ������ܰ�ķ�Χ��������䣬�Ӿ���������Ĺ��ߺͷḻ����Ʒ������" +
		"ʹ����ζһ��Ů�Ա��ܵĹ�����Ȥ������¥Ϊ��װ�����̳���������¥�ĵ�Ѷ�̳�һ��Ϊ" +
		"��ͬ���ǹ�������Ĺ�����г������ڳ�ֿ������Թ��������Ļ����ϣ�" +
		"����¥�㲼�ּ�ࡢ������ʹ���ܼ�Ϊ����ع�����Ҫ����Ʒ������¥�˶��ٶ��̳���" +
		"���ڶ���Ʒ���콢��Ϊ����������ʱ�е�ר����ƣ��ٶ���ͯȤ���磬�˶�������ʮ�㣬���岼�����졢" +
		"ɫ�����ޣ������ͨ������¥Ϊ�ҵ��̳�������¥Ϊ��ʳ���ֳǣ���������ʳ������������ɣ�" +
		"�ǹ˿͹���֮�����֡��������ó���\n\n" ;
	private String hotelTraffic = 
		"����ʡ������ϼ���ظ�ǰ·236��  ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.nanjiebaihuo);
		
		textView = (TextView) this.findViewById(R.id.activity_shopping_nanjiebaihuo_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_shopping_nanjiebaihuo_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("�Ͻְٻ�");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_shopping_nanjiebaihuo_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_shopping_nanjiebaihuo_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_shopping_nanjiebaihuo_tabthree:
				break;
			}
			
		}
		
	}
}
