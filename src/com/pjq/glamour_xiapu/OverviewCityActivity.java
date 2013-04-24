package com.pjq.glamour_xiapu;

import com.pjq.glamour_xiapu.R;

import android.app.Activity; 
import android.os.Bundle;
import android.view.Window; 
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class OverviewCityActivity extends Activity {
	private TextView textView;
	private TextView textView1;
	private TextView textView2;
	private String message = 
		"         霞浦位于福建省宁德市，坐座在海峡西岸东北翼，与台湾省隔海相望，土地面积1489.6平方公里，" +
		"海岸线长进迂回曲折长达400多公里，有大小岛屿194个，浅海滩涂面积104万亩，" +
		"位居全国首位。全县辖2个街道，12个乡镇，总人口52万。\n" +
		"         霞浦历史修久，文化底蕴丰厚，是闽东最古老的县份。建县1720多年，曾经是闽东的政治、经济和文化中心。" +
		"沙江镇小马村的“黄瓜山贝丘遗址”证明早在新石器时代 不有人类居住。" +
		"中日文化交流的使用——日本空海大师，理学家朱熹，民族英雄文天祥等都在此留下他的足迹。" +
		"虎镇塔、建善寺、松山天后宫、空海纪念堂、大京古城堡、玉山佛城，无不是中华民族文明、智慧的结晶。\n" +
		"         霞浦依山临海，风情别致，自然风光旖旎，素有“海滨邹鲁”之誉。这里上天给予特别的恩赐，" +
		"山青、水秀、石怪、洞奇、村异。涵江葛洪山、三沙留云洞、高罗沙滩、大京沙滩、东安鱼排、杨家溪竹筏、枫林、" +
		"古榕群等等构成了一幅幅美丽的天然画卷。\n" +
		"         霞浦滩滩风光迷人，这里碧海园溢彩，滩涂铺金水波潋滟，绿野流舟。潮浊时宅和大海浑然一体，" +
		"有着“天接云涛连晓雾，星河欲转干船舞”的辽阔和壮美。退潮时它裸露出迷人的风采，" +
		"有着“滩涂鳞江潮潮新金沙抹光朝朝迷”的遐想和激情。当惩亲临霞浦，那奇妙诡谲的海竹竿影、" +
		"线杆韵律；那梦幻般的海上家园；那金色沙滩上自然造化的涂鸦大作；那港湾远空的一抹江霞束光；" +
		"那荡在天际边的日落日出，船儿星星点点；那绵延无边的挂蛎、紫菜和海带；" +
		"还有那金色沙滩上晾晒着碧绿唐网和织网姑娘，以及满载而归的讨海人和拾贝人，" +
		"等等被誉为“中国最美的滩涂”，摄影人的圣地。\n" +
		"         霞浦物产丰富，是“中国海带之乡”、“中国紫菜之乡”。" +
		"这里有海洋鱼类700多种，滩涂生物200余种。大黄鱼、石斑鱼、弹涂鱼、鲍鱼和海带、紫菜、牡蛎、" +
		"海参及蟹、鲟、虾、蛏蛤、蚶等饮誉省内外。东吾洋沿岸的晚熟荔枝、龙眼和沙江的榨菜、" +
		"崇儒的李干以及元宵茶、富锌茶等特产闻名遐迩。\n" +
		"         霞浦交通便捷，城市功能齐全。" +
		"沈海高速横穿县城，福温铁路，霞浦机场与三沙、溪南深水港口将使霞浦成为闽东的交通枢纽。" +
		"发达的路网，星级酒店，豪华商场等完善的城市功能设施，" +
		"将为四海滨朋营造一个“食、住、行、游、购、娱”的良好旅游环境，霞浦犹为一个璀灿的明珠，" +
		"镶嵌在东海之宾，将更加加美丽富饶、繁荣昌盛。\n";  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_overviewcity);
		
		textView = (TextView) this.findViewById(R.id.activity_overviewcity_textview);
		textView.setText(message);
	}
	
}
