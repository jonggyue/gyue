package kr.or.and1013;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class Ex2_ListView extends Activity{
	private ListView listv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex2_listview);
		listv = (ListView) findViewById(R.id.ex2_list);
		// �� ������
		ArrayList<HashMap<String, String>> myList =
				new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map;
		map = new HashMap<String, String>();
		map.put("MemberID", "Aman");
		map.put("Name", "KimGilDong");
		map.put("Tel", "010-121-1215");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "Kapa");
		map.put("Name", "ParkYounji");
		map.put("Tel", "010-1215-1515");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "jonggyue");
		map.put("Name", "KimJonggyue");
		map.put("Tel", "010-6686-9122");
		myList.add(map);
		map = new HashMap<String, String>();
		map.put("MemberID", "kosta");
		map.put("Name", "Kimkosta");
		map.put("Tel", "010-2323-2323");
		myList.add(map);
		//---------------------------
		SimpleAdapter sAdapter = null;
		// SimpleAdapter : xml�� �����͸� ���� ��ġ ������ �� �ִ�.
		// SimpleAdapter(context, data, ��ġ�� ���̾ƿ� resource,
		// 	date���� �о�� Ű���� �迭�� ����,
		// ��ġ�� ���̾ƿ� ���ҽ����� �÷����� id�� ����);
		
		sAdapter = new SimpleAdapter
				(this, myList, R.layout.ex2_column,
						new String[]{"MemberID","Name","Tel"},
							new int[]{R.id.ex2_memId, R.id.ex2_memName, R.id.ex2_memTel} );
		// listview�� ����
		listv.setAdapter(sAdapter);
		listv.setOnItemClickListener(new OnItemClickListener() {
		

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				HashMap<String, String> map = myList.get(position);
				//Map���� Ket�� �޾Ƴ���
				String idv = map.get("MemberID");
				String namev = map.get("Name");
				String telv = map.get("Tel");
				StringBuffer s = new StringBuffer();
				s.append(idv).append("/").append(namev).append("/");
				s.append(telv);
				
				Toast.makeText(Ex2_ListView.this, s.toString(), 3000).show();
				
				Intent intent = new Intent
			}
		});
		
		
	}
}
