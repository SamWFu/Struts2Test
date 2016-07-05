package dao.User;

import dao.BaseDao;
import dao.SqlSessionProducer;
import model.User;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 付施威
 * @version V1.0
 * @SystemName UTB-CLOUD
 * @ModuleName dao
 * @Date 16/5/29上午10:03
 * @Description 描述
 */
public class UserDao extends BaseDao {

	public User getUser(int id) {

		SqlSession sqlSession = SqlSessionProducer.getInstance().getSqlMapSession();

		try {
			User user = (User) sqlSession.selectOne("mapper.UserMapper.getUser", 1);
			return user;
		} finally {

			sqlSession.close();
		}

	}

	public int Update(User user) {

		SqlSession sqlSession = SqlSessionProducer.getInstance().getSqlMapSession();
		try {
			int i =  sqlSession.update("mapper.UserMapper.update", user);
			return i;
		} finally {

			sqlSession.close();
		}

	}
}
