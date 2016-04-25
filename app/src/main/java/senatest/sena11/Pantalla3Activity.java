package senatest.sena11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pantalla3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        Button button =(Button)findViewById(R.id.button);
        final EditText editText = (EditText)findViewById(R.id.edittext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();

                Bundle bundle = new Bundle();
                bundle.putString("respuesta1",editText.getText().toString());

                intent.putExtra("respuesta","a");
                intent.putExtras(bundle);

                setResult(0,intent);

                finish();
            }
        });


    }
}
