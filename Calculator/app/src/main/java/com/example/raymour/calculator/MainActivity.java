package com.example.raymour.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        Button button = (Button) findViewById(R.id.button1);

        View.OnClickListener calcSum = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainEquals.class);
                intent.putExtra("editTextinput1", Integer.parseInt(editText1.getText().toString()));
                intent.putExtra("editTextinput2", Integer.parseInt(editText2.getText().toString()));
                startActivity(intent);
            }
        };

        button.setOnClickListener(calcSum);
    }
}