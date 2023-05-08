package com.homa.findingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//This is new feature branch
public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.table);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hello world,my name is Homa", Toast.LENGTH_SHORT).show();
                if (editText.length() <0) {
                    Toast.makeText(MainActivity.this, "Invalid value", Toast.LENGTH_SHORT).show();
                }
                else{
                    int number = Integer.parseInt(editText.getText().toString());
                    textView.setText("");
                    for (int i = 1; i <= 10; i++) {
                        textView.append(number + " * " + i + "=" + (number*i) + "\n");
                    }
                }

            }
        });



    }

    public void Clear(View view) {
        editText.setText("");
        textView.setText("");
    }
}