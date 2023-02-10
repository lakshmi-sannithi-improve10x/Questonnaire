package com.improve10x.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckboxesActivity extends AppCompatActivity {
       CheckBox mercuryCb;
       CheckBox sunCb;
       CheckBox moonCb;
       CheckBox jupiterCb;
       CheckBox saturnCb;
       CheckBox plutoCb;
       Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);
        handleInitViews();
        handleVerifyBtnClick();
    }

    public  void handleInitViews(){
        verifyBtn = findViewById(R.id.verify_btn);
        mercuryCb = findViewById(R.id.mercury_cb);
        sunCb = findViewById(R.id.sun_cb);
        moonCb = findViewById(R.id.moon__cb);
        jupiterCb = findViewById(R.id.jupiter_cb);
        saturnCb = findViewById(R.id.saturn_cb);
        plutoCb = findViewById(R.id.pluto_cb);
    }

    public  void  handleVerifyBtnClick(){
        verifyBtn.setOnClickListener(view -> {
            boolean result = isCorrect();
            showResult(result);
        });
    }
    private boolean isCorrect() {
        boolean checkMercury = mercuryCb.isChecked();
        boolean checkJupiter = jupiterCb.isChecked();
        boolean checkSaturn = saturnCb.isChecked();
        boolean checkSun = sunCb.isChecked();
        boolean checkMoon = moonCb.isChecked();
        boolean checkPluto = plutoCb.isChecked();
        boolean result = false;
        if (checkMercury == true && checkJupiter == true && checkSaturn == true && checkSun == false && checkMoon == false && checkPluto == false){
            result = true;
        }
        return result;
    }
     public  void  showResult(boolean result){
        if(result){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
     }

}