package com.example.android.heartbits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MemoryMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_menu);
    }
    public void openselectimage(View view){
        Intent i = new Intent(this, AndroidSelectImage.class);
        startActivity(i);

    }
}
