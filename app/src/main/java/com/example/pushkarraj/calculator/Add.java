package com.example.pushkarraj.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Intent intent = getIntent();
        float message1 = Float.valueOf(intent.getStringExtra(MainActivity.EXTRA_MESSAGE1));
        float message2 = Float.valueOf(intent.getStringExtra(MainActivity.EXTRA_MESSAGE2));
        float result = message1 + message2;
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(String.valueOf(result));
    }

}
