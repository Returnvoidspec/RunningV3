package com.example.runningv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = findViewById(R.id.button2);
        button2.setEnabled(false);
    }

    public void OnPause(View v){
        Button button =(Button) v;
        Button button2 = findViewById(R.id.button2);
        if(button.getText().equals("START")){
            button.setText("PAUSE");
            button2.setEnabled(true);
            button2.setBackgroundColor(0xfff00e0e);
            button.setBackgroundColor(0xff0000ff);

        }
        else if(button.getText().equals("PAUSE")){
            button.setText("RESUME");
            button.setBackgroundColor(0xff6DE016);
        }
        else{
            button.setText("PAUSE");
            button.setBackgroundColor(0xff0000ff);
        }
    }

    public void Launch(View v){
        Intent intent = new Intent(this,ReportActivity.class);
        startActivity(intent);
    }
}