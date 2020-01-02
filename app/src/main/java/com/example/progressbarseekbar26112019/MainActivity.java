package com.example.progressbarseekbar26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressBar = findViewById(R.id.progressbar);
        // Demo 1 : Loading view
//        CountDownTimer countDownTimer = new CountDownTimer(3000,3000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//
//            }
//
//            @Override
//            public void onFinish() {
//                mProgressBar.setVisibility(View.GONE);
//            }
//        };
//        countDownTimer.start();
    }
}
