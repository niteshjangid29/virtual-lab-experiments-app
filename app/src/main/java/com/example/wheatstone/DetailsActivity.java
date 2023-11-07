package com.example.wheatstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {
    private Button wheatstoneSim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        wheatstoneSim = (Button) findViewById(R.id.wheatstone_sim);
        wheatstoneSim.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                openSimulator();
            }
        });
    }
    public void openSimulator(){
        Intent intent = new Intent(this, SimulatorActivity.class);
        startActivity(intent);
    }
}

