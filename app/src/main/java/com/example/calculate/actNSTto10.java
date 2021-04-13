package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class actNSTto10 extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonClr3,buttonAns3;
    StringBuffer inputlog3 = new StringBuffer("");
    TextView inplog_nst3, anslog_nst3;

    String name ="";

    final static String nameVariableKey = "NAME_VARIABLE";
    final static String textViewTexKey = "TEXTVIEW_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_n_s_tto10);


        button1 = findViewById(R.id.butt10_1);
        button2 = findViewById(R.id.butt10_2);
        button3 = findViewById(R.id.butt10_3);
        button4 = findViewById(R.id.butt10_4);
        button5 = findViewById(R.id.butt10_5);
        button6 = findViewById(R.id.butt10_6);
        button7 = findViewById(R.id.butt10_7);
        button8 = findViewById(R.id.butt10_8);
        button9 = findViewById(R.id.butt10_9);
        button0 = findViewById(R.id.butt10_0);
        buttonClr3 = findViewById(R.id.butt10_clr);
        buttonAns3 = findViewById(R.id.butt10_ans);
        inplog_nst3 = findViewById(R.id.inplog_nst2);
        anslog_nst3 = findViewById(R.id.anslog_nst2);
    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString(nameVariableKey, name);
        TextView inputlog = (TextView) findViewById(R.id.inplog_nst2);
        outState.putString(textViewTexKey, inputlog.getText().toString());

        super.onSaveInstanceState(outState);
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        name = savedInstanceState.getString(nameVariableKey);
        String textViewText = savedInstanceState.getString(textViewTexKey);
        TextView inputlog = (TextView) findViewById(R.id.inplog_nst2);
        StringBuffer strb1 = new StringBuffer(textViewText);
        inputlog3 = new StringBuffer("");
        inputlog3.append(strb1);
        inputlog.setText(inputlog3);
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
            case R.id.menu_nst2:
                Intent intent4 = new Intent(this, actNSTto10.class);
                startActivity(intent4);
                return true;
            case R.id.menu_log:
                Intent intent = new Intent(this, ActLog.class);
                startActivity(intent);
                return true;
        }
        return true;
    }


    public void onClickButton(View view){
        switch (view.getId()) {
            case R.id.butt10_0:
                inputlog3.append("0");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_1:
                inputlog3.append("1");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_2:
                inputlog3.append("2");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_3:
                inputlog3.append("3");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_4:
                inputlog3.append("4");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_5:
                inputlog3.append("5");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_6:
                inputlog3.append("6");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_7:
                inputlog3.append("7");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_8:
                inputlog3.append("8");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_9:
                inputlog3.append("9");
                inplog_nst3.setText(inputlog3);
                break;
            case R.id.butt10_clr:
                inputlog3 = new StringBuffer("");
                inplog_nst3.setText(inputlog3);
                anslog_nst3.setText("");
                break;
            case R.id.butt10_ans:
                String s = inputlog3.toString();
                Integer a = Integer.parseInt(s);
                String trans10to2 = (Integer.toString(a, 2));
                anslog_nst3.setText(trans10to2);
                break;
        }
    }


}