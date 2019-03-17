package com.kam.coursechat.hacktheglobe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class Checklist extends AppCompatActivity {
    ListView wifiListView;
    ArrayAdapter myAdapter;
    String[] instructions = {"Get out of your home/office", "Do not use the elevators", "Proceed directly to "}; //Add Instructions here
    String[] ruralInstructions = {" ", "Find shelter immediately", "Do not stray off roads without navigation"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
        if (globalData.getArea()) {
        myAdapter = new ArrayAdapter<String>(this, R.layout.content_checklist, instructions);
        }
        else{
            myAdapter = new ArrayAdapter<String>(this, R.layout.content_checklist, ruralInstructions);
        }
        wifiListView = (ListView) findViewById(R.id.wifiScanResList);
        wifiListView.setAdapter(myAdapter);
        wifiListView.setEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);
        wifiListView = (ListView) findViewById(R.id.wifiScanResList);
        wifiListView.setAdapter(myAdapter);
        wifiListView.setEnabled(true);

        return wifiListView.isEnabled();
    }

}
