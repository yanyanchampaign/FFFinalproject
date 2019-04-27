package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Food display for users to choose.
    private List<String> foodCategory = new ArrayList<String>() {{add("Meat dishes");add("Vegetables and fruits");add("Dessert");add("Beverage"); add("Seafood");}};
























































}
