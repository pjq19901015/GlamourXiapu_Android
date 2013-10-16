package com.pjq.glamour_xiapu.site;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class LiuYunSiActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         �������ȣ������Ͼ����е����һ��������С�׻���֮�⣬���С�С���ӡ���������������λ�ڸ���ʡϼ������ɳ��" +
			 "��һ������Ȼ��ʯ�����õķ�������͵��䶫�����壬���ٸ����壬" +
			 "��˪�е����貵�������ҫ����������֮�У���ˮ��������������ã��Զ��,����̨�塣" +
			 "�����·�Բǧ���ڣ����ҹ�ʯ������ͻأ��ǧ�˰�̬��������ʤ���硰�����١���������Ȫ�����������𺽡���" +
			 "�����������������������¡�����Ⱥ�ܾ��������������ڷɡ��������չ��Ρ��ȶ�ʮ�ྰ��" +
			 "������һ��ȻʯѨ��ͨ���ƶ���ʯѨ����͸��΢�⣬����ʯ�ڳ�����̦����ˮ������" +
			 "��������һ��޴����ʯ�����ţ������ֳơ�һƬ�ߡ�������9�ף���11�ף���ߴ�Ϊ7�ף��������ʷ��Σ�" +
			 "�ſ�Բ���Σ�����������ͭ��¯��������ǰ�С�����̨����̨ǰ��ʯ�Ͽ̡��㡱�֣������Ͽ̡��ࡱ�֡�" +
			 "���긣���±�����Ʒ�귨ʦ����ס�֣���׫��Ի�����������ƹ����ڣ���̨�Ķ�����������\n   " +
			 "         ���������棬ˮ�¾�����ɫ�ࣻ���������ף���ϼȪʯ�о���\n" +
			 "         �����¾���Ħ��ʯ�����࣬�й�������Ҫ�˳�����ġ�����ʤ�أ����Ƽ�ʤ����" +
			 "ϼ�ּ�Ů�鷨�����١���ɳ����ǣ���ԭ������������鷨��֣�˹�ġ��������ԡ���" +
			 "�����鷨���������ġ���纣�Ρ��Լ�κ�¹��ġ���δ���С���֣���Ƶġ��������͡���" +
			 "���ɷ�ʦ�ġ������ٷ𡱣��ų��ϵġ����̶ѹ����������׵ġ���ŭ�ηɣ����˿�Х����" +
			 "���ǵġ��������ա����������ġ���纣�Ρ���֣�˫����������Ρ�����������£�" +
			 "�ǳ������ĵط������ƶ����ǳ�ϲ�������֡�\n" +
			 "         ���������ƶ���������˵�ϲ����������Ҳ��Ȼ��ȥ����������ס�����ǲ�������\n" +
			 "         ����ֻ������������Ƶ����";
	private String hotelTraffic = "         ��ϼ�ֱ��ų�վ���ϳ�վ�����೵����ɳ(15����һ��)"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.liuyunsi);
		
		textView = (TextView) this.findViewById(R.id.activity_site_liuyunsi_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_liuyunsi_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("������");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_liuyunsi_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_liuyunsi_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_liuyunsi_tabthree:
				break;
			}
			
		}
		
	}
}
