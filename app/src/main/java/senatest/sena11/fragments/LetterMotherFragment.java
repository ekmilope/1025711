package senatest.sena11.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import senatest.sena11.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LetterMotherFragment extends Fragment {


    public LetterMotherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_letter_mother, container, false);
    }

}