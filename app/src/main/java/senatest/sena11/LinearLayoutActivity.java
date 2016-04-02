package senatest.sena11;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_example);
/*
        ImageView imageView=(ImageView)findViewById(R.id.yellow);//obtengo referencia de algun elemento
        ViewGroup contenedor=(ViewGroup) imageView.getParent(); // obtengo el parent o viewgroup de ese elemento
        TextView textView=new TextView(this); //creo un textview por codigo
        textView.setText("AMARILLO"); // agrego propiedades al textview
        contenedor.addView(textView); //agrego el view al contenedor

*/
    }
}
