package senatest.sena11;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //TextView texto = (TextView) findViewById(R.id.text_texto1);
        //texto.setText("bienvenidos sena");

        setContentView(R.layout.edittext);

        texto = (EditText) findViewById(R.id.text_texto2);
        imageView=(ImageView) findViewById(R.id.imageview);
        texto.getText().toString();
        texto.setText("bienvenidos sena");
        Log.d("ETIQUETA", "MENSAJE");
    }

    public void hacerClick(View view){
       texto.getText().toString();
        texto.setText("ud presionó click");
        imageView.setImageResource(R.drawable.button_background);
    }

}
