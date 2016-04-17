package senatest.sena11;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import senatest.sena11.adapter.AnimeAdapter;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridView = (GridView)findViewById(R.id.gridview);
        AnimeAdapter animeAdapter = new AnimeAdapter(this);
        gridView.setAdapter(animeAdapter);

        TextView textView=(TextView)findViewById(R.id.texto);

        registerForContextMenu(textView);
        registerForContextMenu(gridView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.chat_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.favoritos :
                Log.d("menu","ud seleccionó favoritos");
                break;
            case R.id.borrar :
                Log.d("menu","ud seleccionó borrar");
                break;
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater inflador = getMenuInflater();
        inflador.inflate(R.menu.chat_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.favoritos :
                Toast.makeText(this,"ud seleccionó favoritos",Toast.LENGTH_LONG).show();
                Log.d("menu","ud seleccionó favoritos");
            break;
            case R.id.borrar :
                crearAlertDialog();
                Log.d("menu","ud seleccionó borrar");
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void crearAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Advertencia de seguridad");
        builder.setMessage("Está seguro de lo que va a hacer? super seguro? en serio?");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(GridViewActivity.this, "ud aceptó algo que no debía", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(GridViewActivity.this, "ud tomó la decisión correcta", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }


}
