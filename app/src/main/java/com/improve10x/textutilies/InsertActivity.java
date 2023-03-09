package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InsertActivity extends AppCompatActivity {
    EditText textTxt;
    EditText indexTxt;
    EditText text2Txt;
    Button insertBtn;
    TextView insertResultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        initViews();
        handleInsertBtn();
    }

    private void initViews() {
        textTxt = findViewById(R.id.text_txt);
        indexTxt = findViewById(R.id.index_txt);
        text2Txt = findViewById(R.id.text2_txt);
        insertBtn = findViewById(R.id.insert_btn);
        insertResultTxt = findViewById(R.id.insertresult_txt);
    }

    public  void  displayInsertText(){
        String text = textTxt.getText().toString();
        String text2 = text2Txt.getText().toString();
        String index = indexTxt.getText().toString();
        String resultText = insert(text,text2,index);
        insertResultTxt.setText(resultText);

    }

    private String insert(String text, String text2, String index) {
        String  result = "";
        StringBuilder sb = new StringBuilder(text);
        sb.insert(Integer.parseInt(index),text2);
        result = sb.toString();
        return result;
    }

    public void  handleInsertBtn(){
        insertBtn.setOnClickListener(view -> {
            displayInsertText();
        });
    }
}