package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class bmicalc extends AppCompatActivity {
    TextView tv;
    TextView tv1;
    String str1;
    String str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);

        tv = findViewById(R.id.textView5);
        tv1=findViewById(R.id.textView15);

        Intent receiveIntent=getIntent();

        str1   = receiveIntent.getStringExtra("value1");
        str2  = receiveIntent.getStringExtra("value2");


        tv.setText(String.valueOf(str1));
tv1.setText((String.valueOf(str2)));

    }


}
