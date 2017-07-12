package Service;

import Dao.UserDao;
import Entities.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserDaoServiceImp implements UserDaoService{

    UserDao userDao;


    public Dao.UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(Dao.UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void Insert(User user) {
        userDao.Insert(user);
    }

    @Transactional
    public void Delete(int Id) {
        userDao.Delete(Id);
    }

    @Transactional
    public void Update(User user) {
        userDao.Update(user);
    }

    @Transactional
    public User Select(int Id) {
        return   userDao.Select(Id);
    }

    @Transactional
    public List<User> SelectAllUsers() {
     List<User> list= userDao.SelectAllUsers();
        return   list;
    }
}
