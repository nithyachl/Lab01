package com.chintalapatinithya.firstapp.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText response;
    TextView display;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.clickButton);
        response = findViewById(R.id.responseText);
        display = findViewById(R.id.displayText);

        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               i++;
               display.setText(""+i);
           }
        });
    }
}
