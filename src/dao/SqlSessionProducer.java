package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author 付施威
 * @version V1.0
 * @SystemName UTB-CLOUD
 * @ModuleName dao
 * @Date 16/5/29上午10:25
 * @Description 描述
 */
public class SqlSessionProducer {

	private SqlSession sqlSession = null;
	private static SqlSessionProducer instance = null;
	private static SqlSessionFactory sqlSessionFactory = null;

	private SqlSessionProducer() {
		String resource = "config.xml";

		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static SqlSessionProducer getInstance() {

		if (instance == null) {
			synchronized (SqlSessionProducer.class) {
				instance = new SqlSessionProducer();
			}
		}
		return instance;
	}


	public  SqlSession getSqlMapSession() {

		 sqlSession = sqlSessionFactory.openSession(true);

		return sqlSession;
	}
}
