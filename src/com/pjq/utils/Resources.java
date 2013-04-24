package com.pjq.utils;

import java.util.ArrayList;
import java.util.List;

import com.amap.mapapi.core.GeoPoint;
import com.amap.mapapi.core.OverlayItem;


public class Resources {
	public static  List<OverlayItem> geoListAttract = new ArrayList<OverlayItem>(); //�����ڵ�ͼ�ϵĸ������б�
	public static  List<OverlayItem> geoListHotel = new ArrayList<OverlayItem>(); //ס���ڵ�ͼ�ϵĸ������б�
	public static  List<OverlayItem> geoListFun = new ArrayList<OverlayItem>(); //�����ڵ�ͼ�ϵĸ������б�
	public static  List<OverlayItem> geoListRestaurant = new ArrayList<OverlayItem>(); //�����ڵ�ͼ�ϵĸ������б�
	public static  List<OverlayItem> geoListShopping = new ArrayList<OverlayItem>(); //�����ڵ�ͼ�ϵĸ������б�
	public Resources() {
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (27.018033 * 1E6), (int) (120.138792 * 1E6)), null, "���Ϫ"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.493751 * 1E6), (int) (120.036454 * 1E6)), null, "����"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.919367 * 1E6), (int) (120.196433 * 1E6)), null, "���ƶ�"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.751640 * 1E6), (int) (120.096137 * 1E6)), null, "����"));
		geoListAttract.add(new OverlayItem(new GeoPoint((int) (26.794865 * 1E6), (int) (119.993432 * 1E6)), null, "ɳ��̲Ϳ"));
		
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.884971 * 1E6), (int) (120.020941 * 1E6)), null, "�۾����ʾƵ�"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.883750 * 1E6), (int) (120.012814 * 1E6)), null, "�¶�����Ƶ�"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.880180 * 1E6), (int) (120.013576 * 1E6)), null, "��8"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.881044 * 1E6), (int) (120.006790 * 1E6)), null, "�����ٴ�Ƶ�"));
		geoListHotel.add(new OverlayItem(new GeoPoint((int) (26.877180 * 1E6), (int) (120.005767 * 1E6)), null, "������Ƶ�"));
		
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.878643 * 1E6), (int) (120.002011 * 1E6)), null, "�Ļ��㳡"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.878643 * 1E6), (int) (120.001593 * 1E6)), null, "�ʼ�һ��KTV"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.881035 * 1E6), (int) (120.019428 * 1E6)), null, "�����Ļ���԰"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.886859 * 1E6), (int) (120.020550 * 1E6)), null, "�Ŵ��"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.883305 * 1E6), (int) (120.018213 * 1E6)), null, "�ٶ����ֻ���"));
		geoListFun.add(new OverlayItem(new GeoPoint((int) (26.886667 * 1E6), (int) (120.013177 * 1E6)), null, "ͬһ�׸�"));
		
		
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.886667 * 1E6), (int) (120.009177 * 1E6)), null, "����"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.881043 * 1E6), (int) (120.003511 * 1E6)), null, "���ֺ�ţ���"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.884050 * 1E6), (int) (120.013454 * 1E6)), null, "�������"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.883550 * 1E6), (int) (120.013014 * 1E6)), null, "�ֵܻ��"));
		geoListRestaurant.add(new OverlayItem(new GeoPoint((int) (26.878143 * 1E6), (int) (120.000293 * 1E6)), null, "�������ŵ�"));
		
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.881904 * 1E6), (int) (120.004611 * 1E6)), null, "����·"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.880043 * 1E6), (int) (120.003511 * 1E6)), null, "���н�"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.882544 * 1E6), (int) (120.010090 * 1E6)), null, "̫��·"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.884404 * 1E6), (int) (120.004611 * 1E6)), null, "��ʢ��������"));
		geoListShopping.add(new OverlayItem(new GeoPoint((int) (26.884804 * 1E6), (int) (120.005811 * 1E6)), null, "�Ͻְٻ�"));
	}
	
}
