package senatest.sena11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pantalla1Activity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);


        editText = (EditText)findViewById(R.id.edittext);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle datos = new Bundle();
                datos.putString("mensaje", editText.getText().toString());

                Intent intent = new Intent(Pantalla1Activity.this,Pantalla2Activity.class);
                intent.putExtras(datos);

                startActivity(intent);
            }
        });

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pantalla1Activity.this,Pantalla3Activity.class);
                startActivityForResult(intent, 0, null);

            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pantalla1Activity.this,CameraActivity.class);
                startActivityForResult(intent, 0, null);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == 0 && resultCode == 0){
           String respuesta = data.getStringExtra("respuesta1");
           editText.setText(respuesta);

        }


    }
}
