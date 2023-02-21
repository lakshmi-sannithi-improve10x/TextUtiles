package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UppercaseActivity extends AppCompatActivity {
    EditText textTxt;
    TextView uppercaseTxt;
    TextView lowercaseTxt;
    TextView lengthTxt;
    TextView trimTxt;
    TextView emptyTxt;
    TextView containsTxt;
    EditText charTxt;
    EditText letterTxt;
    TextView startWithTxt;
    EditText wordsTxt;
    TextView endsWithTxt;
    EditText indexTextTxt;
    TextView indexOfTxt;
    EditText lastIndexTxt;
    TextView lastIndexOfTxt;
    EditText replaceTextTxt;
    TextView replaceTxt;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uppercase);
        initViews();
        handleSubmitBtn();
    }

    private void initViews() {
        textTxt = findViewById(R.id.text_txt);
        uppercaseTxt = findViewById(R.id.uppercase_txt);
        submitBtn = findViewById(R.id.submit_btn);
        lowercaseTxt = findViewById(R.id.lowercase_txt);
        lengthTxt = findViewById(R.id.length_txt);
        trimTxt = findViewById(R.id.trim_txt);
        emptyTxt = findViewById(R.id.empty_txt);
        containsTxt = findViewById(R.id.contains_txt);
        charTxt = findViewById(R.id.char_txt);
        letterTxt = findViewById(R.id.letter_txt);
        startWithTxt = findViewById(R.id.startwith_txt);
        wordsTxt = findViewById(R.id.words_txt);
        endsWithTxt = findViewById(R.id.endswith_txt);
        indexTextTxt = findViewById(R.id.indextext_txt);
        indexOfTxt = findViewById(R.id.indexof_txt);
        lastIndexTxt = findViewById(R.id.lastindex_txt);
        lastIndexOfTxt = findViewById(R.id.lastindexof_txt);
        replaceTextTxt = findViewById(R.id.replacetext_txt);
        replaceTxt = findViewById(R.id.replace_txt);
    }

    public void handleSubmitBtn() {
        submitBtn.setOnClickListener(view -> {
            convertUppercaseText();
            convertLowercaseText();
            getLength();
            convertToTrim();
            isEmptyText();
            isContainsText();
            onStartWithText();
            endsWithText();
            indexOfText();
            lastIndexOfText();
            replaceText();
        });
    }

    public void convertUppercaseText() {
        String upperCase = enteredText().toUpperCase();
        uppercaseTxt.setText(upperCase);
    }

    public String enteredText() {
        String text = textTxt.getText().toString();
        return text;
    }

    public void convertLowercaseText() {
        String lowerCase = enteredText().toLowerCase();
        lowercaseTxt.setText(lowerCase);
    }

    public void getLength() {
        String length = String.valueOf(enteredText().length());
        lengthTxt.setText(length);
    }

    public void convertToTrim() {
        String trim = enteredText().trim();
        trimTxt.setText(trim);
    }

    public void isEmptyText() {
        String empty = String.valueOf(enteredText().isEmpty());
        emptyTxt.setText(empty);
    }

    public void isContainsText() {
        String charText = charTxt.getText().toString();
        String contains = String.valueOf(enteredText().contains(charText));
        containsTxt.setText(contains);
    }

    public void onStartWithText() {
        String letterText = letterTxt.getText().toString();
        String startText = String.valueOf(enteredText().startsWith(letterText));
        startWithTxt.setText(startText);
    }

    public void endsWithText() {
        String wordText = wordsTxt.getText().toString();
        String endText = String.valueOf(enteredText().endsWith(wordText));
        endsWithTxt.setText(endText);
    }

    public void indexOfText() {
        String index = indexTextTxt.getText().toString();
        String indexOfText = String.valueOf(enteredText().indexOf(index));
        indexOfTxt.setText(indexOfText);
    }

    public void lastIndexOfText() {
        String lastText = lastIndexTxt.getText().toString();
        int lastIndexText = enteredText().lastIndexOf(lastText);
        lastIndexOfTxt.setText(lastIndexText + "");
    }

    public void replaceText() {
        String s1 = replaceTextTxt.getText().toString();
        String replace = enteredText().replace(enteredText(), s1);
        replaceTxt.setText(replace);
    }
}