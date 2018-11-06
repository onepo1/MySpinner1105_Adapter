package com.example.edu.myspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Item2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item2);
        textView= (TextView)findViewById(R.id.textView);

        Bundle bundle  = getIntent().getExtras();
        textView.setText(bundle.getString("keyName" , "No data"));


    }
}
