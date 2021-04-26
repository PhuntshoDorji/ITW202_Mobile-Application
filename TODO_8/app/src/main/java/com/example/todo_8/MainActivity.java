package com.example.todo_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private EditText editTextWeb, editTextLoca, editTextShare;
    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextWeb = findViewById(R.id.website);
        editTextLoca= findViewById(R.id.location);
        editTextShare= findViewById(R.id.share);
    }
    public void sendweb(View view){
        String txt = editTextWeb.getText().toString();
        Uri url = Uri.parse(txt);
        Intent obj = new Intent(Intent.ACTION_VIEW, url);

        if (obj.resolveActivity(getPackageManager()) != null){
            startActivity(obj);
        }

        else{
            Log.d("Implicit Intents", "Error Message");
        }

    }
    public void SendLocation(View view) {
        String txt = editTextLoca.getText().toString();
        Uri url = Uri.parse("geo:0,0?q=" + txt);
        Intent obj = new Intent(Intent.ACTION_VIEW, url);

        if (obj.resolveActivity(getPackageManager()) != null) {
            startActivity(obj);
        } else {
            Log.d("Implicit Intents", "Error Message");
        }
    }
    public void ShareTxt(View view){
        BreakIterator editTextTxt;
        String txt = editTextShare.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(txt)
                .startChooser();
    }
}