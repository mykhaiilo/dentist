package org.dentist.dentist.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "dentist")
@Component
public class Dentist {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private int idDentist;

    @Column(name = "name")
    private String nameDentist;

    @Column(name = "nickname")
    private String nicknameDentist;

    @Column(name = "email")
    private String emailDentist;

    @Column(name = "experience")
    private int experienceDentist;

    @Column(name = "adress")
    private String adressDentist;

    @Column(name = "phone")
    private String phoneDentist;

    @Column(name = "service")
    private String serviceDentist;
    private boolean permission;

    public void setIdDentist(int idDentist) {
        this.idDentist = idDentist;
    }

    public void setNameDentist(String nameDentist) {
        this.nameDentist = nameDentist;
    }

    public void setNicknameDentist(String nicknameDentist) {
        this.nicknameDentist = nicknameDentist;
    }

    public void setEmailDentist(String emailDentist) {
        this.emailDentist = emailDentist;
    }

    public void setExperienceDentist(int experienceDentist) {
        this.experienceDentist = experienceDentist;
    }

    public void setAddressDentist(String addressDentist) {
        this.adressDentist = addressDentist;
    }

    public void setPhoneDentist(String phoneDentist) {
        this.phoneDentist = phoneDentist;
    }

    public void setServiceDentist(String serviceDentist) {
        this.serviceDentist = serviceDentist;
    }

    public String getNicknameDentist() {
        return nicknameDentist;
    }

    public String getServiceDentist() {
        return serviceDentist;
    }

    public boolean isPermission() {
        return permission;
    }

    public String toString() {
        return getClass().getSimpleName() + "№" + this.idDentist +
                " : ( idUser = " + this.idDentist +
                " , nameDentist = " + this.nameDentist +
                " , nicknameDentist = " + this.nicknameDentist +
                " , emailDentist = " + this.emailDentist +
                " , experienceDentist = " + this.experienceDentist +
                " , addressDentist = " + this.adressDentist +
                " , phoneDentist = " + this.phoneDentist+
                " , ServiceDentist = " + this.serviceDentist +" ).";
    }
}
