package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ActLog extends AppCompatActivity {

    private final static String FILE_NAME = "content.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_log);


        openLog();
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

    public void openLog(){
        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.logOutput);
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText(text);
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void clearLog(View view){
        FileOutputStream clr = null;
        try {
            String text = "";

            clr = openFileOutput(FILE_NAME, MODE_PRIVATE);
            clr.write(text.getBytes());

            openLog();
        }
        catch(IOException ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(clr!=null)
                    clr.close();
            }
            catch(IOException ex){
                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }

}