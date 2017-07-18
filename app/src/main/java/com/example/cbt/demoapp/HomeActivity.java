package com.example.cbt.demoapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

     final int CAMERA_REQUEST=10;
     ImageView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        a=(ImageView) findViewById(R.id.displayiv);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i1,CAMERA_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CAMERA_REQUEST)
        {
            if(resultCode==RESULT_OK)
            {
                Bundle b1=data.getExtras();
                Bitmap bm1=(Bitmap)b1.get("data");
                a.setImageBitmap(bm1);
            }
        }
    }
}
