package kr.or.kosta.and1020_sqlite;

import java.util.List;
import kr.or.kosta.and1020_sqllite.R;
import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

// ��ġ������(Location Provider)
// ��ġ �Ŵ���(Location Manager)�� �����ؼ� ��ġ���񽺸� ���� �� �ִ�.
// ACCESS_FINE_LOCATION : �ۿ��� GPS������ ����� ����� �� �ֵ��� ���ִ� ����
// READ_PHONE_STATE : ��ȭ���� ���¸� �� �� �ְ� ���ִ� ����
// ACCESS_COARSE_LOCATION : Call_ID/��������
public class Ex1_Location extends Activity {
	private TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex1_gps);
		text = (TextView) findViewById(R.id.ex1_text);
		// GPS�� ����ؼ� ��ġ ������ �ޱ� ���ؼ� �� �ʿ��� ��ü
		LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		// �ȵ���̵�� ������ �������� ������� �ʴ´�.
		List<String> proviArrayList = manager.getAllProviders();
		StringBuffer sb = new StringBuffer();
		int sizev = proviArrayList.size();
		for(int i=0; i<sizev; i++){
			sb.append("LocationManager:").append(":");
			sb.append(proviArrayList.get(i)).append(", Status :");
			sb.append(manager.isProviderEnabled(proviArrayList.get(i)));
			sb.append("\n");
			
		}
		text.setText(sb.toString());
		
	}
}
