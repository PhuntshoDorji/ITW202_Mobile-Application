package com.example.todo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_replyMessage = "com.example.todo4";
    private EditText txt_reply;

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
}