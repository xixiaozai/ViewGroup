package com.example.myviewgroup;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	private Button left, right, top, down;
	private MyViewGroup myViewGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WindowManager vm = (WindowManager) this
				.getSystemService(Context.WINDOW_SERVICE);
		// 屏幕宽高
		int width = vm.getDefaultDisplay().getWidth();
		int height = vm.getDefaultDisplay().getHeight();

		// 获取自定义的viewgroup
		myViewGroup = (MyViewGroup) findViewById(R.id.myViewGroup);
		// 动态定义一个TextView
		TextView text = new TextView(this);
		text.setWidth(100);
		text.setHeight(100);
		text.setLayoutParams(new LayoutParams(80, 80));
		text.setBackgroundResource(R.drawable.ic_launcher);
		myViewGroup.setGravity(Gravity.CENTER);
		myViewGroup.addView(text);

		initView();
		left.setOnClickListener(this);
		right.setOnClickListener(this);
		top.setOnClickListener(this);
		down.setOnClickListener(this);
	}

	private void initView() {
		// TODO Auto-generated method stub
		left = (Button) findViewById(R.id.leftbtn);
		right = (Button) findViewById(R.id.rightbtn);
		top = (Button) findViewById(R.id.topbtn);
		down = (Button) findViewById(R.id.downbtn);
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch (view.getId()) {
		case R.id.leftbtn:
			myViewGroup.left();
			break;
		case R.id.rightbtn:
			myViewGroup.right();
			break;
		case R.id.topbtn:
			myViewGroup.top();
			break;
		case R.id.downbtn:
			myViewGroup.button();
			break;

		}
	}

}
