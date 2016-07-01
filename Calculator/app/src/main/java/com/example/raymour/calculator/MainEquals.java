package com.example.raymour.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainEquals extends AppCompatActivity {

    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_equals);

        sum = (TextView) findViewById(R.id.result1);

        Intent intent = getIntent();
        int num1 = intent.getIntExtra("editTextinput1", 0);
        int num2 = intent.getIntExtra("editTextinput2", 0);

        sum.setText(Integer.toString(num1 + num2));
    }
}
