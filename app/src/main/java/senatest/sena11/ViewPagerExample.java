package senatest.sena11;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import senatest.sena11.adapter.PagerAdapterMother;
import senatest.sena11.fragments.LetterMotherFragment;

public class ViewPagerExample extends AppCompatActivity implements  LetterMotherFragment.Comunicacion {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_example);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);
        FragmentManager fm  =getSupportFragmentManager();
        PagerAdapterMother pagerAdapterMother= new PagerAdapterMother(fm);

        viewPager.setAdapter(pagerAdapterMother);

    }

    @Override
    public String leerTexo() {
        return "hola";
    }

    @Override
    public void enviardato(String dato) {

    }
}
