package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReplaceActivity extends AppCompatActivity {
    EditText originalTextTxt;
    EditText oldTextTxt;
    EditText newTextTxt;
    Button modifiedBtn;
    TextView modifiedTextTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);
        initViews();
        handleModifiedBtn();
    }

    private void initViews() {
        originalTextTxt = findViewById(R.id.originaltext_txt);
        oldTextTxt = findViewById(R.id.oldtext_txt);
        newTextTxt = findViewById(R.id.newtext_txt);
        modifiedBtn = findViewById(R.id.modified_btn);
        modifiedTextTxt = findViewById(R.id.modifiedtext_txt);
    }

    public void displayReplaceText() {
        String originalText = originalTextTxt.getText().toString();
        String oldText = oldTextTxt.getText().toString();
        String newText = newTextTxt.getText().toString();
        String modified = replace(originalText, oldText, newText);
        modifiedTextTxt.setText(modified);

    }

    private String replace(String originalText, String oldText, String newText) {
        String modifiedText = "";
        modifiedText = originalText.replace(oldText, newText);
        return modifiedText;
    }

    public void handleModifiedBtn() {
        modifiedBtn.setOnClickListener(view -> {
            displayReplaceText();
        });
    }
}