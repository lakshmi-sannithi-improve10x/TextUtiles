package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DeleteActivity extends AppCompatActivity {
    EditText textTxt;
    EditText startIndexTxt;
    EditText endIndexTxt;
    Button deleteBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        initViews();
        handleDeleteBtn();
    }

    private void initViews() {
        textTxt = findViewById(R.id.text_txt);
        startIndexTxt = findViewById(R.id.startindex_txt);
        endIndexTxt = findViewById(R.id.endindex_txt);
        deleteBtn = findViewById(R.id.delete_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public  void  displayText(){
        String text = textTxt.getText().toString();
        String startIndex = startIndexTxt.getText().toString();
        String endIndex = endIndexTxt.getText().toString();
        String resultText = delete(text,startIndex,endIndex);
        resultTxt.setText(resultText);
    }

    private String delete(String text, String startIndex, String endIndex) {
        String  result = "";
        StringBuilder sb = new StringBuilder(text);
        sb.delete(Integer.parseInt(startIndex),Integer.parseInt(endIndex));
        result = sb.toString();
        return  result;
    }

    public  void  handleDeleteBtn(){
        deleteBtn.setOnClickListener(view -> {
            displayText();
        });
    }
}