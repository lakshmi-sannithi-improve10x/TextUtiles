package com.improve10x.textutilies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AppendMethodActivity extends AppCompatActivity {
    EditText nameTxt;
    EditText suffixTxt;
    Button appendBtn;
    TextView resultTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_append_method);
        initViews();
        handleAppendBtn();
    }

    private void initViews() {
        nameTxt = findViewById(R.id.name_txt);
        suffixTxt = findViewById(R.id.suffix_txt);
        appendBtn = findViewById(R.id.append_btn);
        resultTxt = findViewById(R.id.result_txt);
    }

    public void  displayAppendText(){
        String name = nameTxt.getText().toString();
        String suffix = suffixTxt.getText().toString();
       String resultText = append(name,suffix);
       resultTxt.setText(resultText);

    }
    private String append(String name, String suffix) {
        String result = "";
        StringBuilder sb = new StringBuilder(name);
        sb.append(suffix);
        result = sb.toString();
        return result;
    }
    public  void  handleAppendBtn(){
        appendBtn.setOnClickListener(view -> {
            displayAppendText();
        });
    }
}
