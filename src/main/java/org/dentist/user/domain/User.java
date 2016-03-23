package org.dentist.user.domain;

public class User {
    private int id;
    private String name;
    private String nickname;
    private String email;
    private String phone;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return getClass().getSimpleName() + " №" + this.id +
                " : ( id = " + this.id +
                " , name = " + this.name +
                " , nickname = " + this.nickname +
                " , email = " + this.email +
                " , phone = " + this.phone + " ).";
    }
}
