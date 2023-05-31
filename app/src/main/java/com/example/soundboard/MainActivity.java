package com.example.soundboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btn10 = findViewById(R.id.btn_10);
        btn11 = findViewById(R.id.btn_11);
        btn12 = findViewById(R.id.btn_12);

        btnBass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                playbtn1();
            }
        });

        btnBass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                playbtn2();
            }
        });

        private void playBass() {
            MediaPLayer mp = MediaPlayer.create( this, R.raw.sample_bassdrum1);
            mp.start();
            mpsetOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @NonNull
                @Override
                protected Object clone() throws CloneNotSupportedException {
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                }
            });
        }

        private void playB=ass() {
            MediaPLayer mp = MediaPlayer.create( this, R.raw.sample_bassdrum2);
            mp.start();
            mpsetOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @NonNull
                @Override
                protected Object clone() throws CloneNotSupportedException {
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                }
            });
        }

    }
}