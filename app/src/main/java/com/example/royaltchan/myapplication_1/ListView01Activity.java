package com.example.royaltchan.myapplication_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;


public class ListView01Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_view01);
        Intent intent = getIntent();
        ListView list_view = (ListView) findViewById(R.id.list_view);
        String [] data = new String[1];
        data[0] = "Taylor";
        int layoutId = android.R.layout.simple_list_item_1;
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, layoutId, data);
        list_view.setAdapter(aa);
    }



}
