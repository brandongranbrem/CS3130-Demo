package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    //TextView to display user input
    TextView oldMessage;
    //Button to signal the user has inputted a message
    Button updateMessage;
    //Text field for user to input message
    EditText newMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oldMessage = (TextView) findViewById(R.id.helloText);
        updateMessage = (Button) findViewById(R.id.displayMessage);
        newMessage = (EditText) findViewById(R.id.message);

        //Change the TextView with the user inputted text when the user clicks the button
        updateMessage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                oldMessage.setText(newMessage.getText().toString());
            }
        });

    }
}
