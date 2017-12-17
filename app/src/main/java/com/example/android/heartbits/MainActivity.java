package com.example.android.heartbits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int idade = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void openboletim(View view) {
        Intent i = new Intent(this, boletim.class);
        startActivity(i);
    }

    public void openmedicoes(View view) {
        Intent i = new Intent(this, MedicoesAct.class);
        startActivity(i);
    }

    public void openetapas(View view){
        if (idade <= 1) {
            Intent i = new Intent(this, EtapasAct_1mes.class);
            startActivity(i);
        }
        if (idade > 1 && idade <= 3) {
            Intent i = new Intent(this, EtapasAct_3mes.class);
            startActivity(i);
        }
    }
    public void opencons(View view) {
        if (idade < 2) {
            Intent i = new Intent(this, primeiromes.class);
            startActivity(i);
        }
        if (idade >= 2 && idade < 3) {
            Intent i = new Intent(this, doismeses.class);
            startActivity(i);
        }
        if (idade >= 3 && idade < 4) {
            Intent i = new Intent(this, tresmeses.class);
            startActivity(i);
        }

    }
    public void openevents(View view){
        Intent i = new Intent(this, EventosAct.class);
        startActivity(i);
    }
    public void openmemorias(View view){
        Intent i = new Intent(this, MemoryMenu.class);
        startActivity(i);
    }

}
