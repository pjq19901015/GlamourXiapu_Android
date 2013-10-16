package com.pjq.glamour_xiapu;

import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle; 
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast; 
import com.amap.mapapi.core.GeoPoint;
import com.amap.mapapi.core.OverlayItem;
import com.amap.mapapi.map.ItemizedOverlay;
import com.amap.mapapi.map.MapActivity;
import com.amap.mapapi.map.MapController;
import com.amap.mapapi.map.MapView; 
import com.amap.mapapi.map.Projection;
import com.pjq.listener.FunListClickListener;
import com.pjq.listener.HotelListClickListener;
import com.pjq.listener.MyClickListener;
import com.pjq.listener.RestaurantListClickListener;
import com.pjq.listener.ShoppingListClickListener;
import com.pjq.listener.SiteListClickListener;
import com.pjq.utils.Resources;

public class AutoNaviMapActivity extends MapActivity {
	public MapView mapView;
	private MapController mapController;
	private GeoPoint point;
	public View popView;  //点击时弹出的气泡框
	
	/**
	*显示栅格地图，启用内置缩放控件，并用MapController控制地图的中心点及Zoom级别
	*/
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.mapview);
		mapView = (MapView) this.findViewById(R.id.mapView);
		mapView.setBuiltInZoomControls(true);//设置启用内置的缩放控制软件
		mapController = mapView.getController(); //得到mMapView的控制权,可以用它控制和驱动平移和缩放
		point = new GeoPoint((int) (26.865378 * 1E6),
				(int) (120.004923 * 1E6));  //用给定的经纬度构造一个GeoPoint，单位是微度 (度 * 1E6)
		mapController.setCenter(point); 	//设置地图中心点
		mapController.setZoom(13);		//设置地图zoom级别
		
		Drawable marker = getResources().getDrawable(R.drawable.poi_attract);  //得到需要标在地图上的景点资源
		marker.setBounds(0, 0, marker.getIntrinsicWidth(), marker
				.getIntrinsicHeight());   //为maker定义位置和边界
		mapView.getOverlays().add(new OverItem(marker,
											   this,
											   Resources.geoListAttract,
											   new SiteListClickListener(this))); //添加ItemizedOverlay实例到mMapView
		
		Drawable markerHotel = getResources().getDrawable(R.drawable.poi_hotel);  //得到需要标在地图上的住宿资源
		markerHotel.setBounds(0, 0, marker.getIntrinsicWidth(), marker
				.getIntrinsicHeight());   //为maker定义位置和边界 
		mapView.getOverlays().add(new OverItem(markerHotel,
											   this,
											   Resources.geoListHotel,
											   new HotelListClickListener(this))); 
		
		Drawable markerFun = getResources().getDrawable(R.drawable.poi_fun);  //得到需要标在地图上的娱乐
		markerHotel.setBounds(0, 0, marker.getIntrinsicWidth(), marker
				.getIntrinsicHeight());   //为maker定义位置和边界 
		mapView.getOverlays().add(new OverItem(markerFun,
											   this,
											   Resources.geoListFun,
											   new FunListClickListener(this))); 
		
		marker = getResources().getDrawable(R.drawable.poi_restaurant);  //得到需要标在地图上的餐饮
		mapView.getOverlays().add(new OverItem(marker,
											   this,
											   Resources.geoListRestaurant,
											   new RestaurantListClickListener(this))); 
		
		marker = getResources().getDrawable(R.drawable.poi_shopping);  //得到需要标在地图上的购物 
		mapView.getOverlays().add(new OverItem(marker,
											   this,
											   Resources.geoListShopping,
											   new ShoppingListClickListener(this))); 
		
		//初始化popView
		popView = super.getLayoutInflater().inflate(R.layout.mapview_popview, null);
		mapView.addView(popView, new MapView.LayoutParams(MapView.LayoutParams.WRAP_CONTENT,MapView.LayoutParams.WRAP_CONTENT,
							null,MapView.LayoutParams.BOTTOM_CENTER));
		popView.setVisibility(View.GONE); //设置为不可见
		
		Toast.makeText(this, "当前SDK版本为：" + mapView.getReleaseVersion(), Toast.LENGTH_SHORT).show(); 
	}
	
	
	/**
	 * 覆盖物类
	 * @author pjq
	 *
	 */
	class OverItem extends ItemizedOverlay<OverlayItem>{
		private Drawable marker;
		private AutoNaviMapActivity mContext;
		private List<OverlayItem> geoList;
		private TextView textView;
		private ImageView imageView;
		private MyClickListener clickListener;
		
		/**
		 * 
		 * @param marker
		 * @param context
		 * @param geoList 覆盖物列表
		 * @param clickListener 事件监听器
		 */
		public OverItem(Drawable marker,Context context,List<OverlayItem> geoList,MyClickListener clickListener) {
			super(boundCenterBottom(marker));
			this.marker = marker;
			this.mContext = (AutoNaviMapActivity) context;
			this.geoList = geoList;
			this.clickListener = clickListener;
			clickListener.b = true;
			populate();  //createItem(int)方法构造item。一旦有了数据，在调用其它方法前，首先调用这个方法
		}
		
		

		@Override
		public void draw(Canvas canvas, MapView mapView, boolean shadow) {   
			// Projection接口用于屏幕像素点坐标系统和地球表面经纬度点坐标系统之间的变换
			Projection projection = mapView.getProjection();
			for(int i = size() -1; i >=0; i-- ){
				OverlayItem item = geoList.get(i);  // 得到给定索引的item
				// 把经纬度变换到相对于MapView左上角的屏幕像素坐标
				Point point = projection.toPixels(item.getPoint(), null);
			}
			super.draw(canvas,mapView, shadow);
			//调整一个drawable边界，使得（0，0）是这个drawable底部最后一行中心的一个像素
			boundCenterBottom(marker);
		}
		
		@Override
		protected OverlayItem createItem(int i) {
			return geoList.get(i);
		}

		@Override
		public int size() {
			return geoList.size();
		}
		
		/**
		 * 处理点击事件
		 * @param i 被点击的覆盖物的id
		 */
		@Override
		protected boolean onTap( int i) {
			setFocus(geoList.get(i));
			MapView.LayoutParams geoLp = (MapView.LayoutParams) mContext.popView.getLayoutParams();
			geoLp.point = geoList.get(i).getPoint();
			mContext.mapView.updateViewLayout(popView, geoLp);
			mContext.popView.setVisibility(View.VISIBLE);
			textView = (TextView) mContext.findViewById(R.id.mapview_popview_tv_title);
			textView.setText(geoList.get(i).getSnippet());//获得覆盖物的文本字段赋给气泡的文本框
			imageView = (ImageView) mContext.findViewById(R.id.mapview_popview_iv);
			clickListener.id = i;
			imageView.setOnClickListener(clickListener);
			return true;
		}
		
		@Override
		public boolean onTap(GeoPoint arg0, MapView arg1) {
			// TODO Auto-generated method stub
			return super.onTap(arg0, arg1);
		}
	}

}
