package com.example.user.find_price;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView simplebox = (TextView) findViewById(R.id.simpleBox);
        simplebox.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view) {
                                             Intent i = new Intent(MainActivity.this,SimpleBox.class);
                                             startActivity(i);
                                         }
                                     }
        );
        TextView tissuebox = (TextView) findViewById(R.id.tissueBox);
        tissuebox.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view) {
                                             Intent i = new Intent(MainActivity.this,TissueBox.class);
                                             startActivity(i);
                                         }
                                     }
        );
        TextView drawer = (TextView) findViewById(R.id.drawer);
        drawer.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view) {
                                             Intent i = new Intent(MainActivity.this,ChestOfDrawer.class);
                                             startActivity(i);
                                         }
                                     }
        );
        TextView penholder = (TextView) findViewById(R.id.penHolder);
        penholder.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i = new Intent(MainActivity.this,PenHolder.class);
                                          startActivity(i);
                                      }
                                  }
        );
        TextView chowki = (TextView) findViewById(R.id.chowki);
        chowki.setOnClickListener(new View.OnClickListener()
                                     {
                                         @Override
                                         public void onClick(View view) {
                                             Intent i = new Intent(MainActivity.this,Chowki.class);
                                             startActivity(i);
                                         }
                                     }
        );
        TextView coaster = (TextView) findViewById(R.id.coaster);
        coaster.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i = new Intent(MainActivity.this,Coaster.class);
                                          startActivity(i);
                                      }
                                  }
        );
        TextView candleholder = (TextView) findViewById(R.id.candleHolder);
        candleholder.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View view) {
                                           Intent i = new Intent(MainActivity.this,CandleHolder.class);
                                           startActivity(i);
                                       }
                                   }
        );
        TextView hutbox = (TextView) findViewById(R.id.hutBox);
        hutbox.setOnClickListener(new View.OnClickListener()
                                        {
                                            @Override
                                            public void onClick(View view) {
                                                Intent i = new Intent(MainActivity.this,HutBox.class);
                                                startActivity(i);
                                            }
                                        }
        );
        TextView frame = (TextView) findViewById(R.id.frame);
        frame.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i = new Intent(MainActivity.this,Frame.class);
                                          startActivity(i);
                                      }
                                  }
        );
        TextView tray = (TextView) findViewById(R.id.tray);
        tray.setOnClickListener(new View.OnClickListener()
                                 {
                                     @Override
                                     public void onClick(View view) {
                                         Intent i = new Intent(MainActivity.this,Tray.class);
                                         startActivity(i);
                                     }
                                 }
        );
        TextView polygon = (TextView) findViewById(R.id.polygonBox);
        polygon.setOnClickListener(new View.OnClickListener()
                                {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i = new Intent(MainActivity.this,Polygon.class);
                                        startActivity(i);
                                    }
                                }
        );
    }
    /*public void xyz(View view)
    {
        Intent i = new Intent(MainActivity.this,SimpleBox.class);
        startActivity(i);
    }*/
}
