package senatest.sena11;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;

public class CameraActivity extends AppCompatActivity {

    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        photo = (ImageView)findViewById(R.id.photo);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
         if(requestCode == 0){
             if(data.getExtras() != null){
                 Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                 photo.setImageBitmap(bitmap);

                 Animation photo_animation = AnimationUtils.loadAnimation(CameraActivity.this,R.anim.photo_animation);
                 photo.startAnimation(photo_animation);

             }

         }


    }
}
