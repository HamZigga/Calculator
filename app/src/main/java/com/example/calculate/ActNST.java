package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActNST extends AppCompatActivity {
    StringBuffer inputlog2 = new StringBuffer("");
    Button button0, button1, buttonAns2, buttonClr2;
    TextView inplog_nst, anslog_nst;

    String name ="";

    final static String nameVariableKey = "NAME_VARIABLE";
    final static String textViewTexKey = "TEXTVIEW_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_n_s_t);


        button0 = findViewById(R.id.butt_0);
        button1 = findViewById(R.id.butt_1);
        buttonAns2 = findViewById(R.id.buttans2);
        buttonClr2 = findViewById(R.id.buttclr2);
        inplog_nst = findViewById(R.id.inplog_nst);
        anslog_nst = findViewById(R.id.anslog_nst);
    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString(nameVariableKey, name);
        TextView inputlog = (TextView) findViewById(R.id.inplog_nst);
        outState.putString(textViewTexKey, inputlog.getText().toString());

        super.onSaveInstanceState(outState);
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        name = savedInstanceState.getString(nameVariableKey);
        String textViewText = savedInstanceState.getString(textViewTexKey);
        TextView inputlog = (TextView) findViewById(R.id.inplog_nst);
        StringBuffer strb1 = new StringBuffer(textViewText);
        inputlog2 = new StringBuffer("");
        inputlog2.append(strb1);
        inputlog.setText(inputlog2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.menu_calc:
                Intent intent3 = new Intent(this, MainActivity.class);
                startActivity(intent3);
                return true;
            case R.id.menu_nst:
                Intent intent2 = new Intent(this, ActNST.class);
                startActivity(intent2);
                return true;
            case R.id.menu_log:
                Intent intent = new Intent(this, ActLog.class);
                startActivity(intent);
                return true;
            case R.id.menu_nst2:
                Intent intent4 = new Intent(this, actNSTto10.class);
                startActivity(intent4);
                return true;
        }
        return true;
    }

    public void onClickButton1(View view){
        switch (view.getId()) {
            case R.id.butt_0:
                inputlog2.append("0");
                inplog_nst.setText(inputlog2);
                break;
            case R.id.butt_1:
                inputlog2.append("1");
                inplog_nst.setText(inputlog2);
                break;
            case R.id.buttclr2:
                inputlog2 = new StringBuffer("");
                inplog_nst.setText(inputlog2);
                anslog_nst.setText("");
                break;
            case R.id.buttans2:
                String s = inputlog2.toString();
                Integer trans2to10 = Integer.parseInt(s, 2);
                anslog_nst.setText(trans2to10.toString());
                break;
        }
    }
}