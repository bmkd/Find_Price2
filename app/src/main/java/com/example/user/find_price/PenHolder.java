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

public class PenHolder extends AppCompatActivity  {

    private Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.penholder);
        btn_calculate = (Button) findViewById(R.id.btn_calculate);
        final EditText et3 = (EditText) findViewById(R.id.cubefeet);
        final EditText et4 = (EditText) findViewById(R.id.woodwidth);
        final EditText et5=(EditText)findViewById(R.id.squarefeet);
        final String a = et3.getText().toString();
        final String b = et4.getText().toString();
        final String c = et5.getText().toString();
        final  CheckBox nwbottom=(CheckBox)findViewById(R.id.newwoodbottom);
        final CheckBox nwleft=(CheckBox)findViewById(R.id.newwoodleft);
        final  CheckBox nwright=(CheckBox)findViewById(R.id.newwoodright);
        final CheckBox nwfront=(CheckBox)findViewById(R.id.newwoodfront);
        final CheckBox nwback=(CheckBox)findViewById(R.id.newwoodback);
        final CheckBox wbottom=(CheckBox)findViewById(R.id.woodbottom);
        final CheckBox wleft=(CheckBox)findViewById(R.id.woodleft);
        final CheckBox wright=(CheckBox)findViewById(R.id.woodright);
        final CheckBox wfront=(CheckBox)findViewById(R.id.woodfront);
        final CheckBox wback=(CheckBox)findViewById(R.id.woodback);
        final int[] W = {0,0,0,0,0,0};
        final int[] Nw= {0,0,0,0,0,0};
        nwbottom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    Nw[1]=1;
                    W[1]=0;
                    wbottom.setChecked(false);
                }
                else{
                    Nw[1]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        wbottom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[1]=1;
                    Nw[1]=0;
                    nwbottom.setChecked(false);
                }
                else{
                    W[1]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        nwleft.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    Nw[2]=1;
                    W[2]=0;
                    wleft.setChecked(false);
                }
                else{
                    Nw[2]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        wleft.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[2]=1;
                    Nw[2]=0;
                    nwleft.setChecked(false);
                }
                else{
                    W[2]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        nwright.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    Nw[3]=1;
                    W[3]=0;
                    wright.setChecked(false);
                }
                else{
                    Nw[3]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
                {
                    et3.setEnabled(true);
                    et4.setEnabled(true);
                    et3.setText("");
                    et4.setText("");           }
                else
                {
                    et3.setText("xxxx");
                    et4.setText("xxxx");
                    et3.setEnabled(false);
                    et4.setEnabled(false);
                }

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        wright.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[3]=1;
                    Nw[3]=0;
                    nwright.setChecked(false);
                }
                else{
                    W[3]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
                {
                    et3.setEnabled(true);
                    et4.setEnabled(true);
                    et3.setText("");
                    et4.setText("");  }
                else
                {
                    et3.setText("xxxx");
                    et4.setText("xxxx");
                    et3.setEnabled(false);
                    et4.setEnabled(false);
                }

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        nwfront.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    Nw[4]=1;
                    W[4]=0;
                    wfront.setChecked(false);
                }
                else{
                    Nw[4]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        wfront.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[4]=1;
                    Nw[4]=0;
                    nwfront.setChecked(false);
                }
                else{
                    W[4]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
                {
                    et3.setEnabled(true);
                    et4.setEnabled(true);
                    et3.setText("");
                    et4.setText("");   }
                else
                {
                    et3.setText("xxxx");
                    et4.setText("xxxx");
                    et3.setEnabled(false);
                    et4.setEnabled(false);
                }

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        nwback.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {

                if(isChecked){
                    Nw[5]=1;
                    W[5]=0;
                    wback.setChecked(false);
                }
                else{
                    Nw[5]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
                {
                    et3.setEnabled(true);
                    et4.setEnabled(true);
                    et3.setText("");
                    et4.setText("");     }
                else
                {
                    et3.setText("xxxx");
                    et4.setText("xxxx");
                    et3.setEnabled(false);
                    et4.setEnabled(false);
                }

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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
        wback.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[5]=1;
                    Nw[5]=0;
                    nwback.setChecked(false);
                }
                else{
                    W[5]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
                {
                    et3.setEnabled(true);
                    et4.setEnabled(true);
                    et3.setText("");
                    et4.setText("");   }
                else
                {
                    et3.setText("xxxx");
                    et4.setText("xxxx");
                    et3.setEnabled(false);
                    et4.setEnabled(false);
                }

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1)
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

                EditText et2 = (EditText) findViewById(R.id.Height);
                String z = et2.getText().toString();

                EditText et3 = (EditText) findViewById(R.id.cubefeet);
                String a = et3.getText().toString();

                EditText et4 = (EditText) findViewById(R.id.woodwidth);
                String b = et4.getText().toString();
                EditText et5=(EditText)findViewById(R.id.squarefeet);
                String c=et5.getText().toString();
                TextView totalPrice = (TextView) findViewById(R.id.total_price);
                int TotalChecks=0;
                for(int i=0;i<6;i++)
                    TotalChecks+=W[i]+Nw[i];
                if(TotalChecks!=5){
                    Toast.makeText(getApplicationContext(), "Surely you have not missed any box?", Toast.LENGTH_SHORT).show();
                    totalPrice.setText("");}
                else {
                    if (x.equals("") || y.equals("") || z.equals("") || a.equals("") || b.equals("")||c.equals("")) {
                        Toast.makeText(getApplicationContext(), "Have you missed any field?", Toast.LENGTH_SHORT).show();
                        totalPrice.setText("");}
                    else{
                        double L = Double.parseDouble(x);
                        double B = Double.parseDouble(y);
                        double H = Double.parseDouble(z);
                        double Cf=0;
                        double Ww=0;
                        if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1||W[5]==1)
                        {Cf = Double.parseDouble(a);
                            Ww = Double.parseDouble(b);}
                        double Sf=0;
                        if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1||Nw[5]==1){
                            Sf=Double.parseDouble(c);}

                        double price =(((W[0]*L*B+W[1]*L*B+W[2]*B*H+W[3]*B*H+W[4]*L*H+W[5]*L*H)*Cf*Ww)/1728)+
                                (((Nw[0]*L*B+Nw[1]*L*B+Nw[2]*B*H+Nw[3]*B*H+Nw[4]*L*H+Nw[5]*L*H)*Sf)/144) ;
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
