package Dao;


import Entities.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void Insert(User user) {
        sessionFactory.getCurrentSession().save(user);
    }


    public void Delete(int Id) {
        sessionFactory.getCurrentSession().delete(new User(Id));
    }

    public void Update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    public User Select(int Id) {
        return (Entities.User) sessionFactory.getCurrentSession().get(User.class,Id);
    }

    public List<User> SelectAllUsers() {
        return  sessionFactory.getCurrentSession().createCriteria(User.class).list();
    }

}
