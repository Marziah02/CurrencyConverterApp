package com.aaa.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText userInput;
    TextView textViewA, textViewB, textViewC, textViewD, textViewE;
    String tk, dollarStr, rupeeStr, rialStr, euroStr, yenStr;
    Double tkAmountInDouble, dollarAmountInDouble, rupeeAmountInDouble, omanirialAmountInDouble, euroAmountInDouble, yenAmountInDouble;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.convertEdit);
        textViewA = findViewById(R.id.displayTVA);
        textViewB = findViewById(R.id.displayTVB);
        textViewC = findViewById(R.id.displayTVC);
        textViewD = findViewById(R.id.displayTVD);
        textViewE = findViewById(R.id.displayTVE);
    }

    public void clickMe(View view) {
        tk = userInput.getText().toString();
        tkAmountInDouble = Double.parseDouble(tk);

        dollarAmountInDouble = tkAmountInDouble*0.012;
        dollarStr = dollarAmountInDouble.toString();

        rupeeAmountInDouble = tkAmountInDouble*0.84;
        rupeeStr = rupeeAmountInDouble.toString();

        omanirialAmountInDouble = tkAmountInDouble*0.0046;
        rialStr = omanirialAmountInDouble.toString();

        euroAmountInDouble = tkAmountInDouble*0.011;
        euroStr = euroAmountInDouble.toString();

        yenAmountInDouble = tkAmountInDouble*1.30;
        yenStr = yenAmountInDouble.toString();

        textViewA.setText(dollarStr);
        textViewB.setText(rupeeStr);
        textViewC.setText(rialStr);
        textViewD.setText(euroStr);
        textViewE.setText(yenStr);

    }
}