package kr.or.andd1013;

import java.util.Random;

import android.R.color;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Ex4_Dialog extends Activity{
	private ImageButton btn1;
	private AlertDialog.Builder builder;
	private LinearLayout ll;
	private int num;
	private int[] col = {Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.CYAN};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ex4_dialog);
		btn1 = (ImageButton) findViewById(R.id.ex4_imgBtn);
		// ���̾�α״� �����ڰ� protected�� �Ǿ� �ֱ� ������ �ݵ��
		// Builder �� �����ؾ� �Ѵ�.
		builder = new AlertDialog.Builder(this);
		ll = (LinearLayout) findViewById(R.id.LinearLayout);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//���̾�α� ����
				builder.setTitle("My Dialog ^^");
				builder.setMessage("Hello ~^^");
				builder.setIcon(R.drawable.camera3);
				//�׳� �ݱ�-null, �̺�Ʈ �ݹ�
				builder.setPositiveButton("close",
						new DialogInterface.OnClickListener() {
							
					
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								num = (int)(Math.random()*5);
								ll.setBackgroundColor(col[num]);
								Log.d("Exameple", "ok");
							}
						});
				builder.setNegativeButton("No",
						new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Log.d("Exameple", "ok2");
							}
						});
						builder.show();
			}
		});
	}
}
