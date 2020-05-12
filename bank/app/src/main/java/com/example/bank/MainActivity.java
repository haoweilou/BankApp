 package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
     @Override
     protected void onCreate(Bundle savedInstanceState)
     {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         initView();
     }
     public void initView(){
         Button movie_button = (Button) findViewById(R.id.movie);
         movie_button.setOnClickListener(this);
     }
     public void onClick(View view)
     {
         if(view.getId() == R.id.movie){
            setContentView(R.layout.movie);
             Button back = (Button) findViewById(R.id.back);
             back.setOnClickListener(this);
         }
         if(view.getId() == R.id.back){
             setContentView(R.layout.activity_main);
             initView();
         }
     }
 }
