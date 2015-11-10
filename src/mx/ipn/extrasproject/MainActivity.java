package mx.ipn.extrasproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {
	EditText editText1;
	EditText editText2;
	EditText editText3;
	EditText editText4;
	EditText editText5;
	EditText editText7;
	EditText editText8;
	RadioButton radiobutton;
	RadioButton radiobutton2;
	Button button;
	Button button2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) this.findViewById(R.id.button1);
		button2 = (Button) this.findViewById(R.id.button2);
		button2.setOnClickListener(
				new OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						launchAnotherActivity();
					}
					
				}
				);
		button.setOnClickListener(
				new OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						clearEditText();
					}
					
				}
				);
	}

	protected void clearEditText() {
		// TODO Auto-generated method stub
		editText1 = (EditText) this.findViewById(R.id.editText1);
		editText2 = (EditText) this.findViewById(R.id.editText2);
		editText3 = (EditText) this.findViewById(R.id.editText3);
		editText4 = (EditText) this.findViewById(R.id.editText4);
		editText5 = (EditText) this.findViewById(R.id.editText5);
		editText7 = (EditText) this.findViewById(R.id.editText7);
		editText8 = (EditText) this.findViewById(R.id.editText8);
		radiobutton = (RadioButton) this.findViewById(R.id.radioButton1);
		radiobutton2 = (RadioButton) this.findViewById(R.id.radioButton2);
		editText1.setText("");
		editText2.setText("");
		editText3.setText("");
		editText4.setText("");
		editText5.setText("");
		editText7.setText("");
		editText8.setText("");
		radiobutton.setChecked(false);
		radiobutton2.setChecked(false);
	}

	protected void launchAnotherActivity() {
		// TODO Auto-generated method stub
		Intent intent;
		String sex;
		sex="";
		intent = new Intent(this, OtherActivity.class);
		editText1 = (EditText) this.findViewById(R.id.editText1);
		editText2 = (EditText) this.findViewById(R.id.editText2);
		editText3 = (EditText) this.findViewById(R.id.editText3);
		editText4 = (EditText) this.findViewById(R.id.editText4);
		editText5 = (EditText) this.findViewById(R.id.editText5);
		editText7 = (EditText) this.findViewById(R.id.editText7);
		editText8 = (EditText) this.findViewById(R.id.editText8);
		radiobutton = (RadioButton) this.findViewById(R.id.radioButton1);
		radiobutton2 = (RadioButton) this.findViewById(R.id.radioButton2);
		if(radiobutton.isChecked()){
			sex="Masculino";
		}
		else if(radiobutton2.isChecked()){
			sex="Femenino";
		}
		String strMessage = null;
		strMessage = " Nombre: " + editText1.getText().toString() + "\n A. Paterno: " + editText2.getText().toString() + 
				"\n A. Materno: " + editText3.getText().toString() + "\n Telefono: " + editText4.getText().toString() + 
				"\n Correo: " + editText5.getText().toString() + "\n Contraseña: " + editText7.getText().toString() + 
				"\n Contraseña: " + editText8.getText().toString() + "\n Sexo: " + sex;
		intent.putExtra("Parametros", strMessage);
		this.startActivity(intent);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
