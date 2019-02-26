package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
//Global declare
    EditText edtN;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link code with layout
        edtN = findViewById(R.id.edt_n);
        tvResult=findViewById(R.id.tv_result);
    }
    int n,i;
    Boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        i = 2;
        while (i < sqrt(n) && n % i != 0) {
            i++;
        }
        return (i > sqrt(n));
    }
    int countNumberPrimeLessThan(int n){
        int sum = 0, i = 2;
        while(i<=n){
            if(isPrime(i)){
                sum++;
            }
            i++;
        }
        return sum;
    }
    //Write action for button
    public void doCheck(View v){
        //convert n to int
        n = Integer.parseInt(edtN.getText().toString());
                    tvResult.setText("number of prime: " + countNumberPrimeLessThan(n));
                }
    }
