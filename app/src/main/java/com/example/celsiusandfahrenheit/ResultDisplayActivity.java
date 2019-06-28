package com.example.celsiusandfahrenheit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class ResultDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);
        TextView tv = (TextView)findViewById(R.id.textView);
        Button doneButton = (Button) findViewById(R.id.doneButton);


        if(getIntent().hasExtra("com.CS441.Project3.key")){
            String temperature = getIntent().getExtras().getString("com.CS441.Project3.key");

            ImageView img = (ImageView)findViewById(R.id.imageView);
            if(Integer.parseInt(temperature)>70 && Integer.parseInt(temperature)<100){
                img.setImageResource(R.drawable.beach);
                img.setVisibility(View.VISIBLE);
                tv.setText("The current Temperature is "+temperature+"°F. Let's go to beach!!");
            }
            else if (Integer.parseInt(temperature)<=70 && Integer.parseInt(temperature)>=40 ){
                img.setImageResource(R.drawable.fall);
                img.setVisibility(View.VISIBLE);
                tv.setText("The current Temperature is "+temperature+"°F. Let's go hiking!!!");
            }
            else if(Integer.parseInt(temperature)<=40){
                img.setImageResource(R.drawable.snow);
                img.setVisibility(View.VISIBLE);
                tv.setText("The current Temperature is "+temperature+"°F. Snow boarding time!");
            }
            else{
                img.setImageResource(R.drawable.hot);
                img.setVisibility(View.VISIBLE);
                tv.setText("The current Temperature is "+temperature+"°F.It's hot!!!Stay at home!");
            }
        }
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(starIntent);
            }
        });

    }
}
