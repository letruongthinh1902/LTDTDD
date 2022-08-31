

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlButton();
    }
    private void controlButton() {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ban da dang nhap thanh cong",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }

}