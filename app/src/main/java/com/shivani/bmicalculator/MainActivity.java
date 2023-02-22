package com.shivani.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;
    Button calculate;

    TextView BMI_calculator,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        calculate = findViewById(R.id.btnCalculate);
        result = findViewById(R.id.result);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                float w = Float.parseFloat(weight.getText().toString())/100;
                float h = Float.parseFloat(height.getText().toString());
                float bmi =w/(h*h);
                result.setText(String.valueOf(bmi));

            }
        });

    }
}