package com.example.todo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_replyMessage = "com.example.todo4";
    private EditText txt_reply;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent obj = getIntent();
        String message = obj.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textview = findViewById(R.id.tv2);
        textview.setText(message);
        txt_reply = findViewById(R.id.reply);
    }

    public void Reply(View view) {
        Intent obj = new Intent();
        String rMessage = txt_reply.getText().toString();
        obj.putExtra(EXTRA_replyMessage, rMessage);
        setResult(RESULT_OK, obj);
        finish();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onResume(){

        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    public void onStop(){

        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }
    @Override
    public void onDestroy(){

        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}