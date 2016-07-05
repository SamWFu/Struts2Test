package dao;

import dao.User.UserDao;

/**
 * @author 付施威
 * @version V1.0
 * @SystemName UTB-CLOUD
 * @ModuleName dao
 * @Date 16/5/29下午3:18
 * @Description 描述
 */
public class DaoFactory {

    private static UserDao userDao = new UserDao();

    public static UserDao getUserDao() {
        return userDao;
    }
}
