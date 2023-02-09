package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonsActivity extends AppCompatActivity {
       RadioGroup planetsRg;
       Button verifyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_buttons);
        handleInitViews();
        handleVerifyBtnClick();
    }

    public  void handleInitViews(){
        planetsRg = findViewById(R.id.planets_rg);
        verifyBtn = findViewById(R.id.verify_btn);
    }

    public  void  handleVerifyBtnClick(){
        verifyBtn.setOnClickListener(view -> {
          boolean result = isCorrect();
          showResult(result);

        });
    }

    public  boolean  isCorrect(){
        int selectedRb = planetsRg.getCheckedRadioButtonId();
        boolean result = false;
        if (selectedRb == R.id.eight_rb){
            result = true;
        }
        return result;
    }

    public  void  showResult(boolean result){
        if (result){
            Toast.makeText(this, "Correct Answer! ):", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Sorry,Wrong Answer! (:", Toast.LENGTH_LONG).show();
        }
    }
}