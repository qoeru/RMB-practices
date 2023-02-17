package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    private void sendToast(){
        try {
            Context context = getApplicationContext();
            CharSequence text = "Hello toast!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } catch (Exception exception) {
            Log.e(TAG, "Получено исключение", exception);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendToast();
    }

    @Override
    protected void onStart() {
        super.onStart();

        sendToast();
        Log.i(TAG, "Toast was sent!");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "Debug Log");
        sendToast();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        sendToast();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(TAG, "What a terrible failure!");
        sendToast();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        sendToast();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w(TAG, "Warning!");
        sendToast();
    }

}