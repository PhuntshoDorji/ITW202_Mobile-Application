package com.example.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String[] mColorArray={"red", "pink", "purple", "indigo", "blue", "light_blue", "green",
            "light_green", "lime", "yellow","amber", "orange", "deep_orange","brown", "grey"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv);
    }
    public void changeColor(View view){
        Random random= new Random();
        String colorName=mColorArray[random.nextInt(15)];
        int colorResourcesName= getResources().getIdentifier(colorName,"color",
                getApplicationContext().getPackageName());
        int colorRes= ContextCompat.getColor(this,colorResourcesName);
        textView.setTextColor(colorRes);
    }
}