package com.example.musicplayer;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;

    Button play;
    Button stop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        play = (Button) findViewById(R.id.startbutton);
        stop = (Button) findViewById(R.id.stopbutton);

        mp1 = MediaPlayer.create(this,R.raw.uproar);
        mp2 = MediaPlayer.create(this,R.raw.drip);
        mp3 = MediaPlayer.create(this,R.raw.sicko);
    }

    public void radioclick(View view){

       ImageView image = (ImageView) findViewById(R.id.myimg);

        if(view.getId() == R.id.song1){
            mp1 = MediaPlayer.create(this,R.raw.uproar);
            image.setImageResource(R.drawable.pic1);
            mp1.start();
            mp2.pause();
            mp3.pause();

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp1.start();
                }
            });
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp1.pause();
                }
            });
        }

        if(view.getId() == R.id.song2){
            mp2 = MediaPlayer.create(this,R.raw.drip);
            image.setImageResource(R.drawable.pic2);
            mp1.pause();
            mp2.start();
            mp3.pause();

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp2.start();
                }
            });
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp2.pause();
                }
            });
        }
        if(view.getId() == R.id.song3){
            image.setImageResource(R.drawable.pic3);
            mp3 = MediaPlayer.create(this,R.raw.sicko);
            mp1.pause();
            mp2.pause();
            mp3.start();

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp3.start();
                }
            });
            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp3.pause();
                }
            });
        }
    }

}




