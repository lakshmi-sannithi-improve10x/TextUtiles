package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EndsWithActivity extends AppCompatActivity {
    EditText nameTxt;
    EditText suffixTxt;
    Button endsWithBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endswith);
        initViews();
        handleEndsWithBtn();
    }

    private void initViews() {
        nameTxt = findViewById(R.id.name_txt);
        suffixTxt = findViewById(R.id.suffix_txt);
        endsWithBtn = findViewById(R.id.endswith_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public void displayText() {
        String name = nameTxt.getText().toString();
        String suffix = suffixTxt.getText().toString();
        boolean resultText = endsWith(name, suffix);
        resultTxt.setText(resultText + "");
    }

    private boolean endsWith(String name, String suffix) {
        boolean resultText = false;
        resultText = name.endsWith(suffix);
        return resultText;
    }

    public void handleEndsWithBtn() {
        endsWithBtn.setOnClickListener(view -> {
            displayText();
        });
    }
}