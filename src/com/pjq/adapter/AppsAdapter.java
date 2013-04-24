package com.pjq.adapter;


import com.pjq.glamour_xiapu.GuideDownloadActivity;
import com.pjq.glamour_xiapu.OverviewCityActivity;
import com.pjq.glamour_xiapu.R;
import com.pjq.glamour_xiapu.fun.FunActivity;
import com.pjq.glamour_xiapu.hotel.HotelActivity;
import com.pjq.glamour_xiapu.restaurant.RestaurantActivity;
import com.pjq.glamour_xiapu.shopping.ShoppingActivity;
import com.pjq.glamour_xiapu.site.SiteActivity;
import com.pjq.glamour_xiapu.traffic.TrafficActivity;   
import android.app.Service;
import android.content.Context;
import android.content.Intent;  
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;  
import android.widget.ImageView;
import android.widget.TextView;

public class AppsAdapter extends BaseAdapter {
	
	private Context context; 
	private LayoutInflater inflater;  //查找Layouy下的布局文件，并且实例化   
	
	//存放各功能的图片
	private int[] imageID = new int[]{
			R.drawable.grid_button_icon_news,R.drawable.grid_button_icon_download,R.drawable.grid_button_icon_site,R.drawable.grid_button_icon_hotel,
			R.drawable.grid_button_icon_restaurant,R.drawable.grid_button_icon_shopping,R.drawable.grid_button_icon_fun,R.drawable.grid_button_icon_traffic,
			R.drawable.grid_button_icon_introduce,R.drawable.grid_button_icon_weather,R.drawable.grid_button_icon_favorite
	};
	
	//存放各功能的名称
	private String[] illustrates = new String[]{
			"资讯和画报","导览下载","景点","住宿",
			"餐饮","购物","娱乐","交通",
			"城市概览","天气","我的最爱"
	};
	
	//控件ID
	private int[] ids = new int[]{
			0,1,2,3,4,5,6,7,8,9,10
	};
	
	
	
	//缓存类
	private class GridTemp{
		private ImageView imageView;   //显示每个功能图片的控件
		private TextView textView;     //显示每个功能名称的控件
	}
	
	public AppsAdapter(Context context) {
		this.context = context; 
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
		GridTemp temp;

        if(convertView == null) {
        	convertView = inflater.inflate(R.layout.tabhost_guide_item, null);
        	temp = new GridTemp();
        	temp.imageView = (ImageView) convertView.findViewById(R.id.tabhost_item_guide_gridview_iv);
        	temp.textView = (TextView) convertView.findViewById(R.id.tabhost_item_guide_gridview_tv);
            convertView.setTag(temp);
        }else{
            temp = (GridTemp) convertView.getTag();
        }
        temp.imageView.setImageResource(imageID[position]);
        temp.textView.setText(illustrates[position]);
        convertView.setId(ids[position]);   //设置ID
        convertView.setOnClickListener(new ClickListener());
        return convertView;    
	}

	//点击事件监听类
	private final class ClickListener implements View.OnClickListener{

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case 0:
				break;
			case 1:
				Intent intent = new Intent();
				intent.setClass(context, GuideDownloadActivity.class);
				context.startActivity(intent);
				break;
			case 2:
				Intent intent2 = new Intent();
				intent2.setClass(context, SiteActivity.class);
				context.startActivity(intent2);
				break;
			case 3:
				Intent intent3 = new Intent();
				intent3.setClass(context, HotelActivity.class);
				context.startActivity(intent3);
				break;
			case 4:
				Intent intent4 = new Intent();
				intent4.setClass(context, RestaurantActivity.class);
				context.startActivity(intent4);
				break;
			case 5:
				Intent intent5 = new Intent();
				intent5.setClass(context, ShoppingActivity.class);
				context.startActivity(intent5);
				break;
			case 6:
				Intent intent6 = new Intent();
				intent6.setClass(context, FunActivity.class);
				context.startActivity(intent6);
				break;
			case 7:
				Intent intent7 = new Intent();
				intent7.setClass(context, TrafficActivity.class);
				context.startActivity(intent7);
				break;
			case 8:
				Intent intent8 = new Intent();
				intent8.setClass(context,OverviewCityActivity.class);
				context.startActivity(intent8);
				break;
			case 9:
				break;
			case 10:
				break;
			}
			
		}
		
	}
	
}
