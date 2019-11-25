package com.sharedpreference.usedbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText first,last,password,confirm;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        first=findViewById(R.id.editText);
        last=findViewById(R.id.editText2);
        password=findViewById(R.id.editText6);
        confirm=findViewById(R.id.editText7);
        next=findViewById(R.id.button3);



    }
}
