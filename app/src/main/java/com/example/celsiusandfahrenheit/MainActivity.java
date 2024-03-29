package com.example.celsiusandfahrenheit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.String;

import java.security.spec.ECField;

public class MainActivity extends AppCompatActivity {

    //TextView TV = (TextView)findViewById(R.id.textView);
    TextView TV;
    SeekBar slider;
    int min=0,max=100,current = 15;
    boolean machineChangeFlag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText fahrenheit = (EditText) findViewById(R.id.farenheit);
        final EditText celsius = (EditText) findViewById(R.id.celsius);
        celsius.setInputType(InputType.TYPE_CLASS_NUMBER);
        fahrenheit.setInputType(InputType.TYPE_CLASS_NUMBER);

        final TextView fahrenheitSymbol =(TextView) findViewById(R.id.fahrenheitSymbolTextView);
        final TextView celsiusSymbol = (TextView)findViewById(R.id.celsiusSymbolTextview);

        Button button = (Button)findViewById(R.id.button);

        slider = (SeekBar)findViewById(R.id.slider);
        slider.setMax(max-min);
        slider.setProgress(current-min);


        celsius.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                celsiusSymbol.setVisibility(View.VISIBLE);
                fahrenheitSymbol.setVisibility(View.VISIBLE);
                if (!machineChangeFlag) {
                    machineChangeFlag=true;

                    if (!s.toString().equals("")) {
                        double c = Double.parseDouble(s.toString());
                        double f =c*1.8+32;
                        System.out.println("C= "+c+"F= "+f);
                        fahrenheit.setText(String.valueOf(Math.round(f)));
                    } else {
                        fahrenheit.setText("");
                    }

                }
                machineChangeFlag=false;
            }
        });

        fahrenheit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                celsiusSymbol.setVisibility(View.VISIBLE);
                fahrenheitSymbol.setVisibility(View.VISIBLE);
                if (!machineChangeFlag) {
                    machineChangeFlag=true;
                    if (!s.toString().equals("")) {
                        double f = Double.parseDouble(s.toString());
                        long c = Math.round((f - 32) * 5 / 9);
                        celsius.setText(String.valueOf(c));
                    } else {
                        celsius.setText("");
                    }
                }
                machineChangeFlag=false;
            }

        });

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent starIntent = new Intent(getApplicationContext(), ResultDisplayActivity.class);
                    starIntent.putExtra("com.CS441.Project3.key", "" + fahrenheit.getText());
                    startActivity(starIntent);

                }
            });



        slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                celsiusSymbol.setVisibility(View.VISIBLE);
                fahrenheitSymbol.setVisibility(View.VISIBLE);
                double f =progress*1.8+32;
                fahrenheit.setText(String.valueOf(Math.round(f)));
                celsius.setText(""+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }


        });
    }
}
