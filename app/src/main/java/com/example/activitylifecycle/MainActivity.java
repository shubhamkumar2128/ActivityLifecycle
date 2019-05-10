package com.example.activitylifecycle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    String a[] = new String[]{"as", "as"};
    Spinner spinner;


    View.OnClickListener o= new View.OnClickListener(){
        @Override
        public void onClick(View v) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("msg", "1  Oncreate()");
        b = findViewById(R.id.bt);
       
        b.setOnClickListener(o);
        
        
        spinner = findViewById(R.id.spin);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, a);

        spinner.setAdapter(arrayAdapter);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              String d= (String) parent.getItemAtPosition(position);
               Toast.makeText(MainActivity.this, d, Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });
       

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.w("msg", "1  Onstart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("msg", "1  OnResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("msg", "1  OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("msg", "1  OnStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("msg", "1  OnRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("msg", "1  OnDestroy()");
    }


}
