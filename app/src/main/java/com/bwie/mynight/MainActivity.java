package com.bwie.mynight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Switch switch_btn;
    private ImageView image;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch_btn = (Switch) findViewById(R.id.switch_btn);
        image = (ImageView) findViewById(R.id.image);
        listview = (ListView) findViewById(R.id.listview);

    }
}
