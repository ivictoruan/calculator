package br.com.ecp.victor.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button numberZero, numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix,
            numberSeven, numberEight, numberNine, bt_clean, division, multiplication, sum, subtraction,
            equal, dot;

    private TextView txtExpression, txtResult;
    private ImageView backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartComponents();
        getSupportActionBar().hide();

        SetComponents();

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
            numberNine =findViewById(R.id.number_nine);
            dot = findViewById(R.id.bt_dot);
            sum = findViewById(R.id.bt_sum);
            multiplication = findViewById(R.id.bt_multiplication);
            subtraction = findViewById(R.id.bt_subtraction);
            division = findViewById(R.id.bt_division);
            txtResult = findViewById(R.id.txt_result);
            txtExpression = findViewById(R.id.txt_expression);
            backspace = findViewById(R.id.backspace);
            equal = findViewById(R.id.equal);
            bt_clean = findViewById(R.id.bt_clean);
    }

    public void SetComponents(){
        numberZero.setOnClickListener(this);
        numberOne.setOnClickListener(this);
        numberTwo.setOnClickListener(this);
        numberThree.setOnClickListener(this);
        numberFour.setOnClickListener(this);
        numberFive.setOnClickListener (this);
        numberSix.setOnClickListener(this);
        numberSeven.setOnClickListener(this);
        numberEight.setOnClickListener(this);
        numberNine.setOnClickListener(this);
        dot.setOnClickListener(this);
        sum.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        division.setOnClickListener(this);

        bt_clean.setOnClickListener(view -> {
            txtExpression.setText("");
            txtResult.setText("");
        });

        backspace.setOnClickListener(view -> {
            TextView expression = findViewById(R.id.txt_expression);
            String string = expression.getText().toString();

            if(!string.isEmpty()){
                byte var0 = 0;
                int var1 = string.length() - 1;
                String txtExpression = string.substring(var0, var1);
                expression.setText(txtExpression);
            }
            txtResult.setText("");
        });
    }

    public void addExpression(String string, boolean clean_data) {
        if(txtResult.getText().equals("")) {
            txtExpression.setText("");
        }
        if(clean_data) {
            txtResult.setText("");

        }else {
            txtExpression.append(txtResult.getText());
        }
        txtExpression.append(string);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.number_zero:
                addExpression("0", true);
                break;

            case R.id.number_one:
                addExpression("1", true);
                break;

            case R.id.number_two:
                addExpression("2", true);
                break;

            case R.id.number_three:
                addExpression("3", true);
                break;

            case R.id.number_four:
                addExpression("4", true);
                break;

            case R.id.number_five:
                addExpression("5", true);
                break;

            case R.id.number_six:
                addExpression("6", true);
                break;

            case R.id.number_seven:
                addExpression("7", true);
                break;

            case R.id.number_eight:
                addExpression("8", true);
                break;

            case R.id.number_nine:
                addExpression("9", true);
                break;

            case R.id.bt_clean:
                addExpression("", true);
                break;

            case R.id.bt_division:
                addExpression("/", false);
                break;

            case R.id.bt_multiplication:
                addExpression("*", false);
                break;

            case R.id.bt_sum:
                addExpression("+", false);
                break;

            case R.id.bt_subtraction:
                addExpression("-", false);
                break;

            case R.id.equal:
                addExpression("=", false);
                break;

            case R.id.bt_dot:
                addExpression(".", true);
                break;
        }
    }
}