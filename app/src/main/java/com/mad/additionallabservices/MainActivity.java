package com.mad.additionallabservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnStart = (Button) this.findViewById(R.id.button);

        Button btnStop = (Button) this.findViewById(R.id.button2);

        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startService(new Intent(MainActivity.this,MyServices.class));

            }
        });   

        btnStop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this,MyServices.class));
            }
        });
        
        

    }


}