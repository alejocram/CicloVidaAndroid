package co.com.ideaslab.example;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	private Button mButton1;
	private TextView mText1;

	/**
	 * Es llamado cuando se crea el activity
	 */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = (Button)findViewById(R.id.button1);
        mText1 = (TextView)findViewById(R.id.textView1);
        mButton1.setOnClickListener(this);
        
        String evento = "onCreate() Activity 1";
        Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
        mText1.setText(evento);
    }
    
    public void onRestart(){
    	super.onRestart();
    	String evento = "onRestart() Activity 1";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText1.setText(mText1.getText()+"\n"+evento);
    }
    
    public void onPause(){
    	super.onPause();
    	String evento = "onPause() Activity 1";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText1.setText(mText1.getText()+"\n"+evento);
    }
    
    public void onResume(){
    	super.onResume();
    	String evento = "onResume() Activity 1";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText1.setText(mText1.getText()+"\n"+evento);
    }
    
    public void onStart(){
    	super.onStart();
    	String evento = "onStart() Actividad 1";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText1.setText(mText1.getText()+"\n"+evento);
    }
    
    @Override
    public void onClick(View v) {
    	//Verifica si se presiona el boton de la pantalla 1
    	if(v == mButton1){
    		String evento = "Vamos para la pantalla 2";
    		Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    		mText1.setText(mText1.getText()+"\n"+evento);
    		
        	Intent intent = new Intent(this,SegundoActivity.class);
        	this.startActivity(intent);
    	}
    }
}
