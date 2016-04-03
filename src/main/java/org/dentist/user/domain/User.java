package org.dentist.user.domain;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int idUser;

    @Column(name = "name")
    private String fullNameUser;

    @Column(name = "nickname")
    private String nicknameUser;

    @Column(name = "email")
    private String emailUser;

    @Column(name = "phone")
    private String phoneUser;

    private boolean permission;

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setFullNameUser(String fullNameUser) {
        this.fullNameUser = fullNameUser;
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser = nicknameUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNicknameUser() {
        return nicknameUser;
    }

    public boolean isPermission() {
        return permission;
    }

    public String toString() {
        return getClass().getSimpleName() + " №" + this.idUser +
                " : ( idUser = " + this.idUser +
                " , fullNameUser = " + this.fullNameUser +
                " , nicknameUser = " + this.nicknameUser +
                " , emailUser = " + this.emailUser +
                " , phoneUser = " + this.phoneUser + " ).";
    }
}
