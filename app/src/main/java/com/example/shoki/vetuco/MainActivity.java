package com.example.shoki.vetuco;

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
       // Intent intent = new Intent(this.tarifas.class);
        //EditText editText = (EditText) findViewById(R.id.spinner);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);
     // Intent i = null;
      // switch(position){
       //   case 1:
          //    Intent i = new Intent(MainActivity.this, tarifas.class);
        //      break;
         // case 2:
             //  i = new Intent(MainActivity.this, contacto.class);
         //      break;
         //   }
        //MainActivity.this.startActivity(i);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
