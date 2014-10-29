package kr.or.and1010;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Ex3_AutoComplete extends Activity {
	private static final String[] DATA = { "Java", "JavaBook", "Android", "AD",
			"AK", "BB", "CC" };
	private AutoCompleteTextView act;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex3_auto);
		act = (AutoCompleteTextView) findViewById(R.id.ex_3autoComplete);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, DATA);
		act.setAdapter(adapter);
	}
}
