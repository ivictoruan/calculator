package br.com.ecp.victor.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button numberZero, numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix,
            numberSeven, numberEight, numberNine, clean_button, division, multiplication, sum, subtraction,
            equal, dot;

    private TextView txtExpression, txtResult;
    private ImageView backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartComponents();
        getSupportActionBar().hide();
    }

    private void StartComponents () {
        numberZero = findViewById(R.id.number_zero);
        numberOne = findViewById(R.id.number_one);
        numberTwo = findViewById(R.id.number_two);
        numberThree = findViewById(R.id.number_three);
        numberFour = findViewById(R.id.number_four);
        numberFive = findViewById(R.id.number_five);
        numberSix = findViewById(R.id.number_six);
        numberSeven = findViewById(R.id.number_seven);
        numberEight = findViewById(R.id.number_eight);
        numberNine = findViewById(R.id.number_nine);
        dot = findViewById(R.id.dot);
        sum = findViewById(R.id.bt_sum);
        multiplication = findViewById(R.id.bt_multiplication);
        subtraction = findViewById(R.id.bt_subtraction);
        division = findViewById(R.id.bt_division);
        equal = findViewById(R.id.equal);
        clean_button = findViewById(R.id.bt_clean);
        txtExpression = findViewById(R.id.txt_expression);
        txtResult = findViewById(R.id.txt_result);
        backspace = findViewById(R.id.backspace);

    }
    public void addExpression(String string, boolean clean_data) {//the second parametrer is a state
        if(txtResult.getText().equals("")) {// se o resultador for vazio,
            txtExpression.setText("");// a expressão será vazia
        }
        if(clean_data) {
            txtResult.setText("");
        }else {
            txtExpression.append(txtResult.getText());
        }
        txtExpression.append(string);
    }


}