package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    Button btnPlus,btnMinus,btnX,btnDivision;
    String num1,num2;
    TextView res;
    Integer textres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnX=(Button)findViewById(R.id.btnX);
        btnDivision=(Button)findViewById(R.id.btnDivision);
        res=(TextView)findViewById(R.id.TextRes);
        View.OnClickListener Listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId())
                {
                    case R.id.btnPlus:
                        num1=edit1.getText().toString();
                        num2=edit2.getText().toString();
                        textres=Integer.parseInt(num1)+Integer.parseInt(num2);
                        res.setText("계산결과:"+textres);
                        break;
                    case R.id.btnMinus:
                        num1=edit1.getText().toString();
                        num2=edit2.getText().toString();
                        textres=Integer.parseInt(num1)-Integer.parseInt(num2);
                        res.setText("계산결과:"+textres);
                        break;
                    case R.id.btnX:
                        num1=edit1.getText().toString();
                        num2=edit2.getText().toString();
                        textres=Integer.parseInt(num1)*Integer.parseInt(num2);
                        res.setText("계산결과:"+textres);
                        break;
                    case R.id.btnDivision:
                        num1=edit1.getText().toString();
                        num2=edit2.getText().toString();
                        textres=Integer.parseInt(num1)/Integer.parseInt(num2);
                        res.setText("계산결과:"+textres);
                        break;
                }
            }
        };
        btnPlus.setOnClickListener(Listener);
        btnMinus.setOnClickListener(Listener);
        btnX.setOnClickListener(Listener);
        btnDivision.setOnClickListener(Listener);
    }
}