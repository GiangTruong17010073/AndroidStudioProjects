package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global declare
    EditText edtX, edtY;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link code with layout
        edtX = findViewById(R.id.editText2);
        edtY = findViewById(R.id.editText3);
        tvResult=findViewById(R.id.editText);
    }

    int x, y;
    int devideBySubTraction(int x, int y){
        int count = 0;
        while(x>=y){
            x=x-y;
            count++;
        }
        return count;
    }

    public void doCheck(View v){
        x = Integer.parseInt(edtX.getText().toString());
        y = Integer.parseInt(edtY.getText().toString());
        tvResult.setText("result: " + devideBySubTraction(x, y));
    }
}
