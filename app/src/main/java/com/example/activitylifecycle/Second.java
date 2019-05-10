package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.w("msg","2  OnCreate()");
        b=findViewById(R.id.but);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Second.this,Three.class));
                Second.this.finish();
               // Toast.makeText(Second.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.w("msg","2  Onstart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("msg","2  OnResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("msg","2  OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("msg","2  OnStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("msg","2  OnRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("msg","2  OnDestroy()");
    }
}
