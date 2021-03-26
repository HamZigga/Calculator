package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    StringBuffer inputlog1 = new StringBuffer("");
    ArrayList<String> inputlogSec = new ArrayList<String>();
    int markerDot = 0;
    int markersymb = 0;
    TextView inputlog, anslog;

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

    public void onClickButton(View view){

        switch (view.getId()){


            case R.id.butt1:
                inputlog1.append("1");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt2:
                inputlog1.append("2");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt3:
                inputlog1.append("3");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt4:
                inputlog1.append("4");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt5:
                inputlog1.append("5");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt6:
                inputlog1.append("6");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt7:
                inputlog1.append("7");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt8:
                inputlog1.append("8");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt9:
                inputlog1.append("9");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.butt0:
                inputlog1.append("0");
                markersymb = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttplus:
                if (markersymb==0) {
                    inputlog1.append("+");
                    markersymb = 1;
                }
                markerDot = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttminus:
                if (markersymb==0) {
                    inputlog1.append("-");
                    markersymb = 1;
                }
                markerDot = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttmult:
                if (markersymb==0) {
                    inputlog1.append("*");
                    markersymb = 1;
                }
                markerDot = 0;
                inputlog.setText(inputlog1);
                break;
            case R.id.buttdiv:
                if (markersymb==0) {
                    inputlog1.append("/");
                    markersymb = 1;
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
                inputlog.setText(inputlog1);
                break;
            case R.id.buttans:

//                inputlog.setText(inputlog1);

                String s = inputlog1.toString();
                String[] parts = s.split("(?<=-)");

                StringBuffer stringBuffer1 = new StringBuffer(parts[0]);
                Integer dellen = parts[0].length();
                stringBuffer1.delete(dellen-1,dellen);
                parts[0] = stringBuffer1.toString();

                 int b1 = Integer.parseInt(parts[0]);
                 int b2 = Integer.parseInt(parts[1]);
                 int b3 = b1-b2;


                anslog.setText(Integer.toString(b3));

                break;

        }


    }

}