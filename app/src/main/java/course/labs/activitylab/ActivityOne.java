package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

		// lifecycle counts
		//TODO: Create 7 counter variables, each corresponding to a different one of the lifecycle callback methods.
		//TODO:  increment the variables' values when their corresponding lifecycle methods get called.

		private int createC = 0;
		private int startC = 0;
		private int resumeC = 0;
		private int pauseC = 0;
		private int stopC = 0;
		private int destroyC =0;
		private int restartC = 0;
		TextView create, start, resume, pause, stop, destroy, restart;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);

			this.createC++;

			setContentView(R.layout.activity_one);
			this.create = (TextView) findViewById(R.id.createL);
			create.setText(createC + "");
			this.start = (TextView) findViewById(R.id.startL);
			start.setText(startC + "");
			this.resume = (TextView) findViewById(R.id.resumeL);
			resume.setText(resumeC + "");
			this.pause = (TextView) findViewById(R.id.pauseL);
			pause.setText(pauseC + "");
			this.stop = (TextView) findViewById(R.id.stopL);
			stop.setText(stopC + "");
			this.destroy = (TextView) findViewById(R.id.destroyL);
			destroy.setText(destroyC + "");
			this.restart = (TextView) findViewById(R.id.restartL);
			restart.setText(restartC + "");
			//Log cat print out
			Log.i(TAG, "onCreate called " + this.createC);
			
			//TODO: update the appropriate count variable & update the view
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}
		
		// lifecycle callback overrides
		
		@Override
		public void onStart(){
			super.onStart();
			this.startC++;
			//Log cat print out
			Log.i(TAG, "onStart called " + this.startC);
			this.start.setText(this.startC+"");
			//TODO:  update the appropriate count variable & update the view
		}

		@Override
		public void onResume(){
			super.onResume();
			this.resumeC++;
			//Log cat print out
			Log.i(TAG, "onResume called " + this.resumeC);
			this.resume.setText(this.resumeC+"");
		}
	@Override
	public void onPause(){
		super.onPause();
		this.resumeC++;
		//Log cat print out
		Log.i(TAG, "onPause called " + this.pauseC);
		this.pause.setText(this.pauseC+"");
	}

    @Override
    public void onStop(){
        super.onStop();
        this.stopC++;
        //Log cat print out
        Log.i(TAG, "onStop called " + this.stopC);
        this.stop.setText(this.stopC+"");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        this.destroyC++;
        //Log cat print out
        Log.i(TAG, "onDestroy called " + this.destroyC);
        this.stop.setText(this.destroyC+"");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        this.restartC++;
        //Log cat print out
        Log.i(TAG, "onRestart called " + this.restartC);
        this.stop.setText(this.restartC+"");
    }



	    // TODO: implement 5 missing lifecycle callback methods

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables
		}


		public void launchActivityTwo(View view) {
			startActivity(new Intent(this, ActivityTwo.class));
		}
		

}
