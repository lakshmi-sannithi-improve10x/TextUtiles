package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartWithActivity extends AppCompatActivity {
    EditText nameTxt;
    EditText prefixTxt;
    Button startWithBtn;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startwith);
        initViews();
        handleStartWithBtn();
    }

    private void initViews() {
        nameTxt = findViewById(R.id.name_txt);
        prefixTxt = findViewById(R.id.prefix_txt);
        startWithBtn = findViewById(R.id.startwith_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public boolean startWith(String Text, String prefixText) {
        boolean resultText = false;
        resultText = Text.startsWith(prefixText);
        return resultText;
    }

    public void displayCharSequence() {
        String Text = nameTxt.getText().toString();
        String prefixText = prefixTxt.getText().toString();
        boolean resultText = startWith(Text, prefixText);
        resultTxt.setText(resultText + "");
    }

    public void handleStartWithBtn() {
        startWithBtn.setOnClickListener(view -> {
            displayCharSequence();
        });
    }
}