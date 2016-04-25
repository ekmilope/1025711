package senatest.sena11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        String recibido = getIntent().getStringExtra("mensaje");

        TextView textView = (TextView)findViewById(R.id.text);
        textView.setText("ud recibió " + recibido);

    }
}
