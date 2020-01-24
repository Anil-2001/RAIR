package com.androidcodefinder.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;








public class WhereActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] types={"Business", "Holiday Trip", "Religious Visit", "Extreme Visit", "Other"};
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where);
        tv1 = (TextView) findViewById(R.id.textView1);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);


//Creating the ArrayAdapter instance having the bank name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,types);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
//        Toast.makeText(getApplicationContext(), types[position], Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }
}

//public class WhereActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{
//
//    AdapterView.OnItemSelectedListener
//
//    {
//        String[] type = {"Business", "Holiday Trip", "Religious Visit", "Extreme Visit", "Other"};
//
//        TextView tv1;
//
//        @Override
//        protected void onCreate (Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_where);
//        tv1 = (TextView) findViewById(R.id.textView1);
//    }
//
//        // Spinner element
//        Spinner spin = (Spinner) findViewById(R.id.spinner);
//        spin.setOnItemSelectedListener(this);
//
//        //Creating the ArrayAdapter instance having the country list
//        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, type);
//        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        //Setting the ArrayAdapter data on the Spinner
//        spin.setAdapter(aa);
//
//    }
//
//    //Performing action onItemSelected and onNothing selected
//    @Override
//    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
//        Toast.makeText(getApplicationContext(), type[position], Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> arg0) {
//        // TODO Auto-generated method stub
//    }
//}

