package com.example.healthify;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class BmiActivity extends AppCompatActivity {

    //Define layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);


        final EditText e1 = (EditText) findViewById(R.id.editText);
        final EditText e2 = (EditText) findViewById(R.id.editText2);


        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {

                final DecimalFormat d1=new DecimalFormat(".##");
                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();

                if(TextUtils.isEmpty(str1)){
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                    return;
                }

                if(TextUtils.isEmpty(str2)){
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                    return;
                }

//Get the user values from the widget reference


//Define the meaning of the bmi value

                float weight = Float.parseFloat(str1);
                float height = Float.parseFloat(str2);
                float bmiValue = calculateBMI(weight, height);
String bmi=d1.format(bmiValue);

                String bmiInterpretation = interpretBMI(bmiValue);
                Intent i=new Intent(getApplicationContext(),bmicalc.class);
                i.putExtra("value1",bmi);
                i.putExtra("value2",bmiInterpretation);

                startActivity(i);
/*
                tv4.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));
*/
            }
        });



    }

    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }

    // Interpret what BMI means
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "You Are Severely underweight";
        } else if (bmiValue < 18.5) {

            return "You Are Underweight";
        } else if (bmiValue < 25) {

            return "You Are Normal";
        } else if (bmiValue < 30) {

            return "You Are Overweight";
        } else {
            return "You Are Obese";
        }
    }
}