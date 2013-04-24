package com.pjq.glamour_xiapu;

import com.pjq.adapter.AppsAdapter;

import android.app.Activity;
import android.os.Bundle;   
import android.widget.GridView;

public class GuideActivity extends Activity {
	private GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabhost_guide);
		
		gridView = (GridView) this.findViewById(R.id.tabhost_item_guide_gridview);
		gridView.setAdapter(new AppsAdapter(this));
		
	}
	
}
