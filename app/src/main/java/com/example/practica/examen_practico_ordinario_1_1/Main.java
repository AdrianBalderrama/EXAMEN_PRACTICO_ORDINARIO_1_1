package com.example.practica.examen_practico_ordinario_1_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    TextView txtVwResu, txtVwm3,txtVwgrados;
    EditText edtTxtPi, edtTxtRadio, edtTxtGrados;
    Button btnCerrar, btnCalcular;
    RadioGroup rdGrp1;
    RadioButton rdBtnCalCunaEsf, rdBtnCalVol,rdBtnCalArea;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCerrar= findViewById(R.id.btnCerrar);
        btnCalcular= findViewById(R.id.btnCalcular);
        edtTxtPi= findViewById(R.id.edtTxtPi);
        edtTxtRadio= findViewById(R.id.edtTxtRadio);
        edtTxtGrados=findViewById(R.id.edtTxtGrados);
        rdBtnCalArea=findViewById(R.id.rdBtnCalArea);
        rdBtnCalVol=findViewById(R.id.rdBtnCalVol);
        rdBtnCalCunaEsf=findViewById(R.id.rdBtnCalCunaEsf);
        txtVwResu=findViewById(R.id.txtVwResu);
        rdGrp1=findViewById(R.id.rdGrp1);
        txtVwgrados=findViewById(R.id.txtVwGrados);
        txtVwm3=findViewById(R.id.txtVwm3);
// HACER INVISIBLE LOS ELEMENTOS NO NECESARIOS
edtTxtGrados.setVisibility(View.GONE);
txtVwgrados.setVisibility(View.GONE);
txtVwm3.setVisibility(View.GONE);



rdBtnCalCunaEsf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(rdBtnCalCunaEsf.isChecked()){
            edtTxtGrados.setVisibility(View.VISIBLE);
            txtVwgrados.setVisibility(View.VISIBLE);
            txtVwm3.setVisibility(View.VISIBLE);
        } else{
            edtTxtGrados.setVisibility(View.GONE);
            txtVwgrados.setVisibility(View.GONE);
            txtVwm3.setVisibility(View.GONE);
        }
    }
});


btnCalcular.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(rdBtnCalArea.isChecked()){
        double number2 = Double.parseDouble(edtTxtRadio.getText().toString());
        double number1 = Double.parseDouble(edtTxtPi.getText().toString());
        double sum= (number1*Math.PI)*Math.pow(number2, 2);
        txtVwResu.setText("Resultado es;"+String.valueOf(sum));
    }

        else if(rdBtnCalVol.isChecked()){
            double number2 = Double.parseDouble(edtTxtRadio.getText().toString());
            double number1 = Double.parseDouble(edtTxtPi.getText().toString());
            double op= (((4*(number1*Math.PI))*Math.pow(number2,3)/3));
            txtVwResu.setText("Resultado es;"+String.valueOf(op));


        }
        else if(rdBtnCalCunaEsf.isChecked()) {
            double number1 = Double.parseDouble(edtTxtPi.getText().toString());
            double number2 = Double.parseDouble(edtTxtRadio.getText().toString());
            double n = Double.parseDouble(edtTxtGrados.getText().toString());
            double sum3= (4/3)*(((number1*Math.PI)*Math.pow(number2,3))/360)*n;
            txtVwResu.setText("Resultado es;"+String.valueOf(sum3));



        }
        else{txtVwResu.setText("ERROR ELIJA UNA OPERACION E INSERTE VALORES");
        }


btnCerrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        finish();
    }
});

    }




});

    }


}
