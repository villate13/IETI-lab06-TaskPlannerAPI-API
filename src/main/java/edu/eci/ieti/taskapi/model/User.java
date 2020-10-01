package edu.eci.ieti.taskapi.model;

import org.springframework.data.annotation.Id;

/**
 *
 * @author jmvillatei
 */

public class User {

    @Id
    public String idUser;

    private String nameUser;
    private String emailUser;

    public User(String idUser, String nameUser, String emailUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    
}
