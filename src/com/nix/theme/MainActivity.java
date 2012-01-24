package com.nix.theme;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView listView = (ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.rowlayout, R.id.label, values);
        listView.setAdapter(adapter);
    }
    private static String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
			"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
			"Linux", "OS/2" };
}