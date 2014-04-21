package com.example.ninjagang;

import java.security.PublicKey;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ProgressBar;

public class GamePage extends Activity {
	
	private int mProgressStatus = 0;
    private Handler mHandler = new Handler();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);
      
        
        
         Thread timer = new Thread(){
        	public void run(){
        		
        	try
        	{
        		sleep(5000);
        	}
        	catch (InterruptedException e)
        	{
        		e.printStackTrace();
        	}
        	finally
        	{
        		Intent openMenu = new Intent("com.thread.menupage");
        		startActivity(openMenu);
        	}
        }
        };
        timer.start();
        
    
    
/*
        Thread td=new Thread()
        {
            public void run(){
                try{
                    sleep(5000);
                } catch(InterruptedException e) {
                        e.printStackTrace();
                } finally {

                	Intent openMenu = new Intent("com.thread.menupage");
            		startActivity(openMenu);
                }

            }

        };
        td.start();

        final ProgressBar br= (ProgressBar) findViewById(R.id.progressBar1);
        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                while (mProgressStatus < 100) {
                    mProgressStatus = doWork();

                    // Update the progress bar
                    mHandler.post(new Runnable() {
                        public void run() {
                            br.setProgress(mProgressStatus);
                        }
                    });
                }
            }

            private int doWork() {
                // TODO Auto-generated method stub
                return 0;
            }
        }).start();*/

    }
    
    
    
   


    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game_page, menu);
        return true;
    }
    
}
