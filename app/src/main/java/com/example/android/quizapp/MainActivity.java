// Add your package below
package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View v)
    {   int ans=quiz();
        EditText namefield=(EditText)findViewById(R.id.name_field);
        String name= namefield.getText().toString();

        EditText cityfield=(EditText)findViewById(R.id.city_field);
        String city= cityfield.getText().toString();

        if(ans==6)
        Toast.makeText(this,"WoW!" + name +" All correct",Toast.LENGTH_SHORT).show();
        else if(ans>3)
        Toast.makeText(this,"Good!"+name + " you got "+ans+" out of 6 ",Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, name +"you got "+ans+" out of 6 "+ " Try again..",Toast.LENGTH_SHORT).show();

    }
    public int quiz(){
        int c=0;
        RadioButton r1=(RadioButton) findViewById(R.id.oneb);
        CheckBox r21=(CheckBox) findViewById(R.id.twoa);
        CheckBox r22=(CheckBox) findViewById(R.id.twob);
        CheckBox r23=(CheckBox) findViewById(R.id.twoc);
        RadioButton r3=(RadioButton) findViewById(R.id.threea);
        RadioButton r4=(RadioButton) findViewById(R.id.fourc);
        RadioButton r5=(RadioButton) findViewById(R.id.fivec);
        if(r1.isChecked())
            c++;
        if(r21.isChecked() && r22.isChecked() && !r23.isChecked())
            c++;
        if(r3.isChecked())
            c++;
        if(r4.isChecked())
            c++;
        if(r5.isChecked())
            c++;
        EditText answersix=(EditText)findViewById(R.id.six);
        String answer=answersix.getText().toString();
        {
            if (answer.equals("multicolour"))
                c++;
        }
        return c;
    }



}