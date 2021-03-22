package com.example.todo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.send";
    private EditText send_message;

    public static final int TEXT_REQUEST = 1;
    private TextView txt_header;
    private  TextView txt_mssg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_message = findViewById(R.id.send);
        txt_header = findViewById(R.id.tv3);
        txt_mssg = findViewById(R.id.tv4);
    }

    public void Send(View view) {
        Intent obj = new Intent(this, MainActivity2.class);
        String message = send_message.getText().toString();
        obj.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(obj, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(MainActivity2.EXTRA_replyMessage);
                txt_header.setVisibility(View.VISIBLE);
                txt_mssg.setText(reply);
                txt_mssg.setVisibility(View.VISIBLE);
            }
        }
    }
}