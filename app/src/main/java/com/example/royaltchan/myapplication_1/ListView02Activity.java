package com.example.royaltchan.myapplication_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ListView02Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_view02);
        Intent intent = getIntent();
        ListView list_view = (ListView) findViewById(R.id.list_view);
        List<HashMap<String, String>> items =
                new ArrayList<HashMap<String, String>>();

        HashMap<String, String> record;
        record= new HashMap<String, String>();
        //String [] data = new String[1];
        //data[0] = "Taylor";
        //int layoutId = android.R.layout.simple_list_item_1;
        //ArrayAdapter<String> aa = new ArrayAdapter<String>(this, layoutId, data);
        //list_view.setAdapter(aa);
    }



}
