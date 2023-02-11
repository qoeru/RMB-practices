package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private void sendToast(){
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
    }

    @Override
    protected void onStop() {
        super.onStop();

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

        sendToast();
    }
    @Override
    protected void onResume() {
        super.onResume();

        sendToast();
    }

}