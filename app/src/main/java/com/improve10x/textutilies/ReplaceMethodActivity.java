package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReplaceMethodActivity extends AppCompatActivity {
       EditText text1Txt;
       EditText text2Txt;
       EditText startIndexTxt;
       EditText endIndexTxt;
       Button replaceBtn;
       TextView resultTxt;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace_method);
        initViews();
        handleReplaceBtn();
    }

    private void initViews() {
           text1Txt = findViewById(R.id.text1_txt);
           text2Txt = findViewById(R.id.text2_txt);
           startIndexTxt = findViewById(R.id.startindex_txt);
           endIndexTxt = findViewById(R.id.endindex_txt);
           replaceBtn = findViewById(R.id.replace_btn);
           resultTxt = findViewById(R.id.result_txt);
    }

    public  void  displayReplaceText(){
           String text1 = text1Txt.getText().toString();
           String text2 = text2Txt.getText().toString();
           int startIndex = Integer.parseInt(startIndexTxt.getText().toString());
           int endIndex = Integer.parseInt(endIndexTxt.getText().toString());
           String resultText = replace(text1,text2,startIndex,endIndex);
           resultTxt.setText(resultText);
    }

    private String replace(String text1, String text2, int startIndex, int endIndex) {
           String result = "";
           StringBuilder sb = new StringBuilder(text1);
          sb.replace(startIndex,endIndex,text2);
          result = sb.toString();
          return  result;
    }

    public  void  handleReplaceBtn(){
           replaceBtn.setOnClickListener(view -> {
               displayReplaceText();
           });
    }
}