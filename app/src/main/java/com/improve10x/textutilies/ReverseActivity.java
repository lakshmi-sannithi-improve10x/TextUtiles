package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {
     EditText textTxt;
     Button reverseBtn;
     TextView resultTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);
        initViews();
        handleReverseBtn();
    }

    private void initViews() {
        textTxt = findViewById(R.id.text_txt);
        reverseBtn = findViewById(R.id.reverse_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public  void  displayReverseText(){
        String text = textTxt.getText().toString();
        String resultText = reverse(text);
        resultTxt.setText(resultText);
    }

    private String reverse(String text) {
        String result = "";
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        result = sb.toString();
        return  result;
    }

    public  void  handleReverseBtn(){
        reverseBtn.setOnClickListener(view -> {
            displayReverseText();
        });
    }
}