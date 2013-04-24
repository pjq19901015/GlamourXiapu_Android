package com.pjq.glamour_xiapu;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window; 
import android.widget.ImageView;


public class GuideDownloadActivity extends Activity{
	private ImageView imageViewBack;  //返回按钮
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);  //设置无标题栏
		setContentView(R.layout.activity_guide_download);
		
		imageViewBack = (ImageView) this.findViewById(R.id.activity_guide_download_back);
		imageViewBack.setOnClickListener(new BackClickListener());
		
	}
	
	private class BackClickListener implements View.OnClickListener{
		@Override
		public void onClick(View v) {
			GuideDownloadActivity.this.finish(); //退出activity
		}
	}
}
