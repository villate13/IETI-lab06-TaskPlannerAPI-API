package edu.eci.ieti.taskapi.services.user;

// import edu.eci.arsw.webstore.model.User;
// import edu.eci.arsw.webstore.persistence.UserPersistence;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.ieti.taskapi.model.User;
import edu.eci.ieti.taskapi.persistence.UserPersistence;

@Service
public class UserServicesStub implements UserServices {


    @Autowired
    UserPersistence uPersistence;

    @Override
    public List<User> getAll() {
        return uPersistence.getAll();
    }

    @Override
    public User getUserById(String idUser) {
        return uPersistence.getUserById(idUser);
    }

    @Override
    public User getUserByEmail(String email) {
        return uPersistence.getUserByEmail(email);
    }

    @Override
    public void createUser(User user) {
        uPersistence.createUser(user);
    }

    @Override
    public User updateUser(User user) {
        return uPersistence.updateUser(user);
    }

    @Override
    public void removeUser(String idUser) {
        uPersistence.removeUser(idUser);

    }

    
    
}
