package senatest.sena11.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import senatest.sena11.fragments.LetterMotherFragment;
import senatest.sena11.fragments.PoemFragment;
import senatest.sena11.utility.TitleInterface;

/**
 * Created by ekmil on 14/5/2016.
 */
public class PagerAdapterMother extends FragmentPagerAdapter {

    List<Fragment> listaFragments=new ArrayList<>();

    public PagerAdapterMother(FragmentManager fm) {
        super(fm);
        listaFragments.add(new LetterMotherFragment());
        listaFragments.add(new PoemFragment());
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return super.getPageTitle(position);
        TitleInterface titleInterface = (TitleInterface) listaFragments.get(position);
        return titleInterface.retornarTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return listaFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaFragments.size();
    }
}
