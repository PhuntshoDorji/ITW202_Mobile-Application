package com.example.todo_12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.todo_12";
    String mssg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void Donut(View view) {
        mssg = getString(R.string.donut_order);
        displayToast(mssg);
    }

    public void IceCream(View view) {
        mssg = getString(R.string.iceCream_order);
        displayToast(mssg);    }

    public void Froyo(View view) {
        mssg = getString(R.string.froyo_order);
        displayToast(mssg);    }

    public void call(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_MESSAGE, mssg);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.order:
                Intent intent= new Intent(this,MainActivity2.class);
                intent.putExtra(EXTRA_MESSAGE, mssg);
                startActivity(intent);
                return true;
            case R.id.contact:
                displayToast("You selected contact");
                return true;
            case R.id.favourites:
                displayToast("You selected favorites");
                return true;
            case R.id.status:
            displayToast("you selected status");
            return true;
        }
    return super.onOptionsItemSelected(item);
    }
}