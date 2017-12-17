package com.example.android.heartbits;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class tresmeses extends AppCompatActivity {
    boolean excessodepeso=true;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conselhotresmes);
        if (excessodepeso==true){
            LinearLayout layout = (LinearLayout) findViewById(R.id.Layout);
            TextView tv = new TextView(this);

            tv.setText("Especial Criança com excesso de Peso: Não amamente em demasia o seu bebé, mesmo que chore por comida");
            tv.setTextSize(20);
            tv.setTextColor(Color.parseColor("#e67300"));
            tv.setPadding(30,500,20,20);

            layout.addView(tv);
        }
    }
}
