package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private Button button;
    private TextView textView2;
    private EditText editTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        editTextNumber=findViewById(R.id.editTextNumber);
        //button.setOnClickListener Method
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this, "You Clicked Submit Button", Toast.LENGTH_SHORT).show();
//                String s=editTextNumber.getText().toString();
//                int km=Integer.parseInt(s);
//                double result = km * 0.621371;
//                textView2.setText(km+" KM"+" = "+df.format(result)+" MILES");
//            }
//        });
    }

    //Android- onClick Attribute
    public void calculate(View view){
        String s=editTextNumber.getText().toString();
        int km=Integer.parseInt(s);
        double result = km * 0.621371;
        textView2.setText(km+" KM"+" = "+df.format(result)+" MILES");
    }
}