package edu.eci.ieti.taskapi.services.user;


import edu.eci.ieti.taskapi.model.User;
import java.util.List;


public interface UserServices {
    
    List<User> getAll();

    User getUserById(String idUser);

    User getUserByEmail(String email);

    void createUser(User user);

    User updateUser(User user);

    void removeUser(String idUser);

}
