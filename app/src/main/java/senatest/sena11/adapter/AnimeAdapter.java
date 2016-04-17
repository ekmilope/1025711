package senatest.sena11.adapter;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import senatest.sena11.R;
import senatest.sena11.entidad.Anime;

/**
 * Created by ekmil on 9/4/2016.
 */
public class AnimeAdapter extends BaseAdapter {

    List<Anime> listaAnime;
    Context context;

    public AnimeAdapter(Context context1){
        listaAnime=Anime.crearListaAnime();
        context=context1;

    }

    @Override
    public int getCount() {
        return listaAnime.size();
    }

    @Override
    public Object getItem(int position) {
        return listaAnime.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if(convertView==null){
           v= View.inflate(context, R.layout.anime_item,null);
        }else{
            v=convertView;
        }
        TextView textoAnime=(TextView) v.findViewById(R.id.text_nombre);
        TextView textoAutor=(TextView) v.findViewById(R.id.text_autor);
        TextView textoAnio=(TextView) v.findViewById(R.id.text_anio);
        ImageView imageView = (ImageView)v.findViewById(R.id.imagen);

//usemos picasso:

        Picasso.with(context).load(listaAnime.get(position).getUrl()).resize(200,200).rotate(45).into(imageView);


        textoAnime.setText( listaAnime.get(position).getNombre() );
        textoAutor.setText( listaAnime.get(position).getAutor() );
        textoAnio.setText( listaAnime.get(position).getAnio() );

        return v;
    }
}
