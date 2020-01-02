package com.example.progressbarseekbar26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends AppCompatActivity {

//    ProgressBar mProgressBar;
    SeekBar mSb,mSb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSb = findViewById(R.id.seekbar);
        mSb2 = findViewById(R.id.seekbar2);
//        mProgressBar = findViewById(R.id.progressbar);
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
        // Demo2 : Down load
//        CountDownTimer countDownTimer = new CountDownTimer(10000, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                mProgressBar.setProgress(mProgressBar.getProgress() + 10);
//            }
//
//            @Override
//            public void onFinish() {
//                mProgressBar.setProgress(mProgressBar.getProgress() + 10);
//            }
//        };
//        countDownTimer.start();
        mSb.setOnSeekBarChangeListener(onSeekbarchange());
        mSb2.setOnSeekBarChangeListener(onSeekbarchange());
    }
    private OnSeekBarChangeListener onSeekbarchange(){
        return new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (mSb2.getProgress() >= mSb.getProgress()){
                    mSb2.setProgress(mSb.getProgress());
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        };
    }

}
