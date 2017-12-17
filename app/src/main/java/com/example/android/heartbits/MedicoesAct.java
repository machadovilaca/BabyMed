package com.example.android.heartbits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MedicoesAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicoes);}

    public void abrepeso(View view) {
        Intent i = new Intent(this, medir_peso.class);
        startActivity(i);
    }

    public void abrealtura(View view) {
        Intent i = new Intent(this, medir_altura.class);
        startActivity(i);
    }

    public void abreperimetro(View view) {
        Intent i = new Intent(this, medir_perimetro.class);
        startActivity(i);
    }

}