package service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService1 {
	// sqlMapConifg.xml의 환경설정을 접근해서 사용자(SqlClient)들에게
	// 사용메서드를 제공해주고 쿼리에게 전달될 값을 매핑객체를 통해서 매핑 시켜주는 등 
	// 일괄적인 작업을 수행 할 수 있도록
	// SqlSession객체를 관리하는 SqlSessionFactory객체를 싱글톤으로 생성 해둔다.
	private static SqlSessionFactory factory1;
	
	static{
		//config/sqlMapConfig.xml의 파일을 읽어 온다.
		Reader reader = null; 
			try {
				reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");
				// factory생성
				factory1 = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}	finally{
				try {
					if(reader != null){
						reader.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}

	public static SqlSessionFactory getFactory() {
		return factory1;
	}
	
}
