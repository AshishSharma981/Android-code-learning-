package com.app.androidcoder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void intro(View v) {
        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(i);

    }
    public void basics(View v) {
        Intent i = new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(i);

    }
    public void ui(View v) {
        Intent i = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(i);

    }
    public void inter(View v) {
        Intent i = new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(i);

    }
}

