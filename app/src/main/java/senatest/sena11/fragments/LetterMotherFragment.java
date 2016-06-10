package senatest.sena11.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import senatest.sena11.R;
import senatest.sena11.utility.TitleInterface;

/**
 * A simple {@link Fragment} subclass.
 */
public class LetterMotherFragment extends Fragment implements TitleInterface {

    Comunicacion comunicacion;

    @Override
    public String retornarTitle() {
        return "Carta";
    }

    public interface Comunicacion{
        public String leerTexo();
        public void enviardato(String dato);
    }
    public LetterMotherFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        comunicacion=(Comunicacion) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View vista =  inflater.inflate(R.layout.fragment_letter_mother, container, false);
        ImageView corazon = (ImageView)vista.findViewById(R.id.corazon);
        final TextView texto= (TextView)vista.findViewById(R.id.text);
        corazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   texto.setText(comunicacion.leerTexo());
            }
        });
        ImageView imagen= (ImageView) vista.findViewById(R.id.img2);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comunicacion.enviardato("holi :p");
            }
        });

        return vista;
    }

}
