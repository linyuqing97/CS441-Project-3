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
            tv.setText("The current Temperature is "+temperature+"°F");
            ImageView img = (ImageView)findViewById(R.id.imageView);

            img.setVisibility(View.VISIBLE);
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
