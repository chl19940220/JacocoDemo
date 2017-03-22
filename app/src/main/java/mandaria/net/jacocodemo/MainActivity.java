package mandaria.net.jacocodemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText input1_EditText;
    private EditText input2_EditText;
    private Button add_Button;
    private Button minus_Button;
    private Button multi_Button;
    private Button divide_Button;
    private TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1_EditText = (EditText) findViewById(R.id.input1_editText);
        input2_EditText = (EditText) findViewById(R.id.input2_editText);
        add_Button = (Button) findViewById(R.id.add_button);
        minus_Button = (Button) findViewById(R.id.minus_button);
        multi_Button = (Button) findViewById(R.id.multi_button);
        divide_Button = (Button) findViewById(R.id.divide_button);
        resultText = (TextView) findViewById(R.id.result_TextView);
        add_Button.setOnClickListener(this);
        minus_Button.setOnClickListener(this);
        multi_Button.setOnClickListener(this);
        divide_Button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String input1 = input1_EditText.getText().toString();
        String input2 = input2_EditText.getText().toString();
        double number1 = 0;
        double number2 = 0;
        try {
            number1 = Double.parseDouble(input1);
            number2 = Double.parseDouble(input2);
        } catch (RuntimeException e) {
            resultText.setText("Invalid Input");
            System.out.println(e.getMessage());
            return;
        }
        switch (view.getId()) {
            case R.id.add_button:
                resultText.setText(Double.toString(number1 + number2));
                break;
            case R.id.minus_button:
                resultText.setText(Double.toString(number1 - number2));
                break;
            case R.id.multi_button:
                resultText.setText(Double.toString(number1 * number2));
                break;
            case R.id.divide_button:
                if (number2 == 0) {
                    resultText.setText("Error!!!");
                    Toast.makeText(getApplication(), "dividend can't be zero!", Toast.LENGTH_SHORT).show();
                } else {
                    resultText.setText(Double.toString(number1 / number2));
                }
                break;
        }

    }
}
