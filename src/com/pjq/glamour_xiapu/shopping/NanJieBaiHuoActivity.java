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
		"         南街百货大楼融购物、休闲、餐饮、娱乐多项功能，将传统的商业文化与现代潮流相结合。" +
		"南北楼共2400平方米的营业场地，其中商场营业面积2200平方米，按经营商品大类划分为5个商场。" +
		"北楼底楼为综合超市，经营日用百货、食品等；北一楼经营皮件、日化、食品等商品，" +
		"其中食品商场已开设胡庆余堂、同仁堂、东方红、许氏洋参等老字号专柜，南一楼为黄金钟照商场；" +
		"北二楼经营女装和羊纺商品，与南二楼的针织商场连贯，以国内名牌和国外大众品牌为主，" +
		"为女性营造出一种绚丽而温馨的氛围，徜徉其间，视觉随着明柔的光线和丰富的商品流动，" +
		"使您体味一种女性本能的购物乐趣；北三楼为男装休闲商场，和南三楼的电讯商场一起，为" +
		"男同胞们构筑理想的购物、休闲场所，在充分考虑男性购物特征的基础上，" +
		"整个楼层布局简洁、流畅，使您能极为方便地购买到需要的商品；北四楼运动少儿商场，" +
		"以众多名品牌旗舰店为主，采用最时尚的专柜设计，少儿区童趣洋溢，运动区动感十足，整体布局明快、" +
		"色彩鲜艳，与其贯通的南四楼为家电商场。南五楼为美食娱乐城，由世界美食、电玩世界组成，" +
		"是顾客购物之余游乐、休憩的良好场所\n\n" ;
	private String hotelTraffic = 
		"福建省宁德市霞浦县府前路236号  ";
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
        mTxtTitle.setText("南街百货");
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
