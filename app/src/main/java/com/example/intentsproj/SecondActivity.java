package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        final String message = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE);
        final String message2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.Number1R);
        textView.setText(message);
        TextView textView2 = findViewById(R.id.Number2R);
        textView2.setText(message2);

        btn1=(Button)findViewById(R.id.button2);
        btn2=(Button)findViewById(R.id.button3);
        btn3=(Button)findViewById(R.id.button4);
        btn4=(Button)findViewById(R.id.button5);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                int result;
                result=Integer.parseInt(message)+Integer.parseInt(message2);

                TextView textView=findViewById(R.id.textView7);
                textView.setText(message+"+"+message2+"="+result);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                int result;
                result=Integer.parseInt(message)-Integer.parseInt(message2);

                TextView textView=findViewById(R.id.textView7);
                textView.setText(message+"-"+message2+"="+result);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                int result;
                result=Integer.parseInt(message)*Integer.parseInt(message2);

                TextView textView=findViewById(R.id.textView7);
                textView.setText(message+"*"+message2+"="+result);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                int result;
                result=Integer.parseInt(message)/Integer.parseInt(message2);

                TextView textView=findViewById(R.id.textView7);
                textView.setText(message+"/"+message2+"="+result);

            }
        });







    }





}