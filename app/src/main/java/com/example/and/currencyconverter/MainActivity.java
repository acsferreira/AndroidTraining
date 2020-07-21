package com.example.and.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        Log.i("Info", "Button clicked.");
        EditText editText= (EditText) findViewById(R.id.editText);
        double dollars = Double.parseDouble(editText.getText().toString());
        double euros=0.88*dollars;
        String strEuros=String.format("%.2f",euros);
        String strDollars= editText.getText().toString();
        Log.i("Info", "$"+strDollars+" is €"+strEuros);
        Toast.makeText(this, "$"+strDollars+" is €"+strEuros, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
