package com.androidcodefinder.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {

    private Object View;
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btnlogin);
        tv1 = (TextView) findViewById(R.id.textView1);

        b1.setOnClickListener(this);
    }
//        public void onButtonClick(View v){
//        Intent myIntent = new Intent(getBaseContext(),   WhereActivity.class);
//        startActivity(myIntent);
//    }



    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        Intent i = new Intent(MainActivity.this,WhereActivity.class);
        startActivity(i);

    }
}