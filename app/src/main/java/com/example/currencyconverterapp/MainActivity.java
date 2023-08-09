package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Widgets
        EditText editText= findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);

//2-convert kilo to pounds
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                //1- Get the rupee value from the editText
                String rupee = editText.getText().toString();

                //3- convert string to float
                float rupees= Float.parseFloat(rupee);

                float dollar = (float) (rupees * 80);

                //4- Set the Textview with the result - Display result
                textView.setText(""+dollar);
            }
   });
}
}