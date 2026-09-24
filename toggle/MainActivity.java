package com.example.toggle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    ImageView iv;

    Button button;

    int images[]={
            R.drawable.greenary, R.drawable.spring
    };

    int currentindex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv =  findViewById(R.id.imgv1);
        button = findViewById(R.id.button);
        }
        public void Click(View view){
            if(currentindex==0){
                iv.setImageResource(images[1]);
                currentindex=1;
        }else{
                iv.setImageResource(images[0]);
                currentindex=0;
            }
    }
}