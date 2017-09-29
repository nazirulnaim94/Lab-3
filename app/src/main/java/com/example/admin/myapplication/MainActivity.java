package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        displayButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
    }
    public void displayText (View view) {
        String text=etName.getText().toString();
        tvMessage.setText("Welcome " + text);

        Toast toast = Toast.makeText(this,"WELCOME " + text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void reset (View view){
        etName.getText().clear();
        tvMessage.setText("Welcome");

        Toast toast = Toast.makeText(this,"NAME HAVE BEEN RESET!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
