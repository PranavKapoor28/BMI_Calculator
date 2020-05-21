package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class WeightGainItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_gain_items);


        LinearLayout linearLayout1=findViewById(R.id.list1);
        LinearLayout linearLayout2=findViewById(R.id.list2);
        LinearLayout linearLayout3=findViewById(R.id.list3);
        LinearLayout linearLayout4=findViewById(R.id.list4);
        LinearLayout linearLayout5=findViewById(R.id.list5);
        LinearLayout linearLayout6=findViewById(R.id.list6);
        LinearLayout linearLayout7=findViewById(R.id.list7);
        LinearLayout linearLayout8=findViewById(R.id.list8);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),FoodDetails.class);
                startActivity(i);
            }
        });
    }
}
