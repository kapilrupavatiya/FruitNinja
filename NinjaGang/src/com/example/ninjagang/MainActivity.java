package com.example.ninjagang;

import java.util.ArrayList;
import java.util.Random;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
public int play=1;
public int score=0;
ArrayList<Integer> i1 = new ArrayList<Integer>();
ArrayList<Integer> i2 = new ArrayList<Integer>();
@SuppressWarnings("unused")
private RelativeLayout rl;
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (RelativeLayout) findViewById(R.id.frame);

     //   final Button button;
		//final Button stop;
        final TextView tv;
        final ImageView iv,iv2,iv3,iv4,iv5,iv6,iv7;
     //   button = (Button) findViewById(R.id.button1);
        tv = (TextView) findViewById(R.id.abc);
        iv=(ImageView) findViewById(R.id.imageView1);
        iv2=(ImageView) findViewById(R.id.playbtn);
        iv3=(ImageView) findViewById(R.id.imageView3);
        iv4=(ImageView) findViewById(R.id.imageView4);
        iv5=(ImageView) findViewById(R.id.imageView5);
        iv6=(ImageView) findViewById(R.id.imageView6);
        iv7=(ImageView) findViewById(R.id.imageView7);
       // stop=(Button)findViewById(R.id.button2);
       // int width=rl.getWidth();
        //int height = rl.getHeight();
        Display display = getWindowManager().getDefaultDisplay(); 
        @SuppressWarnings("deprecation")
		int width = display.getWidth();
        @SuppressWarnings("deprecation")
		int height = display.getHeight();
       // Toast.makeText(getApplicationContext()," "+height+" "+width, Toast.LENGTH_LONG).show();
        if(height>80 && width >40)
       {
    	   height-=100;
    	   width-=70;
       }
       // Toast.makeText(getApplicationContext()," " + height+"  " + width, Toast.LENGTH_LONG).show();
        Random r = new Random();
       int i;
       for(i=0;i<7;i++)
       {
    
    	   
    	   i2.add((r.nextInt(height)+30));
    	   i1.add((r.nextInt(width)+30)); 
    	//   Toast.makeText(getApplicationContext(),"data  " + i1.get(i)+"  " +  i2.get(i), Toast.LENGTH_LONG).show();
       }
        
       iv.postDelayed(new Runnable() {
           public void run() {
        	   iv.setX(i1.get(0));
        	   iv.setY(i2.get(0));
               iv.setVisibility(View.VISIBLE);
           }
       }, 4000);
        
       iv.postDelayed(new Runnable() {
           public void run() {
               iv.setVisibility(View.INVISIBLE);
               Toast.makeText(getApplicationContext(),"1 " + score, Toast.LENGTH_LONG).show();
           }
       }, 5000);
       iv2.postDelayed(new Runnable() {
           public void run() {
        	   iv2.setX(i1.get(1));
        	   iv2.setY(i2.get(1));
               iv2.setVisibility(View.VISIBLE);
           }
       }, 5000);
       iv2.postDelayed(new Runnable() {
           public void run() {
        	   iv2.setVisibility(View.INVISIBLE);
        	   Toast.makeText(getApplicationContext(),"2 " + score, Toast.LENGTH_LONG).show();
           }
       }, 6000);
        
       iv3.postDelayed(new Runnable() {
           public void run() {
        	   iv3.setX(i1.get(2));
        	   iv3.setY(i2.get(2));
               iv3.setVisibility(View.VISIBLE);
           }
       }, 6000);
       iv3.postDelayed(new Runnable() {
           public void run() {
               iv3.setVisibility(View.INVISIBLE);
               Toast.makeText(getApplicationContext(),"3 " + score, Toast.LENGTH_LONG).show();
           }
       }, 7000);
       iv4.postDelayed(new Runnable() {
           public void run() {
        	   iv4.setX(i1.get(3));
        	   iv4.setY(i2.get(3));
               iv4.setVisibility(View.VISIBLE);
           }
       }, 7000);
       iv4.postDelayed(new Runnable() {
           public void run() {        	  
               iv4.setVisibility(View.INVISIBLE);
               Toast.makeText(getApplicationContext(),"4 " + score, Toast.LENGTH_LONG).show();
           }
       }, 8000);
       
       iv5.postDelayed(new Runnable() {
           public void run() {
        	   iv5.setX(i1.get(4));
        	   iv5.setY(i2.get(4));
               iv5.setVisibility(View.VISIBLE);
           }
       }, 8000);
       iv5.postDelayed(new Runnable() {
           public void run() {
        	   iv5.setVisibility(View.INVISIBLE);
        	   Toast.makeText(getApplicationContext(),"5 " + score, Toast.LENGTH_LONG).show();
           }
       }, 9000);
        
       iv6.postDelayed(new Runnable() {
           public void run() {
        	   iv6.setX(i1.get(5));
        	   iv6.setY(i2.get(5));
               iv6.setVisibility(View.VISIBLE);
           }
       }, 9000);
       iv6.postDelayed(new Runnable() {
           public void run() {
               iv6.setVisibility(View.INVISIBLE);
               Toast.makeText(getApplicationContext(),"6 " + score, Toast.LENGTH_LONG).show();
           }
       }, 10000);
       iv7.postDelayed(new Runnable() {
           public void run() {
        	   iv7.setX(i1.get(6));
        	   iv7.setY(i2.get(6));
               iv7.setVisibility(View.VISIBLE);
           }
       }, 10000);
       iv7.postDelayed(new Runnable() {
           public void run() {        	  
               iv7.setVisibility(View.INVISIBLE);
               Toast.makeText(getApplicationContext(),"7 "+score, Toast.LENGTH_LONG).show();  
               
           }
       },11000);
    
      /* stop.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 Toast.makeText(getApplicationContext(),"score  "+score, Toast.LENGTH_LONG).show();  
				    
				play=1;
				stop.setEnabled(false);
				button.setEnabled(true);
			}
		});
        button.setOnClickListener(new View.OnClickListener() {
			
        	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//tv.setText("Kapil Rupavatiya");
				iv.setVisibility(View.VISIBLE);
				stop.setEnabled(true);
				button.setEnabled(false);
				
				play=0;
				 Toast.makeText(getApplicationContext(),"score  "+score, Toast.LENGTH_LONG).show();  
				    
			
			}
		});
   
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("Kapil Rupavatiya");
				stop.setVisibility(View.VISIBLE);
			}
		});
        */
        iv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(play==0)
				{
					
				}
				else
				{
					score +=3;
						tv.setText(""+score);
					iv.setVisibility(View.INVISIBLE);
					
				}
			}
		});
        iv2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(play==0)
				{
					
				}
				else
				{
					score +=5;
					tv.setText(""+score);
					iv2.setVisibility(View.INVISIBLE);
					
				}
			}
		});
        iv3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(play==0)
				{
					
				}
				else
				{
					score +=6;
					tv.setText(""+score);
					iv3.setVisibility(View.INVISIBLE);
					
				}
			}
		});
      
        iv4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(play==0)
				{
					
				}
				else
				{
					score +=3;
					tv.setText(""+score);
					iv4.setVisibility(View.INVISIBLE);
					
				}
			}
		});
        iv5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(play==0)
				{
					
				}
				else
				{
					score +=5;
					tv.setText(""+score);
					iv5.setVisibility(View.INVISIBLE);
					
				}
			}
		});
        iv6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(play==0)
				{
					
				}
				else
				{
					score +=6;
					tv.setText(""+score);
					iv6.setVisibility(View.INVISIBLE);
					
				}
			}
		});
        iv7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(play==0)
				{
					
				}
				else
				{
					score +=6;
					tv.setText(""+score);
					iv7.setVisibility(View.INVISIBLE);
					
				}
			}
		});
       // Toast.makeText(getApplicationContext(),"score  "+score, Toast.LENGTH_LONG).show();  
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
