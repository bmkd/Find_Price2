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
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.find_price.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Polygon extends AppCompatActivity  {

    private Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polygon);
        btn_calculate = (Button) findViewById(R.id.btn_calculate);
        final EditText et3 = (EditText) findViewById(R.id.cubefeet);
        final EditText et4 = (EditText) findViewById(R.id.woodwidth);
        final EditText et5=(EditText)findViewById(R.id.squarefeet);
        final CheckBox nwtop=(CheckBox)findViewById(R.id.newwoodtop);
        final  CheckBox nwbottom=(CheckBox)findViewById(R.id.newwoodbottom);
        final CheckBox nwback=(CheckBox)findViewById(R.id.newwoodback);
        final CheckBox nwsides=(CheckBox)findViewById(R.id.newwoodsides);
        final  CheckBox wtop=(CheckBox)findViewById(R.id.woodtop);
        final CheckBox wbottom=(CheckBox)findViewById(R.id.woodbottom);
        final CheckBox wback=(CheckBox)findViewById(R.id.woodback);
        final CheckBox wsides=(CheckBox)findViewById(R.id.woodsides);
        final CheckBox hexagon=(CheckBox)findViewById(R.id.hexagon);
        final CheckBox octagon=(CheckBox)findViewById(R.id.octagon);
        final ImageView im=(ImageView)findViewById(R.id.polygonimage);
        final int[] octhex={0,0};
        final int[] W = {0,0,0,0};
        final int[] Nw= {0,0,0,0};
        hexagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hexagon.isChecked())
                {
                    octhex[0]=1;
                    octhex[1]=0;
                    octagon.setChecked(false);
                    im.setImageResource(R.drawable.hexagon);
                }
                else
                {
                    octhex[0]=0;
                }

            }
        });
        octagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(octagon.isChecked())
                {
                    octhex[1]=1;
                    octhex[0]=0;
                    hexagon.setChecked(false);
                    im.setImageResource(R.drawable.octagon);
                }
                else
                {
                    octhex[1]=0;
                }
            }
        });
        nwtop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    Nw[0]=1;
                    W[0]=0;
                    wtop.setChecked(false);
                }
                else{
                    Nw[0]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
        wtop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[0]=1;
                    Nw[0]=0;
                    nwtop.setChecked(false);
                }
                else{
                    W[0]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
        nwsides.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    Nw[2]=1;
                    W[2]=0;
                    wsides.setChecked(false);
                }
                else{
                    Nw[2]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
        wsides.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview,boolean isChecked) {
                if(isChecked){
                    W[2]=1;
                    Nw[2]=0;
                    nwsides.setChecked(false);
                }
                else{
                    W[2]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
                    Nw[3]=1;
                    W[3]=0;
                    wback.setChecked(false);
                }
                else{
                    Nw[3]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
                    W[3]=1;
                    Nw[3]=0;
                    nwback.setChecked(false);
                }
                else{
                    W[3]=0;
                }
                if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
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

                if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1)
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
                int TotalChecks=octhex[0]+octhex[1];
                for(int i=0;i<4;i++)
                    TotalChecks+=W[i]+Nw[i];
                if(TotalChecks!=5){
                    Toast.makeText(getApplicationContext(), "Surely you have not missed any box?", Toast.LENGTH_SHORT).show();
                    totalPrice.setText("");}
                else {
                    if (y.equals("") || z.equals("") || a.equals("") || b.equals("")||c.equals("")) {
                        Toast.makeText(getApplicationContext(), "Have you missed any field?", Toast.LENGTH_SHORT).show();
                        totalPrice.setText("");}
                    else{
                        double B = Double.parseDouble(y);
                        double H = Double.parseDouble(z);
                        double Cf=0;
                        double Ww=0;
                        if(W[0]==1||W[1]==1||W[2]==1||W[3]==1)
                        {Cf = Double.parseDouble(a);
                            Ww = Double.parseDouble(b);}
                        double Sf=0;
                        if(Nw[0]==1||Nw[1]==1||Nw[2]==1||Nw[3]==1){
                            Sf=Double.parseDouble(c);}

                        double price=(W[2]+W[3]/5)*B*H*5*Cf*Ww/1728;
                        price+=(W[0]+W[1])*(2*B)*(1.732*B)*Cf*Ww/1728;
                        price+=(Nw[2]+Nw[3]/5)*B*H*5*Sf/144;
                        price+=(Nw[0]+Nw[1])*(2*B)*(1.732*B)*Sf/144;
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
