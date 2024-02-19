package com.example.exceptionhandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String str = null;
            str.length();
        } catch (NullPointerException x) {
            Toast.makeText(this, x.getMessage(), Toast.LENGTH_SHORT).show();
        }
        try {

            int[] arry = new int[3];
            arry[4] = 0;


        }
        catch (Exception e){

            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}