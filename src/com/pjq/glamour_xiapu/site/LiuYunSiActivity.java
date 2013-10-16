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
	private String hotelMessage = "         普陀洛迦，《华严经》中的梵语“一朵美丽的小白花”之意，素有“小普陀”的美誉的留云寺位于福建省霞浦县三沙镇，" +
			 "是一个由天然大石洞布置的佛殿，背枕层峦叠翠东壁主峰，面临福宁湾，" +
			 "四霜列岛像璀璨的明珠显耀于万顷汪洋之中，在水天相连、浩渺迷茫的远处,就是台湾。" +
			 "留云寺方圆千米内，奇岩怪石，粗犷突兀，千姿百态，引人入胜，如“无弦琴”、“不干泉”、“观音别航”、" +
			 "“和尚听经”、“玉兔赏月”、“群蛙竞技”、“麒麟腾飞”、“骆驼观涛”等二十余景。" +
			 "景区有一天然石穴可通留云洞佛殿，石穴顶端透入微光，两边石壁长满青苔，滴水有声。" +
			 "整个佛洞由一块巨大的岩石覆盖着，所以又称“一片瓦”，洞宽9米，深11米，最高处为7米，整个洞呈方形，" +
			 "门口圆弧形，洞内有明朝铜香炉三件。洞前有“祭天台”，台前右石上刻“鱼”字，左右上刻“磬”字。" +
			 "当年福鼎寺比丘尼品逢法师来此住持，并撰联曰：“留钵传灯观自在，云台幽洞悟如来”。\n   " +
			 "         幻里尚求真，水月镜花空色相；尘间难免俗，灯霞泉石托精神。\n" +
			 "         留云寺景区摩崖石刻甚多，有国民党政界要人陈立夫的“海东胜地，留云纪胜”，" +
			 "霞浦籍女书法家游寿“龙沙获象骨，草原觅渔田”，著名书法家郑乃光的“流云听淘”，" +
			 "青年书法家朱以撒的“天风海涛”以及魏勇公的“得未曾有”，郑碧云的“敬仰高贤”，" +
			 "碧松法师的“无量寿佛”，杜楚南的“金盘堆果”，刘子兆的“风怒涛飞，巨浪狂啸”，" +
			 "林锴的“银渣泛日”，朱以撒的“天风海涛”，郑乃珖“留云听涛”等题刻留云寺，" +
			 "非常美丽的地方；留云洞，非常喜欢的名字。\n" +
			 "         留云寺留云洞，乱云如此的喜爱、流连，也依然离去，不是留不住，而是不能留。\n" +
			 "         留，只能深深地留在云的心里。";
	private String hotelTraffic = "         在霞浦北门车站（老车站）坐班车到三沙(15分钟一班)"; 
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
        mTxtTitle.setText("留云寺");
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
