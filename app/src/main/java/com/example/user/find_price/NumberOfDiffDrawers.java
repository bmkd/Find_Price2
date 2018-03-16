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

public class NumberOfDiffDrawers extends AppCompatActivity  {
   //Intent i1 = getIntent();
    //double temp = i1.getExtras().getDouble("key");
    private Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numberofdrawers);
        btn_calculate = (Button) findViewById(R.id.btn_calculate);
        final EditText et3 = (EditText) findViewById(R.id.cubefeet1);
        final EditText et4 = (EditText) findViewById(R.id.woodwidth1);
        final EditText et5=(EditText)findViewById(R.id.squarefeet1);
        final CheckBox nwfront=(CheckBox)findViewById(R.id.newwoodfront1);
        final  CheckBox nwbottom=(CheckBox)findViewById(R.id.newwoodbottom1);
        final CheckBox nwleft=(CheckBox)findViewById(R.id.newwoodleft1);
        final  CheckBox nwright=(CheckBox)findViewById(R.id.newwoodright1);
        final CheckBox nwback=(CheckBox)findViewById(R.id.newwoodback1);
        final  CheckBox wfront=(CheckBox)findViewById(R.id.woodfront1);
        final CheckBox wbottom=(CheckBox)findViewById(R.id.woodbottom1);
        final CheckBox wleft=(CheckBox)findViewById(R.id.woodleft1);
        final CheckBox wright=(CheckBox)findViewById(R.id.woodright1);
        final CheckBox wback=(CheckBox)findViewById(R.id.woodback1);
        final int[] W = {0,0,0,0,0};
        final int[] Nw= {0,0,0,0,0};
        nwfront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nwfront.isChecked()){
                    Nw[0]=1;
                    W[0]=0;
                    wfront.setChecked(false);
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
        wfront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(wfront.isChecked()){
                    W[0]=1;
                    Nw[0]=0;
                    nwfront.setChecked(false);
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
                for(int i=0;i<5;i++)
                    TotalChecks+=W[i]+Nw[i];
                if (x.equals("") || y.equals("") || z.equals("") || a.equals("") || b.equals("")||c.equals("")) {
                    Toast.makeText(getApplicationContext(), "Have you missed any field?", Toast.LENGTH_SHORT).show();
                    totalPrice.setText("");}
                else {
                    if(TotalChecks!=5){
                        Toast.makeText(getApplicationContext(), "Surely you have not missed any box?", Toast.LENGTH_SHORT).show();
                        totalPrice.setText("");}
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
                                (((Nw[0]*L*B+Nw[1]*L*B+Nw[2]*B*H+Nw[3]*B*H+Nw[4]*L*H)*Sf)/144);
                        NumberFormat numberFormat;
                        numberFormat = new DecimalFormat("0.000");
                        totalPrice.setText( "₹ "+("" + numberFormat.format(price)));}
                }

            }
        });
        String[] arraySpinner = new String[] {
                "1", "2", "3", "4", "5" ,"6"
        };
        final Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        s.setAdapter(adapter);

        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            int k=0;
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s1 = parent.getItemAtPosition(position).toString();
                int n=Integer.parseInt(s1);
                LinearLayout x= (LinearLayout) findViewById(R.id.dynamiclayout);
                if(n>=k){
                    x.removeAllViews();
                    for(int j=k+1;j<=n;j++)
                    {

                        TextView t=new TextView(NumberOfDiffDrawers.this);
                        t.setText("Drawer #"+j);
                        t.setTextColor(Color.parseColor("#ffffff"));
                        t.setTypeface(Typeface.SERIF,Typeface.BOLD);
                        t.setTextSize(20);
                        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(200, 50);
                        // t.setLayoutParams(layoutParams);
                        x.addView(t);
                        LinearLayout L0=new LinearLayout(NumberOfDiffDrawers.this);
                        L0.setOrientation(LinearLayout.HORIZONTAL);
                        TextView length=new TextView(NumberOfDiffDrawers.this);
                        length.setText("Length: ");
                        //length.setTextColor(android.graphics.Color.rgb(255,105,180));
                        length.setTextColor(Color.parseColor("#1a237e"));
                        length.setTypeface(Typeface.SERIF,Typeface.BOLD);
                        length.setTextSize(18);
                        L0.addView(length);
                        final EditText length1=new EditText(NumberOfDiffDrawers.this);
                        length1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);
                        length1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,75));
                        L0.addView(length1);
                        x.addView(L0);
                        LinearLayout L1=new LinearLayout(NumberOfDiffDrawers.this);
                        L1.setOrientation(LinearLayout.HORIZONTAL);
                        TextView depth=new TextView(NumberOfDiffDrawers.this);
                        depth.setText("Depth: ");
                        depth.setTextColor(Color.parseColor("#1a237e"));
                        depth.setTypeface(Typeface.SERIF,Typeface.BOLD);
                        depth.setTextSize(18);
                        L1.addView(depth);
                        final EditText depth1=new EditText(NumberOfDiffDrawers.this);
                        depth1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                        depth1.setPadding(20, 20, 20, 20);

                        depth1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);
                        L1.addView(depth1);
                        x.addView(L1);
                        LinearLayout L2=new LinearLayout(NumberOfDiffDrawers.this);
                        L2.setOrientation(LinearLayout.HORIZONTAL);
                        TextView height=new TextView(NumberOfDiffDrawers.this);
                        height.setText("Height: ");
                        height.setTextColor(Color.parseColor("#1a237e"));
                        height.setTypeface(Typeface.SERIF,Typeface.BOLD);
                        height.setTextSize(18);
                        L2.addView(height);
                        final EditText height1=new EditText(NumberOfDiffDrawers.this);
                        height1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                        height1.setPadding(20, 20, 20, 20);
                        height1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);
                        L2.addView(height1);
                        x.addView(L2);

                    }
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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
