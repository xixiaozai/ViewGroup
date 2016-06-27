package com.example.myviewgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Scroller;

public class MyViewGroup extends LinearLayout {
	// 滚动器对象
	private Scroller mScroller;
	// 每次移动距离
	private int space = 10;

	public MyViewGroup(Context context) {
		super(context);
		initCustomLinearlayout(context);
	}

	private void initCustomLinearlayout(Context context) {
		// TODO Auto-generated method stub
		mScroller = new Scroller(context);

	}

	public MyViewGroup(Context context, AttributeSet attr) {
		// TODO Auto-generated constructor stub
		super(context, attr);
		initCustomLinearlayout(context);

	}

	public void right() {  
		mScroller.startScroll(mScroller.getCurrX(), mScroller.getCurrY(),
				-space, 0, 250);
		invalidate();
	}

	public void left() {
		mScroller.startScroll(mScroller.getCurrX(), mScroller.getCurrY(),
				space, 0, 250);
		invalidate();
	}

	public void top() {
		mScroller.startScroll(mScroller.getCurrX(), mScroller.getCurrY(), 0,
				space, 250);
		invalidate();
	}

	public void button() {
		mScroller.startScroll(mScroller.getCurrX(), mScroller.getCurrY(), 0,
				-space, 250);
		invalidate();
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		// TODO Auto-generated method stub
		super.onLayout(changed, l, t, r, b);
	}

	@Override
	public void computeScroll() {
		// TODO Auto-generated method stub
		// 判斷滾動是否結束
		if (!mScroller.isFinished()) {
			if (mScroller.computeScrollOffset()) {
				scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
				invalidate();
			}
		}

	}
}
