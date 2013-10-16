package com.pjq.glamour_xiapu;

import com.pjq.utils.Resources;

import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class TabHostActivity extends TabActivity {
	private TabHost tabhost;
	private RadioGroup group;
	private static final String TAB_PLAN = "tabPlan"; // ��ǩ��ʾ��
	private static final String TAB_MAP = "tabMap";
	private static final String TAB_GUIDE = "tabGuide";
	private static final String TAB_COMMENT = "tabComment";
	private static final String TAB_MORE = "tabMore";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); // �����ޱ�����
		setContentView(R.layout.tabhost);
		group = (RadioGroup) this.findViewById(R.id.tabhost_radiogroup);
		tabhost = this.getTabHost();
		new Resources();// ��ʼ����Դ

		// ��ӱ�ǩ
		tabhost.addTab(tabhost.newTabSpec(TAB_PLAN).setIndicator(TAB_PLAN)
				.setContent(
						new Intent(TabHostActivity.this, PlanActivity.class)));
		tabhost.addTab(tabhost.newTabSpec(TAB_MAP).setIndicator(TAB_MAP)
				.setContent(
						new Intent(TabHostActivity.this,
								AutoNaviMapActivity.class)));
		tabhost.addTab(tabhost.newTabSpec(TAB_GUIDE) // ��ǩid
				.setIndicator(TAB_GUIDE) // ���֣�ͼ��
				.setContent(
						new Intent(TabHostActivity.this, GuideActivity.class))); // ��ʾ����
		tabhost
				.addTab(tabhost.newTabSpec(TAB_COMMENT).setIndicator(
						TAB_COMMENT)
						.setContent(
								new Intent(TabHostActivity.this,
										CommentActivity.class)));
		tabhost
				.addTab(tabhost.newTabSpec(TAB_MORE).setIndicator(TAB_MORE)
						.setContent(
								new Intent(TabHostActivity.this,
										Morectivity.class)));
		tabhost.setCurrentTab(2); // ����Ĭ����ʾ�ı�ǩ

		group.setOnCheckedChangeListener(new CheckedChangeListener());
	}

	/**
	 * ��ǩ�ı������
	 * 
	 * @author pjq
	 * 
	 */
	private final class CheckedChangeListener implements
			OnCheckedChangeListener {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			switch (checkedId) {
			case R.id.tabhost_radiobutton_plan:
				tabhost.setCurrentTabByTag(TAB_PLAN);
				break;
			case R.id.tabhost_radiobutton_map:
				tabhost.setCurrentTabByTag(TAB_MAP);
				break;
			case R.id.tabhost_radiobutton_guide:
				tabhost.setCurrentTabByTag(TAB_GUIDE);
				break;
			case R.id.tabhost_radiobutton_comment:
				tabhost.setCurrentTabByTag(TAB_COMMENT);
				break;
			case R.id.tabhost_radiobutton_more:
				tabhost.setCurrentTabByTag(TAB_MORE);
				break;
			}
		}
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.KEYCODE_BACK
				&& event.getAction() == event.ACTION_DOWN) {
			new AlertDialog.Builder(this).setTitle("ע��").setMessage(
					"��ȷ��Ҫ�˳�����ϼ����").setNegativeButton("ȡ��",
					new OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {

						}
					}).setPositiveButton("ȷ��", new OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					finish();
				}
			}).show();
			return true;
		} else {
			return super.dispatchKeyEvent(event);
		}
	}
}
