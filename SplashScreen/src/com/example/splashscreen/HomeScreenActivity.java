package com.example.splashscreen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeScreenActivity extends Activity {
	private static final int ITEMS_COUNT = 20;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		addItemsToList();
	}

	/**
	 * Add items to ListView.
	 */
	private void addItemsToList() {

		ListView listView = (ListView) findViewById(R.id.listView);
		String[] items = new String[ITEMS_COUNT];

		for (int i = 0; i < ITEMS_COUNT; i++) {
			items[i] = "item " + (i + 1);
		}

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.my_list_item, items);

		listView.setAdapter(adapter);
	}
}