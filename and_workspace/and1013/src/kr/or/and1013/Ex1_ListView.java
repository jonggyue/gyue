package kr.or.and1013;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Ex1_ListView extends Activity {
	private ListView listv;
	private TextView text;
	// ��Ʈ��ũ�� HTTP����� ���� ������ �����ͷ� ����� �ڸ�.
	private String[] cars = { "SM3", "SM5", "SM7", "SONATA", "AVANTE", "SOUL","OPTIMA","PRIDE","GOLF" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex1_listview);
		listv = (ListView) findViewById(R.id.ex1_list);
		text = (TextView) findViewById(R.id.ex1_text);
		ListAdapter adapter = 
				new ArrayAdapter<String>(
						this, android.R.layout.simple_list_item_1, cars);
		listv.setAdapter(adapter);
		listv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				//textview�� ������ �������� ���� ����Ͻÿ�
				text.setText(cars[position]);
			}
			
		});
		
	}
}
