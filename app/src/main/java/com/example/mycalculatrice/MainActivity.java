package com.example.mycalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btNum0, btNum1, btNum2, btNum3, btNum4, btNum5, btNum6, btNum7, btNum8, btNum9, btDiv, btMutl, btMoins, btPlus, btPourcent, btRetour, btEgal, btPoint;
    private TextView tvResultat;

    @Override
    protected void onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);
        this.tvResultat = (TextView) findViewById(R.id.idResultat);
        this.btNum0 = (Button) findViewById(R.id.idNum0);
        this.btNum1 = (Button) findViewById(R.id.idNum1);
        this.btNum2 = (Button) finViewById(R.id.idNum2);
        this.btNum3 = (Button) findViewById(R.id.idNum3);
        this.btNum4 = (Button) findViewById(R.id.idNum4);
        this.btNum5 = (Button) findViewById(R.id.idNum5);
        this.btNum6 = (Button) findViewById(R.id.idNum6);
        this.btNum7 = (Button) findViewById(R.id.idNum7);
        this.btNum8 = (Button) findViewById(R.id.idNum8);
        this.btNum9 = (Button) findViewById(R.id.idNum9);
        this.btDiv = (Button) findViewById(R.id.idDiv);
        this.btMutl = (Button) findViewById(R.id.idMult);
        this.btMoins = (Button) findViewById(R.id.idMoins);
        this.btPlus = (Button) findViewById(R.id.idPlus);
        this.btPourcent = (Button) findViewById(R.id.idPourcent);
        this.btRetour = (Button) findViewById(R.id.idRetour);
        this.btEgal = (Button) findViewById(R.id.idEgal);
        this.btPoint = (Button) findViewById(R.id.idPoint);
        this.btNum0.setOnClickListener(this);
        this.btNum1.setOnClickListener(this);
        this.btNum2.setOnClickListener(this);
        this.btNum3.setOnClickListener(this);
        this.btNum4.setOnClickListener(this);
        this.btNum5.setOnClickListener(this);
        this.btNum6.setOnClickListener(this);
        this.btNum7.setOnClickListener(this);
        this.btNum8.setOnClickListener(this);
        this.btNum9.setOnClickListener(this);
        this.btDiv.setOnClickListener(this);
        this.btMutl.setOnClickListener(this);
        this.btMoins.setOnClickListener(this);
        this.btPlus.setOnClickListener(this);
        this.btPourcent.setOnClickListener(this);
        this.btRetour.setOnClickListener(this);
        this.btEgal.setOnClickListener(this);
        this.btPoint.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }

}