package com.kerencev.homeWork1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        Button secondScreen = findViewById(R.id.btn_second_screen);
        EditText text = findViewById(R.id.text);
        TextView result = findViewById(R.id.result_is_palindrom);
        LinearLayout screenMain = findViewById(R.id.Linear_Layout_Main_Activity);
        Switch switcher = findViewById(R.id.switcher);
        ToggleButton setBackgroundText = findViewById(R.id.set_background_text);
        CheckBox check = findViewById(R.id.check);
        TextView thanks = findViewById(R.id.thanks);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Palindrom.isPalindrom(text.getText().toString())) {
                    result.setText("Это палиндром!");
                } else
                    result.setText("Это не палиндром.");
                text.setText("");
            }
        });

        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switcher.isChecked())
                    screenMain.setBackgroundColor(Color.GRAY);
                else
                    screenMain.setBackgroundColor(Color.WHITE);
            }
        });

        setBackgroundText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (setBackgroundText.isChecked()) {
                    result.setText("");

                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (Palindrom.isPalindrom(text.getText().toString()))
                                text.setBackgroundColor(Color.GREEN);
                            else
                                text.setBackgroundColor(Color.RED);
                        }
                    });
                } else {
                    result.setText("");
                    text.setBackgroundColor(Color.WHITE);
                    text.setText("");

                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (Palindrom.isPalindrom(text.getText().toString())) {
                                result.setText("Это палиндром!");
                            } else
                                result.setText("Это не палиндром.");
                            text.setText("");
                        }
                    });
                }
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check.isChecked())
                    thanks.setText("Спасибо!");
                else
                    thanks.setText("Верни галочку!");
            }
        });

        secondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(second);
            }
        });
    }
}