package org.dentist.user.domain;

public class User {
    private int idUser;
    private String fullNameUser;
    private String nicknameUser;
    private String emailUser;
    private String phoneUser;
    private boolean permission;

    public void setFullNameUser(String fullNameUser) {
        this.fullNameUser = fullNameUser;
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

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNicknameUser() {
        return nicknameUser;
    }

    public void setNicknameUser(String nicknameUser) {
        this.nicknameUser = nicknameUser;
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
