package com.example.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB;
    ListView lvResult;
    float numberA, numberB, result;
    ArrayList<String> arrayResult;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = (EditText) findViewById(R.id.edt_a);
        edtB = (EditText) findViewById(R.id.edt_b);
        lvResult = (ListView) findViewById(R.id.lv_result);

        arrayResult = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<String>( this,
                        android.R.layout.simple_list_item_1,
                        arrayResult);
        lvResult.setAdapter(arrayAdapter);
    }

    public void doAddition(View v){
        numberA = Integer.parseInt(edtA.getText().toString());
        numberB = Integer.parseInt(edtB.getText().toString());
        result = numberA + numberB;

        String stringResult = numberA + " + " + numberB + " = " + result;
        arrayResult.add(0,stringResult);
        arrayAdapter.notifyDataSetChanged();
    }

    public void doSubtraction (View v){
        numberA = Integer.parseInt(edtA.getText().toString());
        numberB = Integer.parseInt(edtB.getText().toString());
        result = numberA - numberB;

        String stringResult = numberA + " - " + numberB + " = " + result;
        arrayResult.add(0,stringResult);
        arrayAdapter.notifyDataSetChanged();
    }

    public void doMutiply (View V) {
        numberA = Integer.parseInt(edtA.getText().toString());
        numberB = Integer.parseInt(edtB.getText().toString());
        result = numberA * numberB;

        String stringResult = numberA + " * " + numberB + " = " + result;
        arrayResult.add(0,stringResult);
        arrayAdapter.notifyDataSetChanged();
    }

    public void doDivide (View V) {
        numberA = Integer.parseInt(edtA.getText().toString());
        numberB = Integer.parseInt(edtB.getText().toString());
        result = numberA / numberB;

        String stringResult = numberA + " / " + numberB + " = " + result;
        arrayResult.add(0,stringResult);
        arrayAdapter.notifyDataSetChanged();
    }


}
