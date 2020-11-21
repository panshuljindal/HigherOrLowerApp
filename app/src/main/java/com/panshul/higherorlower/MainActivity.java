package com.panshul.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    public void  generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
    public void guess(View view){
        EditText edittext = (EditText) findViewById(R.id.editText);
        int guessValue = Integer.parseInt(edittext.getText().toString());
        Log.i("Entered Value",edittext.getText().toString());
        Log.i("Random Number",Integer.toString(randomNumber));
        String message;
        if(guessValue>randomNumber){
            message = "Lower!";
        }
        else if(guessValue<randomNumber){
            message = "Higher!";
        }
        else{
            message = "You go it!";
            generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}
