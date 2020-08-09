package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.IntentsProj.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.IntentsProj.MESSAGE2";

    Button btn;
    TextView number1;
    TextView number2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn = findViewById(R.id.button);
        number1=findViewById(R.id.id1);
        number2=findViewById(R.id.id2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
                //Creating the Toast object


                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message1 = "You just clicked the OK button"; //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message1, duration);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();



                EditText editText = (EditText) findViewById(R.id.id1);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);

                EditText editText2 = (EditText) findViewById(R.id.id2);
                String message2 = editText2.getText().toString();
                intent.putExtra(EXTRA_MESSAGE2, message2);
                startActivity(intent);
            }
        });

    }


}