package com.tikou.seekbarwithinstruct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.tikou.mylibrary.UiSeeKBar;



public class MainActivity extends AppCompatActivity {
    UiSeeKBar uiSeeKBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uiSeeKBar= (UiSeeKBar) findViewById(R.id.ui_seekbar);
        uiSeeKBar.setProgress(20);


    }
}
