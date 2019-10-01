package com.example.opbasicasnajera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1;
    EditText n2;
    Button btn;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);
        btn = (Button) findViewById(R.id.suma);
        msg = (TextView) findViewById(R.id.res);

        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int nm1 = Integer.parseInt(n1.getText().toString());
        int nm2 = Integer.parseInt(n2.getText().toString());
        int nm3 = nm1 + nm2;
        msg.setText("El resultado es " +nm3);

    }
}
