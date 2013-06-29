package com.gdg.miagegi.balafon;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.AudioManager;
import android.widget.ImageButton;

public class Balafon extends Activity implements OnTouchListener {



	private ImageButton buttonA;
	private ImageButton buttonB;
	private ImageButton buttonC;
	private ImageButton buttonD;
	private ImageButton buttonE;
	private ImageButton buttonF;
	private ImageButton buttonG;
	private ImageButton buttonH;
	private ImageButton buttonI;
	private ImageButton buttonJ;
	//MediaPlayer mp;
	SoundManager snd;
	int a,b,c,d,e,f,g,h,i,j;
	


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balafon);
        snd = new SoundManager(this);
        a=snd.load(R.raw.a);
        b=snd.load(R.raw.b);
        c=snd.load(R.raw.c);
        d=snd.load(R.raw.d);
        e=snd.load(R.raw.e);
        f=snd.load(R.raw.f);
        g=snd.load(R.raw.g);
        h=snd.load(R.raw.h);
        i=snd.load(R.raw.i);
        j=snd.load(R.raw.j);
        buttonA = (ImageButton) findViewById(R.id.buttonA);
        buttonB = (ImageButton) findViewById(R.id.buttonB);
        buttonC = (ImageButton) findViewById(R.id.buttonC);
        buttonD = (ImageButton) findViewById(R.id.buttonD);
        buttonE = (ImageButton) findViewById(R.id.buttonE);
        buttonF = (ImageButton) findViewById(R.id.buttonF);
        buttonG = (ImageButton) findViewById(R.id.buttonG);
        buttonH = (ImageButton) findViewById(R.id.buttonH);
        buttonI = (ImageButton) findViewById(R.id.buttonI);
        buttonJ = (ImageButton) findViewById(R.id.buttonJ);
       
           
        buttonA.setOnTouchListener(this);
        buttonB.setOnTouchListener(this);
        buttonC.setOnTouchListener(this);
        buttonD.setOnTouchListener(this);
        buttonE.setOnTouchListener(this);
        buttonF.setOnTouchListener(this);
        buttonG.setOnTouchListener(this);
        buttonH.setOnTouchListener(this);
        buttonI.setOnTouchListener(this);
        buttonJ.setOnTouchListener(this);
        
    }
   /* public void jouer( final int i)
    {
    	
    	mp = new MediaPlayer();
    			mp = MediaPlayer.create(Balafon.this,i);
    	
         mp.start();
         mp.setOnCompletionListener(this);
        	   

    	
    	     
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.balafon, menu);
        return true;
    }

	
	 @Override
     public boolean onTouch(View v, MotionEvent event) {
		
         if(event.getAction() == MotionEvent.ACTION_DOWN) {
             // Button was pressed, change button background
             v.setBackgroundResource(R.drawable.down);
             return true;
         } else if(event.getAction() == MotionEvent.ACTION_UP) {
             // Button was released, reset button background
        	 if (v == buttonA) {
 	 			snd.play(a);
 	 			//jouer(R.raw.a);
 	 		}
 	 		if (v == buttonB) {
 	 			snd.play(b);
 	 			//jouer(R.raw.b);
 	 		}
 	 		if (v == buttonC) {
 	 			snd.play(c);
 	 			//jouer(R.raw.c);
 	 		}//
 	 		if (v == buttonD) {
 	 			snd.play(d);
 	 			//jouer(R.raw.d);
 	 		}
 	 		if (v == buttonE) {
 	 			snd.play(e);
 	 			//jouer(R.raw.e);
 	 		}
 	 		if (v == buttonF) {
 	 			snd.play(f);
 	 			//jouer(R.raw.f);
 	 		}
 	 		if (v == buttonG) {
 	 			snd.play(g);
 	 			//jouer(R.raw.g);
 	 		}
 	 		if (v == buttonH) {
 	 			snd.play(h);
 	 			//jouer(R.raw.h);
 	 		}
 	 		if (v == buttonI) {
 	 			snd.play(i);
 	 			//jouer(R.raw.i);
 	 		}
 	 		if (v == buttonJ) {
 	 			snd.play(j);
 	 			//jouer(R.raw.j);
 	 		}
 		 
             v.setBackgroundResource(R.drawable.planche);
             return true;
         }else if(event.getAction() == MotionEvent.ACTION_MOVE) {
        	
        	      
         }
        

         return false;
     }

    
}
