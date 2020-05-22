package com.example.laba1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        new Thread(new Runnable() {
            public void run() {
                try { Thread.sleep(2000); }
                catch (InterruptedException e) { e.printStackTrace(); }
                Intent intent = new Intent(MainActivity.this, SAcnivity.class);
                startActivity(intent);
                finish();
            }
        }).start();
    }
}
