package com.pjq.glamour_xiapu.traffic;

import android.widget.ImageView;
import com.pjq.glamour_xiapu.BaseActivity;
import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class WaterTransportationActivity extends BaseActivity {
	private TextView textView;
	private TextView textView1;
	private TextView textView2;
	private String message = 
		"         三沙渔港面向闽东渔场，海上资源丰富，水上交通便利，" +
		"素有“闽浙要冲”之称，是建设大型渔港较为理想的天然良港。\n"+
		"         2006年，霞浦县申报将三沙一级渔港提升为中心渔港并纳入霞浦台湾水产品集散中心建设规划。" +
		"三沙中心渔港规划为“一港两址”，即在五澳建设物流港区，在田澳建设避风港区，" +
		"建成运行后将使三沙港形成渔、工、贸一体化及装卸、航修、补给综合配套的大型渔业生产基地。\n" + 
		"         农业部于2009年7月28日正式批准立项，2010年8月批复工程初设，项目概算投资7136万元，" +
		"工期24个月。项目列入2010年福建省在建重点工程，同年开工建设。目前，" +
		"项目建设正按照施工组织计划和年度投资的工期节点要求提速推进，" +
		"计划于今年6月底完成五澳港区码头主体工程建设。\n" + 
		"         据了解，该项目的建成和运行，不仅完善了三沙口岸的标准渔港设施，" +
		"同时对有效解决霞浦台湾水产品集散中心的工、贸物流配套，进一步发挥三沙口岸对台优势，" +
		"以及改善三沙小城镇镇容镇貌，提升港区商贸物流、旅游、渔业产业化发展、" +
		"防灾减灾水平和保障两岸渔民生命财产安全等，都具有极其重要的意义。\n\n";
	private String message1 = 
		"         西洋班船：一天一班";  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.water_transportation);
		
		textView = (TextView) this.findViewById(R.id.activity_traffic_water_transportation_textview);
		textView1 = (TextView) this.findViewById(R.id.activity_traffic_water_transportation_textview1);
		textView.setText(message);
		textView1.setText(message1);

        TextView mTxtTitle = (TextView) this.findViewById(R.id.title_txt_title);
        mTxtTitle.setText("水上交通");
        ImageView back = (ImageView) this.findViewById(R.id.title_imgview_back);
        back.setOnClickListener(new BaseActivity.BackClickListener());
	}
}
