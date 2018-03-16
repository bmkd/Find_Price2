package com.example.user.find_price;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ChestOfDrawer extends AppCompatActivity  {

  Button btn_same;
    Button btn_diff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chestofdrawers);
      btn_same = (Button) findViewById(R.id.btn_same);
      btn_diff =(Button)findViewById(R.id.btn_diff);
        final EditText et3 = (EditText) findViewById(R.id.cubefeet);
        final EditText et4 = (EditText) findViewById(R.id.woodwidth);
        final EditText et5=(EditText)findViewById(R.id.squarefeet);
        final CheckBox nwtop=(CheckBox)findViewById(R.id.newwoodtop);
        final  CheckBox nwbottom=(CheckBox)findViewById(R.id.newwoodbottom);
        final CheckBox nwleft=(CheckBox)findViewById(R.id.newwoodleft);
        final  CheckBox nwright=(CheckBox)findViewById(R.id.newwoodright);
        final CheckBox nwback=(CheckBox)findViewById(R.id.newwoodback);
        final  CheckBox wtop=(CheckBox)findViewById(R.id.woodtop);
        final CheckBox wbottom=(CheckBox)findViewById(R.id.woodbottom);
        final CheckBox wleft=(CheckBox)findViewById(R.id.woodleft);
        final CheckBox wright=(CheckBox)findViewById(R.id.woodright);
        final CheckBox wback=(CheckBox)findViewById(R.id.woodback);
        final int[] W = {0,0,0,0,0};
        final int[] Nw= {0,0,0,0,0};
        nwtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nwtop.isChecked()){
                    Nw[0]=1;
                    W[0]=0;
                    wtop.setChecked(false);
                }
                else{
                    Nw[0]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        wtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wtop.isChecked()){
                    W[0]=1;
                    Nw[0]=0;
                    nwtop.setChecked(false);
                }
                else{
                    W[0]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        nwbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nwbottom.isChecked()){
                    Nw[1]=1;
                    W[1]=0;
                    wbottom.setChecked(false);
                }
                else{
                    Nw[1]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        wbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wbottom.isChecked()){
                    W[1]=1;
                    Nw[1]=0;
                    nwbottom.setChecked(false);
                }
                else{
                    W[1]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        nwleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nwleft.isChecked()){
                    Nw[2]=1;
                    W[2]=0;
                    wleft.setChecked(false);
                }
                else{
                    Nw[2]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        wleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wleft.isChecked()){
                    W[2]=1;
                    Nw[2]=0;
                    nwleft.setChecked(false);
                }
                else{
                    W[2]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        nwright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nwright.isChecked()){
                    Nw[3]=1;
                    W[3]=0;
                    wright.setChecked(false);
                }
                else{
                    Nw[3]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        wright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wright.isChecked()){
                    W[3]=1;
                    Nw[3]=0;
                    nwright.setChecked(false);
                }
                else{
                    W[3]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        nwback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nwback.isChecked()){
                    Nw[4]=1;
                    W[4]=0;
                    wback.setChecked(false);
                }
                else{
                    Nw[4]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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
        wback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wback.isChecked()){
                    W[4]=1;
                    Nw[4]=0;
                    nwback.setChecked(false);
                }
                else{
                    W[4]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1)
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



        btn_diff.setOnClickListener(new View.OnClickListener() {
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
                int TotalChecks=0;
                for(int i=0;i<5;i++)
                    TotalChecks+=W[i]+Nw[i];
                if (x.equals("") || y.equals("") || z.equals("") || a.equals("") || b.equals("")||c.equals("")) {
                    Toast.makeText(getApplicationContext(), "Have you missed any field?", Toast.LENGTH_SHORT).show();
                    }
                else {
                    if(TotalChecks!=5){
                        Toast.makeText(getApplicationContext(), "Surely you have not missed any box?", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        double L = Double.parseDouble(x);
                        double B = Double.parseDouble(y);
                        double H = Double.parseDouble(z);
                        double Cf=0;
                        double Ww=0;
                        if(W[0]==1||W[1]==1||W[2]==1||W[3]==1||W[4]==1)
                        {Cf = Double.parseDouble(a);
                            Ww = Double.parseDouble(b);}
                        double Sf=0;
                        if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1||Nw[4]==1){
                            Sf=Double.parseDouble(c);}

                        double price =(((W[0]*L*B+W[1]*L*B+W[2]*B*H+W[3]*B*H+W[4]*L*H)*Cf*Ww)/1728)+
                                (((Nw[0]*L*B+Nw[1]*L*B+Nw[2]*B*H+Nw[3]*B*H+Nw[4]*L*H)*Sf)/144) ;
                        Intent i = new Intent(ChestOfDrawer.this,NumberOfDiffDrawers.class);
                       // i.putExtra("key",price);
                        startActivity(i);
                        }
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
