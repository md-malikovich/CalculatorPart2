package com.example.calculatorpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EqualActivity extends AppCompatActivity {

    TextView resultText;
    Button btnEqual;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equal);

        resultText = findViewById(R.id.result_text);
        btnEqual = findViewById(R.id.btn_equal);
        btnShare = findViewById(R.id.btn_share);

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();
                String result = intent.getStringExtra(FunctionActivity.MY_KEY3);
                resultText.setText("Абай, результатом сложнейших математических уровнений является число " + result);
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String letter = resultText.getText().toString();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, letter);
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
