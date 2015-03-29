package com.jskierbi.appcompat22test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends ActionBarActivity {

	private static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override protected void onResume() {

		super.onResume();
		ViewGroup vg = (ViewGroup) findViewById(android.R.id.content);
		Log.d(TAG, vg.getClass().getSimpleName());
		printTree(vg, 1);
	}

	public static void printTree(ViewGroup vg, int depth) {
		StringBuilder buffer = new StringBuilder();
		for (int j = 0; j < depth; ++j) buffer.append("==");
		for (int i = 0; i < vg.getChildCount(); ++i) {
			View v = vg.getChildAt(i);
			Log.d(TAG, buffer.toString() + v.getClass().getSimpleName());
			if (v instanceof ViewGroup) {
				printTree((ViewGroup) v, depth + 1);
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
