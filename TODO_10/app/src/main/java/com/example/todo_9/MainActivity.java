package com.example.todo_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText text1, text2;
    private Calculator calc;
    private TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.tv1);
        text2= findViewById(R.id.tv2);
        tView= findViewById(R.id.tv3);
        calc= new Calculator();
    }
    public void Add(View view){
        String operandOne= text1.getText().toString();
        String operandTwo= text2.getText().toString();

        double value= calc.Add(Double.valueOf(operandOne),Double.valueOf(operandTwo));
        tView.setText(String.valueOf(value));

        Log.d("Debugging", "Hello Debugging");
    }

    public void Sub(View view){
        String operandOne= text1.getText().toString();
        String operandTwo= text2.getText().toString();

        double value= calc.Sub(Double.valueOf(operandOne),Double.valueOf(operandTwo));
        tView.setText(String.valueOf(value));

        Log.d("Debugging", "Hello Debugging");
    }

    public void Mul(View view){
        String operandOne= text1.getText().toString();
        String operandTwo= text2.getText().toString();

        double value= calc.Mul(Double.valueOf(operandOne),Double.valueOf(operandTwo));
        tView.setText(String.valueOf(value));

        Log.d("Debugging", "Hello Debugging");
    }

    public void Div(View view){
        String operandOne= text1.getText().toString();
        String operandTwo= text2.getText().toString();

        double value= calc.Div(Double.valueOf(operandOne),Double.valueOf(operandTwo));
        tView.setText(String.valueOf(value));

        Log.d("Debugging", "Hello Debugging");
    }



}