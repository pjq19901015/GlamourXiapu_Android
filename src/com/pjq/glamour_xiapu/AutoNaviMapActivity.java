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
	public View popView;  //���ʱ���������ݿ�
	
	/**
	*��ʾդ���ͼ�������������ſؼ�������MapController���Ƶ�ͼ�����ĵ㼰Zoom����
	*/
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.mapview);
		mapView = (MapView) this.findViewById(R.id.mapView);
		mapView.setBuiltInZoomControls(true);//�����������õ����ſ������
		mapController = mapView.getController(); //�õ�mMapView�Ŀ���Ȩ,�����������ƺ�����ƽ�ƺ�����
		point = new GeoPoint((int) (26.865378 * 1E6),
				(int) (120.004923 * 1E6));  //�ø����ľ�γ�ȹ���һ��GeoPoint����λ��΢�� (�� * 1E6)
		mapController.setCenter(point); 	//���õ�ͼ���ĵ�
		mapController.setZoom(13);		//���õ�ͼzoom����
		
		Drawable marker = getResources().getDrawable(R.drawable.poi_attract);  //�õ���Ҫ���ڵ�ͼ�ϵľ�����Դ
		marker.setBounds(0, 0, marker.getIntrinsicWidth(), marker
				.getIntrinsicHeight());   //Ϊmaker����λ�úͱ߽�
		mapView.getOverlays().add(new OverItem(marker,
											   this,
											   Resources.geoListAttract,
											   new SiteListClickListener(this))); //���ItemizedOverlayʵ����mMapView
		
		Drawable markerHotel = getResources().getDrawable(R.drawable.poi_hotel);  //�õ���Ҫ���ڵ�ͼ�ϵ�ס����Դ
		markerHotel.setBounds(0, 0, marker.getIntrinsicWidth(), marker
				.getIntrinsicHeight());   //Ϊmaker����λ�úͱ߽� 
		mapView.getOverlays().add(new OverItem(markerHotel,
											   this,
											   Resources.geoListHotel,
											   new HotelListClickListener(this))); 
		
		Drawable markerFun = getResources().getDrawable(R.drawable.poi_fun);  //�õ���Ҫ���ڵ�ͼ�ϵ�����
		markerHotel.setBounds(0, 0, marker.getIntrinsicWidth(), marker
				.getIntrinsicHeight());   //Ϊmaker����λ�úͱ߽� 
		mapView.getOverlays().add(new OverItem(markerFun,
											   this,
											   Resources.geoListFun,
											   new FunListClickListener(this))); 
		
		marker = getResources().getDrawable(R.drawable.poi_restaurant);  //�õ���Ҫ���ڵ�ͼ�ϵĲ���
		mapView.getOverlays().add(new OverItem(marker,
											   this,
											   Resources.geoListRestaurant,
											   new RestaurantListClickListener(this))); 
		
		marker = getResources().getDrawable(R.drawable.poi_shopping);  //�õ���Ҫ���ڵ�ͼ�ϵĹ��� 
		mapView.getOverlays().add(new OverItem(marker,
											   this,
											   Resources.geoListShopping,
											   new ShoppingListClickListener(this))); 
		
		//��ʼ��popView
		popView = super.getLayoutInflater().inflate(R.layout.mapview_popview, null);
		mapView.addView(popView, new MapView.LayoutParams(MapView.LayoutParams.WRAP_CONTENT,MapView.LayoutParams.WRAP_CONTENT,
							null,MapView.LayoutParams.BOTTOM_CENTER));
		popView.setVisibility(View.GONE); //����Ϊ���ɼ�
		
		Toast.makeText(this, "��ǰSDK�汾Ϊ��" + mapView.getReleaseVersion(), Toast.LENGTH_SHORT).show(); 
	}
	
	
	/**
	 * ��������
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
		 * @param geoList �������б�
		 * @param clickListener �¼�������
		 */
		public OverItem(Drawable marker,Context context,List<OverlayItem> geoList,MyClickListener clickListener) {
			super(boundCenterBottom(marker));
			this.marker = marker;
			this.mContext = (AutoNaviMapActivity) context;
			this.geoList = geoList;
			this.clickListener = clickListener;
			clickListener.b = true;
			populate();  //createItem(int)��������item��һ���������ݣ��ڵ�����������ǰ�����ȵ����������
		}
		
		

		@Override
		public void draw(Canvas canvas, MapView mapView, boolean shadow) {   
			// Projection�ӿ�������Ļ���ص�����ϵͳ�͵�����澭γ�ȵ�����ϵͳ֮��ı任
			Projection projection = mapView.getProjection();
			for(int i = size() -1; i >=0; i-- ){
				OverlayItem item = geoList.get(i);  // �õ�����������item
				// �Ѿ�γ�ȱ任�������MapView���Ͻǵ���Ļ��������
				Point point = projection.toPixels(item.getPoint(), null);
			}
			super.draw(canvas,mapView, shadow);
			//����һ��drawable�߽磬ʹ�ã�0��0�������drawable�ײ����һ�����ĵ�һ������
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
		 * �������¼�
		 * @param i ������ĸ������id
		 */
		@Override
		protected boolean onTap( int i) {
			setFocus(geoList.get(i));
			MapView.LayoutParams geoLp = (MapView.LayoutParams) mContext.popView.getLayoutParams();
			geoLp.point = geoList.get(i).getPoint();
			mContext.mapView.updateViewLayout(popView, geoLp);
			mContext.popView.setVisibility(View.VISIBLE);
			textView = (TextView) mContext.findViewById(R.id.mapview_popview_tv_title);
			textView.setText(geoList.get(i).getSnippet());//��ø�������ı��ֶθ������ݵ��ı���
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
