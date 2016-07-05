package dao;

import org.junit.Test;

import dao.User.UserDao;
import model.User;

/**
 * @author 付施威
 * @version V1.0
 * @SystemName UTB-CLOUD
 * @ModuleName dao
 * @Date 16/5/29上午11:03
 * @Description 描述
 */
public class UserDaoTest {
    @Test
    public void getUser() throws Exception {

        UserDao dao = new UserDao();

        User user = dao.getUser(1);

        System.out.println(user.getName());
    }

}