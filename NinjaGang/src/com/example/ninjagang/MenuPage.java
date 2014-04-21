package com.example.ninjagang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuPage extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_page_layout);
		final ImageView play;
		play=(ImageView) findViewById(R.id.playbtn);
		
		
		
		 play.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					Intent openMenu = new Intent("com.thread.startgamelevel1");
	        		startActivity(openMenu);
	        		
				}
			});
		 
		 
		
	}
	
	
	
	

}
