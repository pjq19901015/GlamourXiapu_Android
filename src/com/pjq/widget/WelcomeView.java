package com.pjq.widget;

import com.pjq.utils.ImageTool;
import com.pjq.utils.SystemResources;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;


public class WelcomeView extends View {
	private Paint paint;
	//private int viewWidth, viewHeight;
	private Bitmap bmWelcome;
	public WelcomeView(Context context) {
		super(context);
		//viewWidth = getWidth();
		//viewHeight = getHeight();
		bmWelcome = BitmapFactory.decodeResource(context.getResources(), 
										com.pjq.glamour_xiapu.R.drawable.mud_flat); //º”‘ÿÕº∆¨
		paint = new Paint();
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		bmWelcome = ImageTool.zoomImage(bmWelcome,
										SystemResources.screenWidth,
										SystemResources.screenHeight);
		canvas.drawBitmap(bmWelcome, 0, 0, paint);
	}
}
