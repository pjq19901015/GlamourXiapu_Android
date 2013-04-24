package com.pjq.glamour_xiapu.site;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class GaoLuoActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ���޺����ȼٴ�λ��ϼ���ض��ϣ����ٺ�嫵�̫ƽ�󣬾��س�35���" +
			"����ɳ̲����2000���ף����90���ꡣ�̲������������۵�㣬�����Ⱥ��" +
			"�����������岼�Ĵ�С����������������ʤ�գ�����һ������Ȼ�ĺ�������.\n" +
			"         �ȼٴ������ں�̲����֮�У�������Ȼ���ӵĸ����" +
			"����¥���������ͷ�����ˮ��ԡ�ҡ����ݰ�Ħ������ͧ���δ���������ʩ��ȫ��" +
			"�ο�����������Ȼ��ˮԡ���չ�ԡ���峿�ۿ��ճ���ҹ��������������������������" +
			"�����ɳ̲��չ�������򡢷ŷ��ݵ����������Ľ����Ļ��" +
			"�ֻ�˿�ͧ�ں������ɷɳۡ��ϵ�̽�ա��۽���������ʰ�������ݣ�������Ȥ�ʹ̼���\n" +
			"         ����ͧ�ں�����԰������һ����һ�������ĵ��������ӹ������϶԰��ľ�ɳ����" +
			"��̲��ɢ�������ι�״����ʯ�����˰������֡�" +
			"���Ͻ�ʯ��ᾣ���Ѩ���أ��к����������ӷ塢��ƽ�塢ʨ����Ⱦ��㣬��״Ω��ΩФ��" +
			"�˳�ʱ���ο����ڽ�ʯ�м��ݡ��ں��ã�ץСз�������ߵ��㣬" +
			"Ȼ�����ջ�ġ�ս��Ʒ�������տ����������\n" +
			"         ���޺�̲�߻����������˵���Ȼ�����֣������������������顢ľ��Ƶ�1��2����꣬" +
			"��������ɫ�����ϡ��������������������������Ϸ������һ����Ȥ��" +
			"�������ڡ�������Ȼ�������󺣡����������������޺����ȼٴ���������塣";
	private String hotelTraffic = 
		"1.ϼ�ֵ����޴��һ��Сʱ���ң�����ֱ����޵İ೵������9�����Һ�������������ҵġ�Ʊ��13Ԫ\n" +
		"2.�ڳ�վ�����䳵����СϪ�£���Ħ�Ľ�ȥ��";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_site_gaoluo);
		
		textView = (TextView) this.findViewById(R.id.activity_site_gaoluo_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_site_gaoluo_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_site_gaoluo_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_site_gaoluo_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_site_gaoluo_tabthree:
				break;
			}
			
		}
		
	}
}
