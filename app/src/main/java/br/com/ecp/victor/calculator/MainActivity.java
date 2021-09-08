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

        numberZero.setOnClickListener(this);
        numberOne.setOnClickListener(this);
        numberTwo.setOnClickListener(this);
        numberThree.setOnClickListener(this);
        numberFour.setOnClickListener(this);
        numberFive.setOnClickListener(this);
        numberSix.setOnClickListener(this);
        numberSeven.setOnClickListener(this);
        numberEight.setOnClickListener(this);
        numberNine.setOnClickListener(this);
        dot.setOnClickListener(this);
        sum.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        division.setOnClickListener(this);

        bt_clean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtExpression.setText("");
                txtResult.setText("");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                TextView expression = findViewById(R.id.txt_expression);
                String string = expression.getText().toString();

                if(!string.isEmpty()){

                    byte var0 = 0;
                    int var1 = string.length() - 1;
                    String txtExpression = string.substring(var0, var1);
                    expression.setText(txtExpression);
                }
                txtResult.setText("");
            }
        });
    }

    private void StartComponents () {

    }
    public void addExpression(String string, boolean clean_data) {//the second parametrer is a state
        if(txtResult.getText().equals("")) {
            txtExpression.setText("");
        }
        if(clean_data) {
            txtResult.setText("");
            txtExpression.append(string);

        }else {
            txtExpression.append(txtResult.getText());
            txtExpression.append(string);
            txtResult.setText("");
        }
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
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
            case R.id.dot:
                addExpression(".", true);
                break;
        }
    }
}