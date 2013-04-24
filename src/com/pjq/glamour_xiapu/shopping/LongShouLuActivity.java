package com.pjq.glamour_xiapu.shopping;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class LongShouLuActivity extends Activity {
	private RadioGroup radioGroupMiddle;
	private RadioGroup radioGroupBottom;
	private TextView textView;
	private String hotelMessage = "         霞浦最古老，最繁华的商业街，霞浦的商业中心。\n\n" ;
	private String hotelTraffic = 
		"福建省宁德市霞浦县龙首路";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_shopping_longshoulu);
		
		textView = (TextView) this.findViewById(R.id.activity_shopping_longshoulu_textView_tab);
		radioGroupMiddle = (RadioGroup) this.findViewById(
									R.id.activity_shopping_longshoulu_radiogroup_middle);
		radioGroupMiddle.setOnCheckedChangeListener(new MiddleCheckedChangeListener());
		textView.setText(hotelMessage);
	}
	
	private class MiddleCheckedChangeListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch(checkedId){
			case R.id.activity_shopping_longshoulu_tabone:
				textView.setText(hotelMessage);
				break;
			case R.id.activity_shopping_longshoulu_tabtwo:
				textView.setText(hotelTraffic);   
				break;
			case R.id.activity_shopping_longshoulu_tabthree:
				break;
			}
			
		}
		
	}
}
