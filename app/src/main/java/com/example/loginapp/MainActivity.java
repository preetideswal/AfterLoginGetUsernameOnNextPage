package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button button1;
    EditText editt1,editt2;
    String username= "preeti_deswal";
    String password="preeti2008";
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        editt1 = (EditText)findViewById(R.id.editText);
        editt2 = (EditText)findViewById(R.id.editText2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editt1.getText().toString().equals(username) &&
                        editt2.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(),
                            "successfully login",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(context, App2Activity.class);
                    intent.putExtra("c1", username);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "invalid username or password",Toast.LENGTH_LONG).show();



                }
            }
        });

        /*button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);
            }
            });*/
    }
}