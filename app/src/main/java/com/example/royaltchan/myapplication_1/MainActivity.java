package com.example.royaltchan.myapplication_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;

import static android.widget.AdapterView.OnItemSelectedListener;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arrayData;
        arrayData = new String[]{"One", "Two", "Three"};
        Spinner spinner01 = (Spinner) findViewById(R.id.spinner01);
        Spinner spinner02 = (Spinner) findViewById(R.id.spinner02);
        final EditText text01 = (EditText) findViewById(R.id.input01);
        final Button enter = (Button) findViewById(R.id.enter);

        int layoutId01 = R.layout.spinner_dropdown;

        final ArrayList<String> listData = new ArrayList<String>();
        listData.add("Apple");
        listData.add("Orange");
        listData.add("Car");
        final ArrayAdapter<String> aa01 = new ArrayAdapter<String>(this, layoutId01, listData);
        aa01.setDropDownViewResource(layoutId01);
        spinner01.setAdapter(aa01);
        spinner02.setAdapter(aa01);
        spinner01.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String sInfo = parent.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, sInfo, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String inputText = text01.getText().toString();
                enter.animate();
                listData.add(inputText);
                Toast.makeText(MainActivity.this, "You input " + inputText + "!", Toast.LENGTH_SHORT).show();
                aa01.notifyDataSetChanged();

            }
        });
    }
    public void start(View v) {
        Intent intent = new Intent(this, ListView02Activity.class);
        startActivity(intent);

        }






}
