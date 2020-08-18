package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    EditText etnum1;
    EditText etnum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum1 = findViewById(R.id.etnum1);
        etnum2 = findViewById(R.id.etnum2);

    }

    public void openSecondActivity2(View view)
    {
        Intent intent = new Intent(this,SecondActivity2.class);
        intent.putExtra("n1",etnum1.getText().toString());
        intent.putExtra("n2",etnum2.getText().toString());

        Toast.makeText(this, "Operning Calculater...", Toast.LENGTH_SHORT).show();

        startActivity(intent);





    }

    }
