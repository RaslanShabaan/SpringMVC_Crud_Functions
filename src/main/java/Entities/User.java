package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {


    @Id
    private int Id;
    private String UserName;
    private String UserPass;

    public User() {
    }

    public User(int Id) {

        this.Id = Id;
    }

    public User(int Id,String UserName,String UserPass) {
        this.Id=Id;
        this.UserName=UserName;
        this.UserPass=UserPass;
    }


    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPass() {
        return UserPass;
    }
    public void setUserPass(String userPass) {
        UserPass = userPass;
    }


}
