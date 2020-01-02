package com.example.progressbarseekbar26112019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;

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
        inso(new CallbackResult() {
            @Override
            public boolean isShowing(int number) {
                return number % 2 == 0;
            }
        });
//        showNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new Callback() {
//            @Override
//            public Integer doubleNumber(Integer number) {
//                return number * number;
//            }
//        });
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
//
//    private void showNumber(int[] arraynumber, Callback fn ){
//        for (Integer value : arraynumber){
//           Log.d("BBB",fn.doubleNumber(value) + "");
//        }
//    }
    // 1 - 100 :
    // task 1 : so chan
    // task 2 : so le
    // task 3 : so chia 3 du 1
    // task 4 : so chinh phuong ( can bac 2)
    private void insochan(){
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 2 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insole(){
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 2 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insochia3du1(){
        for (int i = 1 ; i <= 100 ; i++){
            if (i % 3 == 1){
                Log.d("BBB",i + "");
            }
        }
    }
    private void insochinhphuong(){
        for (int i = 1 ; i <= 100 ; i++){
            if (Math.sqrt(i) % 1 == 0){
                Log.d("BBB",i + "");
            }
        }
    }
    private void inso(CallbackResult result){
        for (int i = 1 ; i <= 100 ; i++){
            boolean dk = result.isShowing(i);
            if(dk){
                Log.d("BBB",i + "");
            }
        }
    }
}
