package senatest.sena11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class UI2Activity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBox;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui2);

        checkBox=(CheckBox)findViewById(R.id.checkbox);
        button=(Button)findViewById(R.id.button);

        checkBox.isChecked();//Para ver si está chequeado o no

   //     button.setOnClickListener(getClickListener());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //hacer lógica

                
            }
        });
     //   button.setOnClickListener(this);


    }

    private View.OnClickListener getClickListener(){
        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//lógica a realizar
            }
        };
        return click;

    }

    @Override
    public void onClick(View v) {
        //hacer lógica
    }
}
