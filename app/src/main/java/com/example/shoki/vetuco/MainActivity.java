package com.example.shoki.vetuco;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.menu,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText= (TextView) view;
        Toast.makeText(this, "Seleccionado " + myText.getText(), Toast.LENGTH_SHORT).show();

        //Se hace un switch case para que el spinner se meta en la seccion adecuada
      Intent i = null;
       switch(position){
           case 1:
               i = new Intent(MainActivity.this, Informacion.class);
               MainActivity.this.startActivity(i);
               break;
          case 2:
              i = new Intent(MainActivity.this, Galeria.class);
              MainActivity.this.startActivity(i);
              break;
          case 3:
              i = new Intent(MainActivity.this, Horario.class);
              MainActivity.this.startActivity(i);
              break;
           case 4:
               i = new Intent(MainActivity.this, Tarifas.class);
               MainActivity.this.startActivity(i);
               break;
           case 5:
               i = new Intent(MainActivity.this, Localizacion.class);
               MainActivity.this.startActivity(i);
               break;
           case 6:
               i = new Intent(MainActivity.this, Reserva.class);
               MainActivity.this.startActivity(i);
               break;
           case 7:
               i = new Intent(MainActivity.this, Contacto.class);
               MainActivity.this.startActivity(i);
               break;
            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
