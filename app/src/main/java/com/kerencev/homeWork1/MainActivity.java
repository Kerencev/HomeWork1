package com.kerencev.homeWork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static boolean isPalindrom(String s) {

        String[] letters = s.split("");

        for (int i = 0; i < letters.length; i++) {
            if (!letters[i].equalsIgnoreCase(letters[letters.length - 1 - i]))
                return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        EditText text = findViewById(R.id.text);

        isPalindrom(text.getText().toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPalindrom(text.getText().toString()))
                    Toast.makeText(MainActivity.this, "Это палиндром", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Это не палиндром", Toast.LENGTH_SHORT).show();
            }
        });
    }
}