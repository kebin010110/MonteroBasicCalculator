package mcm.edu.ph.montero_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd, btnSub, btnDiv, btnMul, btnMod;


        btnAdd = findViewById(R.id.btnAddition);
        btnDiv = findViewById(R.id.btnDivision);
        btnSub = findViewById(R.id.btnSubtraction);
        btnMul = findViewById(R.id.btnMultiplication);
        btnMod = findViewById(R.id.btnModulo);


        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){

        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch(v.getId()) {
            case R.id.btnAddition:
                answer = op1 + op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.btnDivision:
                answer = op1 / op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.btnSubtraction:
                answer = op1 - op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.btnMultiplication:
                answer = op1 * op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.btnModulo:
                answer = op1 % op2;
                txtAnswer.setText(Double.toString(answer));

                break;

        }
    }
}