package com.pjq.glamour_xiapu.hotel;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class DiJingActivity extends BaseActivity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         ϼ�ֵ۾����ʾƵ���ڶ���վ������·����ڼ���;����վ���㴦��" +
			"�����4A���������Ϫ��20���ӳ��̣��������ʤ������̫��ɽ����30���ӵĳ��̡�" +
			"���С�������³��֮����ϼ�֣�ǰ����Ӱ���˸������ﲻ��������Ϊ���й�ʮ����Ӱ���ء�֮һ��" +
			"�����ǾƵ�����е���Ӱ�㳵�̶���40����֮�ڣ��������10���ӣ������Ӱ�㣩�� \n" +
			"         �۾����ʾƵ��ں�ϼ�ֵ��ط���͸����Ļ����裬���ʱ�У����������ʡ��۾��Ƶ�Ը��������...";
	private String hotelTraffic = 
		"�Ƶ�λ��������ϼ�����سǣ�̫��·��శ������㴦���ڽ�ϼ������վ����ͨ������\n" +
		"- ����ϼ������վ2.3���\n" +
		"- ���븣�ݳ��ֹ��ʻ���Լ176���\n" +
		"- ����ϼ�ֻ�վ3.3���";
    private ImageView mImgviewBack;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dijing);
		
		textView = (TextView) this.findViewById(R.id.activity_hotel_dijing_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_hotel_dijing_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("�۾����ʾƵ�");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BackClickListener());
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_hotel_dijing_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_hotel_dijing_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_hotel_dijing_tabthree:
				break;
			}
			
		}
		
	}
}
