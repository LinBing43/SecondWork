package com.example.linbing.secondwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button mBtnLinear;
    Button mBtnGrid;
    Button mBtnRelative;

    View.OnClickListener mListener;
    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLinear = (Button) findViewById(R.id.bn1);
        mBtnGrid = (Button) findViewById(R.id.bn2);
        mBtnRelative = (Button) findViewById(R.id.bn3);

        mListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()){
                    case R.id.bn1:
                        mIntent = new Intent(MainActivity.this, LinearActivity.class);
                        startActivity(mIntent);
                        break;
                    case R.id.bn2:
                        mIntent = new Intent(MainActivity.this, TableActivity.class);
                        startActivity(mIntent);
                        break;
                    case R.id.bn3:
                        mIntent = new Intent(MainActivity.this, RelativeActivity.class);
                        startActivity(mIntent);
                        break;

                }

            }
        };

        mBtnLinear.setOnClickListener(mListener);
        mBtnGrid.setOnClickListener(mListener);
        mBtnRelative.setOnClickListener(mListener);

    }
}
