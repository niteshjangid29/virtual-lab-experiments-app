package com.example.wheatstone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView wheatstone;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            wheatstone = (TextView) findViewById(R.id.wheatstone_id);
            wheatstone.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View V){
                    openDetails();
                }
            });
    }
    public void openDetails(){
        Intent intent = new Intent(this, DetailsActivity.class);
        startActivity(intent);
    }

}