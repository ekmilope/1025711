package senatest.sena11;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import senatest.sena11.adapter.PagerAdapterMother;
import senatest.sena11.fragments.LetterMotherFragment;
import senatest.sena11.fragments.PoemFragment;

public class MotherFragmentActivity extends AppCompatActivity
                implements  LetterMotherFragment.Comunicacion{

    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_fragment);

        //obtener viewpager
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        //setear adaptador
        PagerAdapterMother adapter =new PagerAdapterMother(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


        Button teQuiero=(Button)findViewById(R.id.button1);
        teQuiero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                if(fm.findFragmentByTag("fragment1")==null){
                    FragmentTransaction ft =fm.beginTransaction();
                  //  ft.add(R.id.contenedor1,new LetterMotherFragment(),
                  //          "fragment1");
                    ft.replace(R.id.contenedor1,new LetterMotherFragment(),
                            "fragment1");
                    ft.commit();
                }


            }
        });

        Button decir = (Button)findViewById(R.id.button2);
        decir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft =fm.beginTransaction();
                    ft.replace(R.id.contenedor1,new PoemFragment());
                    ft.commit();
            }
        });

        ImageButton borrar = (ImageButton)findViewById(R.id.button3);
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm=getSupportFragmentManager();
                if(fm.findFragmentByTag("fragment1")!=null) {
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment fragmentborrar = fm.findFragmentByTag("fragment1");
                    ft.remove(fragmentborrar);
                    ft.commit();
                }
            }
        });
        texto=(EditText)findViewById(R.id.edittext);
    }

    @Override
    public String leerTexo() {
        if(texto.getText().toString().isEmpty()){
            return "Feliz día";
        }else{
            return texto.getText().toString();
        }

    }

    @Override
    public void enviardato(String dato) {
        texto.setText(dato);
    }
}

/*1. Definir otro metodo en la interfaz
2. Implementar metodo en la actividad
3. Hacer que cuando de click a la otra imagen se llame ese método enviando un texto en el fragment
4. Con ese metodo obtener el texto enviado por el fragment en la actividad
5. Usar ese texto en la actiivad para reemplazar el edittext de la actividad*/

