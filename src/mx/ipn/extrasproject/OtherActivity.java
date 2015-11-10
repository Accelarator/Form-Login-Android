package mx.ipn.extrasproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {
	TextView textView;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.other_activity);
		
		Intent intent;
		intent = this.getIntent();
		
		String strReturnMessage;
		strReturnMessage = intent.getExtras().getString("Parametros");
		
		textView = (TextView) this.findViewById(R.id.id_textview);
		textView.setText(strReturnMessage);
		
	
}
}
