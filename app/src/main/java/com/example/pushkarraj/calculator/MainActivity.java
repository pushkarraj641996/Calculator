package com.example.pushkarraj.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import static com.example.pushkarraj.calculator.R.id.editText;
import static com.example.pushkarraj.calculator.R.id.editText3;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.example.pushkarraj.calculator.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.pushkarraj.calculator.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){

        Intent intent = new Intent(this, Add.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String message1 = editText.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }
    public void sub(View view){
        Intent intent = new Intent(this, sub.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String message1 = editText.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }
    public void multi(View view){
        Intent intent = new Intent(this, multi.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String message1 = editText.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }
    public void div(View view){
        Intent intent = new Intent(this, div.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String message1 = editText.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }
}
