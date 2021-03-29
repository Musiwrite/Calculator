package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;


//I, myself, Daiwik have edited the document
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This class has access to the labels, textboxes, buttons, and the answer label

    //Step 1: Get the values from two text boxes
    //Step 2: Perform the respective calculations (depending on which button)
    //Step 3: Display the answer to the answer label

    private double getFirstNum () {
        EditText firstNumText = findViewById(R.id.firstNum);
        String firstNumStr = firstNumText.getText().toString();
        if (firstNumStr.isEmpty())
            firstNumStr = "0";
        double fnum = Double.parseDouble(firstNumStr);
        return fnum;
    }

    private double getSecondNum () {
        EditText secondNumText = findViewById(R.id.secondNum);
        String secondNumStr = secondNumText.getText().toString();
        if (secondNumStr.isEmpty())
            secondNumStr = "0";
        double fnum = Double.parseDouble(secondNumStr);
        return fnum;
    }

    private void setAnswer (double ans) {
        TextView answer = findViewById(R.id.answerLabel);
        String ansStr = Double.toString(ans);
        answer.setText("Answer: "+ansStr);

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", ansStr);
        startActivity(intent);
    }

    public void performAddition(View v) {
        //Step 1: Get the values from two text boxes
        double fnum = getFirstNum();
        double snum = getSecondNum();

        //Step 2: Perform the respective calculations (depending on which button)
        double ans = fnum + snum;

        //Step 3: Display the answer to the answer label
        setAnswer(ans);

        Toast toast = Toast.makeText(getApplicationContext(), "Adding values "+fnum
                +" and "+snum, Toast.LENGTH_LONG);
        toast.show();
    }

    public void performSubtraction(View v) {
        //Step 1: Get the values from two text boxes
        double fnum = getFirstNum();
        double snum = getSecondNum();

        //Step 2: Perform the respective calculations (depending on which button)
        double ans = fnum - snum;

        //Step 3: Display the answer to the answer label
        setAnswer(ans);

        Toast toast = Toast.makeText(getApplicationContext(), "Subtracting values "+snum
                +" from "+fnum, Toast.LENGTH_LONG);
        toast.show();
    }

    public void performMultiplication(View v) {
        //Step 1: Get the values from two text boxes
        double fnum = getFirstNum();
        double snum = getSecondNum();

        //Step 2: Perform the respective calculations (depending on which button)
        double ans = fnum * snum;

        //Step 3: Display the answer to the answer label
        setAnswer(ans);

        Toast toast = Toast.makeText(getApplicationContext(), "Multiplying values "+fnum
                +" from "+snum, Toast.LENGTH_LONG);
        toast.show();
    }

    public void performDivision(View v) {
        //Step 1: Get the values from two text boxes
        double fnum = getFirstNum();
        double snum = getSecondNum();

        //Step 2: Perform the respective calculations (depending on which button)
        double ans = fnum / snum;

        //Step 3: Display the answer to the answer label
        setAnswer(ans);

        Toast toast = Toast.makeText(getApplicationContext(), "Dividing values "+fnum
                +" by "+snum, Toast.LENGTH_LONG);
        toast.show();
    }
}