package com.example.celsiusandfahrenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView TV = (TextView)findViewById(R.id.textView);
    TextView TV;
    SeekBar slider;
    int min=0,max=100,current = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fahrenheit = (Button)findViewById(R.id.fahrenheit);
        Button Celsius = (Button)findViewById(R.id.celsius);
        EditText inputText = (EditText)findViewById(R.id.editText);
        slider = (SeekBar)findViewById(R.id.slider);
        TV = (TextView)findViewById(R.id.textView);

        slider.setMax(max-min);
        slider.setProgress(current-min);


        slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               TV.setText(""+progress+" °C");
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
