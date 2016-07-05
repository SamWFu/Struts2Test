package dao.User;

import dao.DaoFactory;
import model.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 付施威
 * @version V1.0
 * @SystemName UTB-CLOUD
 * @ModuleName dao.User
 * @Date 16/5/30下午2:22
 * @Description 描述
 */
public class UserDaoTest {

    @Test
    public void update() throws Exception {

        User user = new User();
        user.setId(1);
        user.setName("付施威");
        int i =  DaoFactory.getUserDao().Update(user);
        System.out.println(1);

    }
}