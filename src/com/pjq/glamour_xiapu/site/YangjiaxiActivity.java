package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class YangjiaxiActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ���Ϫλ�ڸ���̫��ɽ���࣬�����ξ�ϼ�����������ڡ�" +
			"�ഫ�����������ڱ����¹�Ӣ�Ķ�Ů���Ĺ���������ʱ��ڴ�ƽ��������ʮ�˶���" +
			"������ҽ�פ�ش˵أ����԰Ѵ� Ϫ�����Ϫ��\n" +
			"         ���Ϫ�Դ�������������1988��8�¾�����Ժ��׼��" +
			"��̫��ɽɽ���������ڹ��ҵڶ����ص����η羰��֮��̫��ɽ��ʤ������" +
			"��̫��ɽ��ɽ��������������������֮һ��\n"+                               
			"         ���Ϫ����Լ35ƽ�����" +
			"�ɾ���Ϫ��������ͤ�ٲ�������Ǯ�����������������������Ϫ�徰������ƺ�������" +
			"����ͤ������ͷ ��������Ϫ��ɽ�����ȾŸ�С�����ɣ�" +
			"�ָ��±�λ��ͨ���������ʯ ̶2���ﳤ����֮��ġ�ԭҰ��̬����������" +
			"ӵ��Ұ�ޡ���������Ӿ�� �տ�����ʳ�ȶ�����ɫ�����׹�������֡����С��Ϣ������20�� ��.";
private String hotelTraffic = "1��ϼ�������¸���·��ָʾ����ʻ(���ɷ����Ƽ�)\n" +
						"2������������ϼ��վ�󣬳�վ���й��������ϳ�����ϼ��������վ�³����ϳ�վ����" +
						"����ϼ�ֵ����ǵĿͳ���ɵ����ǣ�֮��ת�������Ϫ�����Դ�ġ�Ħ�г����������ȣ���"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_yangjiaxi);
		
		textView = (TextView) this.findViewById(R.id.activity_site_yangjiaxi_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_yangjiaxi_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_yangjiaxi_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_yangjiaxi_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_yangjiaxi_tabthree:
				break;
			}
			
		}
		
	}
}
