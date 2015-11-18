package com.example.guest.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view) {

        EditText poundField = (EditText) findViewById(R.id.poundField);

        Double dollarAmount = Double.parseDouble(poundField.getText().toString());

        Double poundAmount = dollarAmount * .66;

        Toast.makeText(getApplicationContext(), "£" + poundAmount.toString(), Toast.LENGTH_LONG).show();

    }

    public void convertReal (View view) {

        EditText realField = (EditText) findViewById(R.id.realField);

        Double dollarAmountTwo = Double.parseDouble(realField.getText().toString());

        Double realAmount = dollarAmountTwo * 3.81;

        Toast.makeText(getApplicationContext(), "R$" + realAmount.toString(), Toast.LENGTH_LONG).show();

    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
