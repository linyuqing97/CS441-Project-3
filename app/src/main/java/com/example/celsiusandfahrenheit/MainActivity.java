package com.example.celsiusandfahrenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.security.spec.ECField;

public class MainActivity extends AppCompatActivity {

    //TextView TV = (TextView)findViewById(R.id.textView);
    TextView TV;
    SeekBar slider;
    int min=0,max=100,current = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText fahrenheit = (EditText) findViewById(R.id.farenheit);
        final EditText celsius = (EditText) findViewById(R.id.celsius);

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
                try {
                    slider.setProgress(Integer.parseInt(s.toString()));

                }catch (Exception ex){}

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
                try {
                    slider.setProgress(Integer.parseInt(s.toString()));

                }catch (Exception ex){}
            }

        });




        slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
              fahrenheit.setText((""+(progress*1.8+32)+" °f"));
              celsius.setText(""+progress+" °C");
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
