package ru.evtukhov.android.subscribeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submit;
    Button reset;
    TextView name;
    TextView email;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.user);
        email = (TextView) findViewById(R.id.email);
        text = (TextView) findViewById(R.id.textView);
        submit = (Button) findViewById(R.id.success);
        reset = (Button) findViewById(R.id.reset);
        submit.setOnClickListener(success);
        reset.setOnClickListener(clear);
    }

    View.OnClickListener success = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String userName = name.getText().toString();
            String userEmail = email.getText().toString();
            String successText = getString(R.string.app_textPartOne) + userName + getString(R.string.app_textPartTwo) + userEmail;
            text.setText(successText);
        }
    };

    View.OnClickListener clear = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name.setText("");
            email.setText("");
            text.setText("");
        }
    };
}
