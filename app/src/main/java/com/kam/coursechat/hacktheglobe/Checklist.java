package com.kam.coursechat.hacktheglobe;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class Checklist extends AppCompatActivity {
    ListView checklistview;
    ArrayAdapter
    String[] instruction = {"The set of instructions for Urban Areas", "Evacuate your office!"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.main, menu);
        checklistview = (ListView) findViewById(R.id.wifiScanResList);
        checklistview.setEnabled(true);

        return true;
    }

}
