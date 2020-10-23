package com.example.tema3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarCount(View view){
        Intent intent = new Intent(this, CountActivity.class);
        startActivity(intent);
    }

    public void lanzarAcceso(View view){
        Intent intent = new Intent(this, AccesoActivity.class);
        startActivity(intent);
    }
}