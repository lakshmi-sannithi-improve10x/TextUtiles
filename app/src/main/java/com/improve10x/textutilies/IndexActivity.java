package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {
    EditText textTxt;
    EditText keyTxt;
    Button indexBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        initViews();
        handleIndexBtn();
    }

    private void initViews() {
        textTxt = findViewById(R.id.text_txt);
        keyTxt = findViewById(R.id.key_txt);
        indexBtn = findViewById(R.id.index_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public void displayIndexText() {
        String text = textTxt.getText().toString();
        String key = keyTxt.getText().toString();
        String result = index(text, key);
        resultTxt.setText(result);
    }

    private String index(String text, String key) {
        int resultText = -1;
        resultText = text.indexOf(key);
        return resultText + "";
    }

    public void handleIndexBtn() {
        indexBtn.setOnClickListener(view -> {
            displayIndexText();
        });
    }
}