package com.tapum.rideon.la;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import com.tapum.rideon.lib.R;


public class RideonLAMainActivity extends ActionBarActivity {

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.top_menu, menu);
		return true;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("onCreate", "onCreate");
		super.onCreate(savedInstanceState);
//		metroLinks();
		// Intent intent = new Intent(getApplicationContext(),
		// GtfsRouteActivity.class);
		// String agencyId = "Metrolink";
		// intent.putExtra("gtfsAgencyId", agencyId);
		// startActivity(intent);
	}

//	public void metroLinks() {
//
//	}

}
