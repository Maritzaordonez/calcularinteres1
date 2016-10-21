package edu.tecii.android.calcularinteres1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText edtCapital,edtIntereses,edtPeriodo;
    private TextView txtvmonto;
    private TextView txtvinteres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCapital=(EditText)findViewById(R.id.edt1);
        edtIntereses=(EditText)findViewById(R.id.edt2);
        edtPeriodo=(EditText)findViewById(R.id.edt3);
        txtvmonto=(TextView)findViewById(R.id.txt4);
        txtvinteres=(TextView)findViewById(R.id.txt5);
    }
    public void calcularinteres (View view){
      String capital=edtCapital.getText().toString();
      String tasa=edtIntereses.getText().toString();
      String numper=edtPeriodo.getText().toString();
      double nro1=Double.parseDouble(capital);
      double nro2=Double.parseDouble(tasa);
      double nro3=Double.parseDouble(numper);
      double monto= nro1*Math.pow((1+nro2/100),nro3);

        double interes = monto-nro1;
        String resu="";
        String resu1="";
            resu="El monto total es: " + String.format("%8.2f\n",monto);
            resu1 ="El interes a pagar es: " +String.format("%8.2f\n",interes);
            txtvmonto.setText(resu);
            txtvinteres.setText(resu1);
    }
}
