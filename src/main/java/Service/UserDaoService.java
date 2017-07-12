package Service;

import Entities.User;

import java.util.List;

/**
 * Created by RESO on 7/12/2017.
 */
public interface UserDaoService {
    public void Insert(User user);
    public void Delete(int Id);
    public void Update(User user);
    public User Select(int Id);
    public List<User> SelectAllUsers();

}
