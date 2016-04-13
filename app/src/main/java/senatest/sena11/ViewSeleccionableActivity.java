package senatest.sena11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import senatest.sena11.adapter.AnimeAdapter;

public class ViewSeleccionableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_seleccionable);

        ListView listView =(ListView) findViewById(R.id.lista);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        AutoCompleteTextView autoCompleteTextView=(AutoCompleteTextView)
                findViewById(R.id.autocomplete);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] arregloPeliculas = getResources().getStringArray(R.array.peliculas);
                Log.d("lista", "ud seleccionó " + arregloPeliculas[position]);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] arregloPeliculas = getResources().getStringArray(R.array.peliculas);
                Log.d("spinner", "ud selecciono del spinner " + arregloPeliculas[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        String [] arreglo ={"natalia","michael","cristian","valentina","lorena"};

        ArrayAdapter adaptadorDefault= new ArrayAdapter(this,android.R.layout.simple_list_item_1
                , arreglo);

        ArrayAdapter adaptadorPersonalizadoArray=
                new ArrayAdapter(this,R.layout.item_personas,R.id.text1,arreglo);

        AnimeAdapter animeAdapter=new AnimeAdapter(this);


        listView.setAdapter(animeAdapter);
        spinner.setAdapter(adaptadorPersonalizadoArray);
        autoCompleteTextView.setAdapter(adaptadorDefault);


    }
}
