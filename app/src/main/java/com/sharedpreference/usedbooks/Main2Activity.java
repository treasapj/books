package com.sharedpreference.usedbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText user,password;
    Button login,create;
    TextView forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        user=findViewById(R.id.editText4);
        password=findViewById(R.id.editText5);
        forgotpassword=findViewById(R.id.textView7);
        login=findViewById(R.id.button2);
        create=findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((user.getText().toString().isEmpty()) || (password.getText().toString().isEmpty()))

                {
                    Toast.makeText(Main2Activity.this, "Field is empty", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Main2Activity.this,"successfull",Toast.LENGTH_LONG).show();
                }


            }
        });
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);

            }
        });

            }

    }

