package senatest.sena11.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import senatest.sena11.R;
import senatest.sena11.utility.TitleInterface;

/**
 * A simple {@link Fragment} subclass.
 */
public class PoemFragment extends Fragment implements TitleInterface {


    public PoemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_poem, container, false);
    }

    @Override
    public String retornarTitle() {
        return "Poema";
    }
}
