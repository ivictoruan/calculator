package br.com.ecp.victor.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button numberZero, numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix,
            numberSeven, numberEight, numberNine, C, Division, Multiplication, Plus, Subtration,
            Equal, Dot, backSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
    }
}