package com.example.calculatorpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunctionActivity extends AppCompatActivity {

    static final String MY_KEY3 = "name_key";

    TextView num1Text;
    TextView num2Text;

    Button btnAdd, btnSub, btnMulti, btnDiv;

    double Val1, Val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        num1Text = findViewById(R.id.num1_text);
        num2Text = findViewById(R.id.num2_text);

        final Intent intent = getIntent();

        final String fNum = intent.getStringExtra(MainActivity.MY_KEY1);
        num1Text.setText(fNum);

        final String sNum = intent.getStringExtra(MainActivity.MY_KEY2);
        num2Text.setText(sNum);

        btnAdd = findViewById(R.id.btn_add);

        Val1 = Double.parseDouble(fNum);
        Val2 = Double.parseDouble(sNum);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double result;
                result = Val1 + Val2;
                String fResult = Double.toString(result);
                Intent intent = new Intent(FunctionActivity.this, EqualActivity.class);
                intent.putExtra(MY_KEY3, fResult);
                startActivity(intent);
            }
        });


        btnSub = findViewById(R.id.btn_sub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                result = Val1 - Val2;
                String fResult = Double.toString(result);
                Intent intent = new Intent(FunctionActivity.this, EqualActivity.class);
                intent.putExtra(MY_KEY3, fResult);
                startActivity(intent);
            }
        });


        btnMulti = findViewById(R.id.btn_multi);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                result = Val1 * Val2;
                String fResult = Double.toString(result);
                Intent intent = new Intent(FunctionActivity.this, EqualActivity.class);
                intent.putExtra(MY_KEY3, fResult);
                startActivity(intent);
            }
        });


        btnDiv = findViewById(R.id.btn_div);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result;
                result = Val1 / Val2;
                String fResult = Double.toString(result);
                Intent intent = new Intent(FunctionActivity.this, EqualActivity.class);
                intent.putExtra(MY_KEY3, fResult);
                startActivity(intent);
            }
        });
    }
}