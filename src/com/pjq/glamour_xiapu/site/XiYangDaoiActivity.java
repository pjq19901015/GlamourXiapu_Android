package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class XiYangDaoiActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ����λ��ϼ���ض��Ϻ��򣬶������㺣�Ͻ�ͨҪ��֮�ʺ���ϼ���س����20���" +
		 "�Ǻ������һ�����֣�ͬʱҲ�����������ڵء����������ĵd�е�����ӥ�����󡢿�ɽ����̡�С����� " +
		 "43��������ɣ���������������������ܳ���Ϊ 104.5���½�������29.8ƽ�����\n" +
		 "         ���������º͡��������У������ȴ������Լ���������ƽ������18��--20�棬��ů��������ƽ����ˮ��800��1200mm ���������ˡ�\n" +
		 "         ��Ͻ6 �������壬һ�����̶Ӻ�һ������վ��25 ����Ȼ�塣���˿� 12540�ˣ���ϼ����Ψһ�Ĵ���ҵ�硣\n" +
		 "ȫ��90% ��������������ҵ��������ҵ����ռȫ����񾭼��������95%���ϣ�ˮ��Ʒ������Լռϼ���ز����������ķ�֮һǿ��\n" +
		 "         ���󵺶�������ϼ���ص�һ�����������������ڶ����͸��졢��ɫ��ͬ�ĵ����Լ�����Ũ��ĺ������׷��飻" +
		 "������ӵ�����������泡����ҵ��Դ�ḻ����������ϱ����Ͻ�ͨҪ��������̨�������е���" +
		 "�������������¶�����ǰ����أ�Ҳ�Ǹ���ʡ���������̨������׵�֮һ��" +
		 "�������������ŷ�ɥ���ġ����Ӣ�ۡ����������й������ĳ��Σ����ﴦ�������⡢ɳ̲�����ˣ�����������������׷Ѱ�����á�" +
		 "��������й�������ͼ��Ψһ�ԡ�������������Ⱥ��֮�磬һ�����ڸ���ʡϼ���ض����غ��ġ������Ů����\n" +
		 "         ���󵺵���ʷ����Щ�������ζ����˵�ܾ���ǰ��Ҳ˵������ʲô��������洬�������" +
		 "ԶԶ���������к췢���۵�����ˣ����ǵ�������ؽ磬����ȡ�������󵺡���" +
		 "���󵺵�ˮ������ḻ����Լ��һ�ٶ���ǰ���ӳ��ֺ���������ʮ�˻����񱳾����磬" +
		 "ռ������������Ǻ������õ�С�����ڴ���կ���㣬�������������������˵Ŀ������ȡ�" +
		 "�ҵ�ͬ��С�����Ͼ��Ǵ��������絺Ǩ�㵽�˵ġ�����������һ�鷽�Էɵأ�����ȫ���е����ĸ��ݻ���\n";
	private String hotelTraffic = "ϼ�����䳵վ���೵����䰣��������ͷ���������󵺣�ÿ��һ�࣬12:00��"; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_xiyangdao);
		
		textView = (TextView) this.findViewById(R.id.activity_site_xiyangdao_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_xiyangdao_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_xiyangdao_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_xiyangdao_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_xiyangdao_tabthree:
				break;
			}
			
		}
		
	}
}
