package com.pjq.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.ViewGroup.MarginLayoutParams;

public class ImageTool {
	public static String SDCARD_PARH;

	public static Bitmap zoomImage(Bitmap source, int newWidth, int newHeight) {
		Bitmap newBm = null;
		Matrix m = new Matrix();
		m.postScale((float)newWidth/source.getWidth() , (float)newHeight/source.getHeight());
		newBm = Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(),m,true);  
		return newBm;
	}               
	
}
