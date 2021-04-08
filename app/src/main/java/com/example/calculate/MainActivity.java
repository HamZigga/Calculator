package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.cert.TrustAnchor;


public class MainActivity extends AppCompatActivity {
    StringBuffer inputlog1 = new StringBuffer("");

    int markerDot = 0;
    int markersymb = 0;
    int markerBracketL = 1;
    int markerBracketR = 0;
    TextView inputlog, anslog;
    private final static String FILE_NAME = "content.txt";

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonplus,buttonminus,buttonmult,buttondiv,buttonans,buttondot,buttonclr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.butt1);
        button2 = findViewById(R.id.butt2);
        button3 = findViewById(R.id.butt3);
        button4 = findViewById(R.id.butt4);
        button5 = findViewById(R.id.butt5);
        button6 = findViewById(R.id.butt6);
        button7 = findViewById(R.id.butt7);
        button8 = findViewById(R.id.butt8);
        button9 = findViewById(R.id.butt9);
        button0 = findViewById(R.id.butt0);
        buttonplus = findViewById(R.id.buttplus);
        buttonminus = findViewById(R.id.buttminus);
        buttonmult = findViewById(R.id.buttmult);
        buttondiv = findViewById(R.id.buttdiv);
        buttondot = findViewById(R.id.buttdot);
        buttonans = findViewById(R.id.buttans);
        buttonclr = findViewById(R.id.buttclr);
        inputlog = findViewById(R.id.inplog);
        anslog = findViewById(R.id.anslog);



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
        }
        return true;
    }

    public void onClickButton(View view){

        switch (view.getId()){


            case R.id.butt1:
                inputlog1.append("1");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt2:
                inputlog1.append("2");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt3:
                inputlog1.append("3");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt4:
                inputlog1.append("4");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt5:
                inputlog1.append("5");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt6:
                inputlog1.append("6");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt7:
                inputlog1.append("7");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt8:
                inputlog1.append("8");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt9:
                inputlog1.append("9");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt0:
                inputlog1.append("0");
                markersymb = 0;
                markerBracketL = 0;
                markerBracketR = 1;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttplus:
                if (markersymb==0) {
                    inputlog1.append("+");
                    markersymb = 1;
                    markerBracketR = 0;
                    markerBracketL = 1;
                }
                markerDot = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttminus:
                if (markersymb==0) {
                    inputlog1.append("-");
                    markersymb = 1;
                    markerBracketR = 0;
                    markerBracketL = 1;
                }
                markerDot = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttmult:
                if (markersymb==0) {
                    inputlog1.append("*");
                    markersymb = 1;
                    markerBracketR = 0;
                    markerBracketL = 1;
                }
                markerDot = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttdiv:
                if (markersymb==0) {
                    inputlog1.append("/");
                    markersymb = 1;
                    markerBracketR = 0;
                    markerBracketL = 1;
                }
                markerDot = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttdot:
                if (markerDot==0) {
                    inputlog1.append(".");
                    markerDot = 1;
                }
                inputlog.setText(inputlog1);
                break;
            case R.id.buttclr:
                inputlog1 = new StringBuffer("");
                markerDot = 0;
                markerBracketL = 1;
                markerBracketR = 0;
                inputlog.setText(inputlog1);
                anslog.setText("");
                break;
            case R.id.buttbracketL:
                if (markerBracketL==1) {
                    inputlog1.append("(");
                    markerDot = 1;
                }
                inputlog.setText(inputlog1);
                break;
            case R.id.buttbracketR:
                if (markerBracketR==1) {
                    inputlog1.append(")");
                    markerDot = 1;
                }
                inputlog.setText(inputlog1);
                break;
            case R.id.buttans:
                String s = inputlog1.toString();
                Double re = eval(s);


                if (re%1==0){
                    Integer b = (int)Math.round(re);
                    anslog.setText(b.toString());
                }
                else {
                    anslog.setText(re.toString());
                }
                saveSolutionLog(view);

                break;

        }


    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }


    public void saveSolutionLog(View view){

        FileOutputStream fos = null;
        try {
            TextView firstStr = (TextView) findViewById(R.id.inplog);
            TextView secondStr = (TextView) findViewById(R.id.anslog);
            String text = firstStr.getText().toString() + " = " + secondStr.getText().toString() + "\n";

            fos = openFileOutput(FILE_NAME, MODE_APPEND);
            fos.write(text.getBytes());
        }
        catch(IOException ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){
                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}