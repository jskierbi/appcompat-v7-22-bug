package com.jskierbi.appcompat22test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.internal.widget.TintButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by jakub on 03/28/2015.
 */
public class MainFragment extends Fragment {

	@Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		LinearLayout layout = new LinearLayout(getActivity());
		layout.setOrientation(LinearLayout.VERTICAL);

		Button btn = new TintButton(getActivity());
		btn.setText("Click me!");
		btn.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View v) {

				Toast.makeText(getActivity(), "Clicked!", Toast.LENGTH_SHORT).show();
			}
		});
		layout.addView(btn);
		return layout;
	}
}
