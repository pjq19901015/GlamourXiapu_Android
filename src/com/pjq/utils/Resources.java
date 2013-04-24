package com.pjq.utils;

import java.util.ArrayList;
import java.util.List;

import com.amap.mapapi.core.GeoPoint;
import com.amap.mapapi.core.OverlayItem;


public class Resources {
	public static  List<OverlayItem> geoListAttract = new ArrayList<OverlayItem>(); //景点在地图上的覆盖物列表
	public static  List<OverlayItem> geoListHotel = new ArrayList<OverlayItem>(); //住宿在地图上的覆盖物列表
	public static  List<OverlayItem> geoListFun = new ArrayList<OverlayItem>(); //娱乐在地图上的覆盖物列表
	public static  List<OverlayItem> geoListRestaurant = new ArrayList<OverlayItem>(); //餐饮在地图上的覆盖物列表
	public static  List<OverlayItem> geoListShopping = new ArrayList<OverlayItem>(); //购物在地图上的覆盖物列表
	public Resources() {
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (27.018033 * 1E6), (int) (120.138792 * 1E6)), null, "杨家溪"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.493751 * 1E6), (int) (120.036454 * 1E6)), null, "西洋岛"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.919367 * 1E6), (int) (120.196433 * 1E6)), null, "留云洞"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.751640 * 1E6), (int) (120.096137 * 1E6)), null, "高罗"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.794865 * 1E6), (int) (119.993432 * 1E6)), null, "沙江滩涂"));
		
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.884971 * 1E6), (int) (120.020941 * 1E6)), null, "帝景国际酒店"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.883750 * 1E6), (int) (120.012814 * 1E6)), null, "新东方大酒店"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.880180 * 1E6), (int) (120.013576 * 1E6)), null, "速8"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.881044 * 1E6), (int) (120.006790 * 1E6)), null, "曼哈顿大酒店"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.877180 * 1E6), (int) (120.005767 * 1E6)), null, "环岛大酒店"));
		
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.878643 * 1E6), (int) (120.002011 * 1E6)), null, "文化广场"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.878643 * 1E6), (int) (120.001593 * 1E6)), null, "皇家一号KTV"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.881035 * 1E6), (int) (120.019428 * 1E6)), null, "福宁文化公园"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.886859 * 1E6), (int) (120.020550 * 1E6)), null, "九大馆"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.883305 * 1E6), (int) (120.018213 * 1E6)), null, "百度音乐会所"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.886667 * 1E6), (int) (120.013177 * 1E6)), null, "同一首歌"));
		
		
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.886667 * 1E6), (int) (120.009177 * 1E6)), null, "糊汤"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.881043 * 1E6), (int) (120.003511 * 1E6)), null, "老字号牛肉馆"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.884050 * 1E6), (int) (120.013454 * 1E6)), null, "天天面馆"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.883550 * 1E6), (int) (120.013014 * 1E6)), null, "兄弟火锅"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.878143 * 1E6), (int) (120.000293 * 1E6)), null, "盐田大弟排挡"));
		
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.881904 * 1E6), (int) (120.004611 * 1E6)), null, "龙首路"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.880043 * 1E6), (int) (120.003511 * 1E6)), null, "步行街"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.882544 * 1E6), (int) (120.010090 * 1E6)), null, "太康路"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.884404 * 1E6), (int) (120.004611 * 1E6)), null, "百盛购物中心"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.884804 * 1E6), (int) (120.005811 * 1E6)), null, "南街百货"));
	}
	
}
