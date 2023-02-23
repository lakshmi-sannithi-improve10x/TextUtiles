package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LastIndexOfActivity extends AppCompatActivity {
    EditText textTxt;
    EditText keyTxt;
    Button lastIndexBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_indexof);
        initViews();
        handleLastIndexBtn();
    }

    private void initViews() {
        textTxt = findViewById(R.id.text_txt);
        keyTxt = findViewById(R.id.key_txt);
        lastIndexBtn = findViewById(R.id.lastindexof_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public void displayLastIndexText() {
        String text = textTxt.getText().toString();
        String key = keyTxt.getText().toString();
        String result = lastIndex(text, key);
        resultTxt.setText(result);
    }

    private String lastIndex(String text, String key) {
        int resultText = -1;
        resultText = text.lastIndexOf(key);
        return resultText + "";
    }

    public void handleLastIndexBtn() {
        lastIndexBtn.setOnClickListener(view -> {
            displayLastIndexText();
        });
    }
}