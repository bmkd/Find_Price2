package com.example.user.find_price;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.find_price.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Frame extends AppCompatActivity  {

    private Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);
        btn_calculate = (Button) findViewById(R.id.btn_calculate);
        final EditText et3 = (EditText) findViewById(R.id.cubefeet);
        final EditText et4 = (EditText) findViewById(R.id.woodwidth);
        final EditText et5=(EditText)findViewById(R.id.squarefeet);
        final CheckBox wood=(CheckBox)findViewById(R.id.wood);
        final CheckBox newwood=(CheckBox)findViewById(R.id.newwood);
        final int[] W = {0};
        final int[] Nw= {0};
        newwood.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    Nw[0]=1;
                    W[0]=0;
                    wood.setChecked(false);
                }
                else{
                    Nw[0]=0;
                }
                if(W[0]==1)
                {

                    et3.setEnabled(true);
                    et4.setEnabled(true);
                    et3.setText("");
                    et4.setText("");

                }
                else
                {
                    et3.setText("xxxx");
                    et4.setText("xxxx");
                    et3.setEnabled(false);
                    et4.setEnabled(false);
                }

                if(Nw[0]==1)
                {
                    et5.setEnabled(true);
                    et5.setText("");

                }
                else
                {
                    et5.setEnabled(false);
                    et5.setText("xxxx");
                }
            }
        });
        wood.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[0]=1;
                    Nw[0]=0;
                    newwood.setChecked(false);
                }
                else{
                    W[0]=0;
                }
                if(W[0]==1)
                {

                    et3.setEnabled(true);
                    et4.setEnabled(true);
                    et3.setText("");
                    et4.setText("");

                }
                else
                {
                    et3.setText("xxxx");
                    et4.setText("xxxx");
                    et3.setEnabled(false);
                    et4.setEnabled(false);
                }

                if(Nw[0]==1)
                {
                    et5.setEnabled(true);
                    et5.setText("");
                }
                else
                {
                    et5.setEnabled(false);
                    et5.setText("xxxx");
                }
            }
        });
        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.Length);
                String x = et.getText().toString();

                EditText et1 = (EditText) findViewById(R.id.Breadth);
                String y = et1.getText().toString();

                EditText et2 = (EditText) findViewById(R.id.Outerwidth);
                String z = et2.getText().toString();

                EditText et3 = (EditText) findViewById(R.id.cubefeet);
                String a = et3.getText().toString();

                EditText et4 = (EditText) findViewById(R.id.woodwidth);
                String b = et4.getText().toString();
                EditText et5=(EditText)findViewById(R.id.squarefeet);
                String c=et5.getText().toString();
                TextView totalPrice = (TextView) findViewById(R.id.total_price);
                int TotalChecks=W[0]+Nw[0];
                if(TotalChecks!=1){
                    Toast.makeText(getApplicationContext(), "Surely you have not missed any box?", Toast.LENGTH_SHORT).show();
                    totalPrice.setText("");}
                else {
                    if (x.equals("") || y.equals("") || z.equals("") || a.equals("") || b.equals("")||c.equals("")) {
                        Toast.makeText(getApplicationContext(), "Have you missed any field?", Toast.LENGTH_SHORT).show();
                        totalPrice.setText("");}
                    else{
                        double L = Double.parseDouble(x);
                        double B = Double.parseDouble(y);
                        double outerwidth = Double.parseDouble(z);
                        double Cf=0;
                        double Ww=0;
                        if(W[0]==1)
                        {Cf = Double.parseDouble(a);
                            Ww = Double.parseDouble(b);}
                        double Sf=0;
                        if(Nw[0]==1){
                            Sf=Double.parseDouble(c);}

                        double price =W[0]*((2*B*outerwidth*Cf*Ww)+(2*L*outerwidth*Cf*Ww))/1728
                                +Nw[0]*((2*B*outerwidth*Sf)+(2*L*outerwidth*Sf))/144;
                        NumberFormat numberFormat;
                        numberFormat = new DecimalFormat("0.00");
                        totalPrice.setText( "₹ "+("" + numberFormat.format(price)));}
                }

            }
        });

    }






  /*  public void calculatePrice(View view)
    {
        EditText et=(EditText) findViewById(R.id.Length);
        double length= Double.parseDouble(et.getText().toString());
        EditText et1=(EditText) findViewById(R.id.Width);
        double width= Double.parseDouble(et1.getText().toString());
        EditText et2=(EditText) findViewById(R.id.Height);
        double height= Double.parseDouble(et2.getText().toString());
        EditText et3=(EditText) findViewById(R.id.cubefeet);
        double Cf= Double.parseDouble(et3.getText().toString());
        EditText et4=(EditText) findViewById(R.id.woodwidth);
        double Ww= Double.parseDouble(et4.getText().toString());
        TextView totalPrice = (TextView) findViewById(R.id.total_price);
        double price=((Ww*length*width+Ww*height*width+Ww*height*length)*(Cf))/864;
        NumberFormat numberFormat;
        numberFormat = new DecimalFormat("0.00");
        if(et4==null|et3==null|et2==null|et1==null|et==null)
        {
            Toast.makeText(getApplicationContext(), "Your toast message.",
                    Toast.LENGTH_SHORT).show();
        }
        else
        totalPrice.setText(""+numberFormat.format(price)+" ₹");
    }*/


}
