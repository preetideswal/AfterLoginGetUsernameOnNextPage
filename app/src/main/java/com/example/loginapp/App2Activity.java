package com.example.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class App2Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        String str = i.getStringExtra("c1");
        TextView t1 = (TextView )findViewById(R.id.edit11);
        t1.setText("Welcome!\n "+str);
    }

}