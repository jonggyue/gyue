package kr.or.and1010;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Ex2_Spinner extends Activity {
	private Spinner sp;
	private TextView res;
	private String[] items = { "start1", "start2", "start3" };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_sp);
		sp = (Spinner) findViewById(R.id.ex2_spinner);
		res = (TextView) findViewById(R.id.ex2_res);
		
		final ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items);
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(aa);
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				
				if(aa.getItem(position).equals("start1"))
					res.setText("¡Ú");
				else if(aa.getItem(position).equals("start2"))
					res.setText("¡Ú¡Ú");
				else if(aa.getItem(position).equals("start3"))
					res.setText("¡Ú¡Ú¡Ú");
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});

	}
}
