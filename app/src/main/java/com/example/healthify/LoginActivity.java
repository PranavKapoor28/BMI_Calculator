package com.example.healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText ed = (EditText) findViewById(R.id.e2);
        final EditText ed1 = (EditText) findViewById(R.id.e3);
        /*
        final TextView tv4 = (TextView) findViewById(R.id.textView);*/

        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String email = ed.getText().toString();
                String pwd = ed1.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    ed.setError("Please enter your Email");
                    ed.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(pwd)) {
                    ed1.setError("Please enter your Password");
                    ed1.requestFocus();
                    return;
                }

//Get the user values from the widget reference


//Define the meaning of the bmi value

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra(email, "value1");
                i.putExtra(pwd, "value2");

                startActivity(i);
/*
                tv4.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));
*/
            }
        });
    }
}
