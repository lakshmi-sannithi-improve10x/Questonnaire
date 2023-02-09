package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {
      Button radioBtn;
      Button checkboxBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        handleInitViews();
        handleRadioBtn();
        handleCheckboxBtn();
    }

    public  void  handleInitViews(){
        radioBtn = findViewById(R.id.radio_btn);
        checkboxBtn = findViewById(R.id.checkbox_btn);
    }

    public  void  handleRadioBtn(){
        radioBtn.setOnClickListener(view -> {
            handleNavigateRadioActivity();
        });
    }

    public void handleNavigateRadioActivity(){
        Intent radioIntent = new Intent(this,RadioButtonsActivity.class);
        startActivity(radioIntent);
    }

    public void  handleCheckboxBtn(){
        checkboxBtn.setOnClickListener(view -> {
           handleNavigateCheckboxActivity();
        });

    }

    public  void  handleNavigateCheckboxActivity(){
        Intent checkboxIntent = new Intent(this,CheckboxesActivity.class);
        startActivity(checkboxIntent);
    }
}