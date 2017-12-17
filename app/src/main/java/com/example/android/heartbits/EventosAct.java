package com.example.android.heartbits;

import android.content.Intent;
import android.provider.CalendarContract;
import android.provider.CalendarContract.Events;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;

import java.util.Calendar;

public class EventosAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
    }

    public void abreconsultas(View view){
        Intent i = new Intent(this, Events_Consultas.class);
        startActivity(i);
    }

    public void abrevacinas(View view){
        Intent i = new Intent(this, Events_Vacinas.class);
        startActivity(i);
    }

    public void marcarconsulta(View view) {
        DatePicker date = (DatePicker) findViewById(R.id.date);
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(date.getYear(), date.getMonth(), date.getDayOfMonth(), 0, 0);
        Calendar endTime = Calendar.getInstance();
        endTime.set(date.getYear(), date.getMonth(), date.getDayOfMonth(), 23, 59);
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(Events.CONTENT_URI)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                .putExtra(Events.TITLE, "Consulta")
                .putExtra(Events.DESCRIPTION, "Consulta para o seu bebé")
                .putExtra(Events.EVENT_LOCATION, "Hospital de Braga");
        startActivity(intent);
    }
    public void marcarvacina(View view) {
        DatePicker date = (DatePicker) findViewById(R.id.date);
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(date.getYear(), date.getMonth(), date.getDayOfMonth(), 0, 0);
        Calendar endTime = Calendar.getInstance();
        endTime.set(date.getYear(), date.getMonth(), date.getDayOfMonth(), 23, 59);
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(Events.CONTENT_URI)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                .putExtra(Events.TITLE, "Vacina")
                .putExtra(Events.DESCRIPTION, "Vacina para o seu bebé")
                .putExtra(Events.EVENT_LOCATION, "Hospital de Braga");
        startActivity(intent);
    }
    public void marcaroutro(View view) {
        DatePicker date = (DatePicker) findViewById(R.id.date);
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(date.getYear(), date.getMonth(), date.getDayOfMonth(), 0, 0);
        Calendar endTime = Calendar.getInstance();
        endTime.set(date.getYear(), date.getMonth(), date.getDayOfMonth(), 23, 59);
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(Events.CONTENT_URI)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis());

        startActivity(intent);
    }
}
