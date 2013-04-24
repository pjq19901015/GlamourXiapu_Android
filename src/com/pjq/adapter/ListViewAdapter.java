package com.pjq.adapter;


import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {
	private Context context;
	private LayoutInflater inflater;
	private class ListTemp{
		ImageView imageView;
		TextView textView;
	}
	
	private int[] imageID; 
	
	//存放各功能的名称
	private String[] illustrates;
	
	//控件ID
	private int[] ids = new int[]{
			0,1,2,3,4,5,6,7,8,9,10
	};
	
	private int item;  //listView 子view的布局文件ID
	private int imageViewID;
	private int textViewID;
	private OnClickListener clickListener;
	
	public ListViewAdapter(Context context,int[] imageID, String[] illustrates ,int item,  
								int imageViewID, int textViewID,OnClickListener clickListener) {
		this.context = context;
		this.imageID = imageID;
		this.illustrates = illustrates;
		this.item = item;
		this.imageViewID = imageViewID;
		this.textViewID = textViewID;
		this.clickListener = clickListener;
		
		inflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() {
		return imageID.length;
	}

	@Override
	public Object getItem(int position) {  
		return position;
	}

	@Override
	public long getItemId(int position) {  
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ListTemp temp;
		if(convertView == null){
			convertView = inflater.inflate(item, null);
			temp = new ListTemp();
			temp.imageView = (ImageView) convertView.findViewById(imageViewID);
			temp.textView = (TextView) convertView.findViewById(textViewID);
			convertView.setTag(temp);
		}else{
			temp = (ListTemp) convertView.getTag();
		}
		temp.imageView.setImageResource(imageID[position]);
		temp.textView.setText(illustrates[position]);
		convertView.setId(ids[position]);
		convertView.setOnClickListener(clickListener);
		return convertView;
	}

}
