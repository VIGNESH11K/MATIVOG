package com.example.mativ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeLink(View view){
        Intent intent=new Intent(this,Orderactivity.class);
//                EditText editTextext=findViewById(R.id.button1);
                startActivity(intent);
    }



}
