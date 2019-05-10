package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Three extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        b=findViewById(R.id.but1);
     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             startActivity(new Intent(Three.this,MainActivity.class));
         }
     });
        Log.w("msg", "3  OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("msg", "3  Onstart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("msg", "3  OnResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("msg", "3  OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("msg", "3  OnStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("msg", "3  OnRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("msg", "3  OnDestroy()");
    }

}
