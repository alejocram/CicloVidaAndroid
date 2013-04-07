package co.com.ideaslab.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SegundoActivity extends Activity implements OnClickListener{
	private Button mButton2; 
	private TextView mText2;

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        mButton2 = (Button)findViewById(R.id.button2);
        mText2 = (TextView)findViewById(R.id.textView2);
        mButton2.setOnClickListener(this);
        
        String evento = "onCreate() Activity 2";
        Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
        mText2.setText(evento);
    }
    
    public void onRestart(){
    	super.onRestart();
    	String evento = "onRestart() Activity 2";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText2.setText(mText2.getText()+"\n"+evento);
    }
    
    public void onPause(){
    	super.onPause();
    	String evento = "onPause() Activity 2";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText2.setText(mText2.getText()+"\n"+evento);
    }
    
    public void onResume(){
    	super.onResume();
    	String evento = "onResume() Activity 2";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText2.setText(mText2.getText()+"\n"+evento);
    }
    
    public void onStart(){
    	super.onStart();
    	String evento = "onStart() Activity 2";
    	Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    	mText2.setText(mText2.getText()+"\n"+evento);
    }
    
    @Override
    public void onClick(View v) {
    	//Verifica si se presiona el boton de la pantalla 1
    	if(v == mButton2){
    		String evento = "Vamos para la pantalla 1";
    		Toast.makeText(this, evento, Toast.LENGTH_SHORT).show();
    		mText2.setText(mText2.getText()+"\n"+evento);
        	Intent intent = new Intent(this,MainActivity.class);
        	this.startActivity(intent);
    	}
    }
}
