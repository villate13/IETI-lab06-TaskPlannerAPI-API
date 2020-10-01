package edu.eci.ieti.taskapi.persistence.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import edu.eci.ieti.taskapi.model.User;
import edu.eci.ieti.taskapi.persistence.UserPersistence;

/**
 *
 * @author jmvillatei
 */

@Service
public class InMemoryUserPersistence implements UserPersistence {

    // GENERAR IDS https://observablehq.com/@hugodf/mongodb-objectid-generator

    // BASE DE DATOS VOLATIL
    ArrayList<User> users = new ArrayList<>(
            Arrays.asList(new User("Villate", "villa@mail.com", "5f7637e525ec41f714e5d407"),
                    new User("eci", "eci@mail.co", "5f7639e097c9a4d42fbf2358")));

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getUserById(String idUser) {
        try {
            for (User us : users) {
                if (us.getIdUser().equals(idUser)) {
                    return us;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(InMemoryUserPersistence.class.getName()).log(Level.SEVERE, null, ex);
            return new User("ERROR", "ERROR", "ERROR");
        }
        return new User("ERROR", "ERROR", "ERROR");
    }

    @Override
    public User getUserByEmail(String email) {
        try {
            for (User us : users) {
                if (us.getIdUser().equals(email)) {
                    return us;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(InMemoryUserPersistence.class.getName()).log(Level.SEVERE, null, ex);
            return new User("ERROR", "ERROR", "ERROR");
        }
        return new User("ERROR", "ERROR", "ERROR");
    }

    @Override
    public void createUser(User user) {
        try {
            users.add(user);
        } catch (Exception ex) {
            Logger.getLogger(InMemoryUserPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public User updateUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeUser(String idUser) {
        // TODO Auto-generated method stub

    }

}
