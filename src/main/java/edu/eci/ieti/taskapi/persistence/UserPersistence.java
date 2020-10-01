package edu.eci.ieti.taskapi.persistence;

import java.util.List;

import edu.eci.ieti.taskapi.model.User;

/**
 *
 * @author jmvillatei
 */

public interface UserPersistence {
    
    public List<User> getAll();

    public User getUserById(String idUser);

    public User getUserByEmail(String email);

    public void createUser(User user);

    public User updateUser(User user);

    public void removeUser(String idUser);
}
