package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class CheckboxesActivity extends AppCompatActivity {
       CheckBox mercuryCb;
       CheckBox sunCb;
       CheckBox moonCb;
       CheckBox jipiterCb;
       CheckBox saturnCb;
       CheckBox plutoCb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);
    }

    public  void handleInitViews(){
        mercuryCb = findViewById(R.id.mercury_cb);
        sunCb = findViewById(R.id.sun_cb);
        moonCb = findViewById(R.id.moon__cb);
        jipiterCb = findViewById(R.id.jipiter_cb);
        saturnCb = findViewById(R.id.saturn_cb);
        plutoCb = findViewById(R.id.pluto_cb);
    }
}