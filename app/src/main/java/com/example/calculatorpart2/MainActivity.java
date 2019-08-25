package com.example.calculatorpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static final String MY_KEY1 = "name_key1";
    static final String MY_KEY2 = "name_key2";

    EditText num1;
    EditText num2;
    Button funcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        funcBtn = findViewById(R.id.func_btn);

        funcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstNum = num1.getText().toString();
                num1.setText(firstNum);
                String secondNum = num2.getText().toString();
                num2.setText(secondNum);

                Intent intent = new Intent(MainActivity.this, FunctionActivity.class);
                intent.putExtra(MY_KEY1, firstNum);
                intent.putExtra(MY_KEY2, secondNum);
                startActivity(intent);

            }
        });
    }
}
