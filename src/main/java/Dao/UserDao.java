package Dao;

import Entities.User;

import java.util.ArrayList;
import java.util.List;


public interface UserDao {

    public void Insert(User user);
    public void Delete(int Id);
    public void Update(User user);
    public User Select(int Id);
    public List<User> SelectAllUsers();

}
