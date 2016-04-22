package org.dentist.dentist.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Dentist {
    private int idDentist;
    private String nameDentist;
    private String nicknameDentist;
    private String emailDentist;
    private int experienceDentist;
    private String adressDentist;
    private String phoneDentist;
    private String serviceDentist;
    private boolean permission;
    private List<Dentist> dentists = new ArrayList();

    public void setNameDentist(String nameDentist) {
        this.nameDentist = nameDentist;
    }

    public void setEmailDentist(String emailDentist) {
        this.emailDentist = emailDentist;
    }

    public void setExperienceDentist(int experienceDentist) {
        this.experienceDentist = experienceDentist;
    }

    public void setAdressDentist(String addressDentist) {
        this.adressDentist = addressDentist;
    }

    public void setPhoneDentist(String phoneDentist) {
        this.phoneDentist = phoneDentist;
    }

    public String getNicknameDentist() {
        return nicknameDentist;
    }

    public void setNicknameDentist(String nicknameDentist) {
        this.nicknameDentist = nicknameDentist;
    }

    public String getServiceDentist() {
        return serviceDentist;
    }

    public void setServiceDentist(String serviceDentist) {
        this.serviceDentist = serviceDentist;
    }

    public boolean isPermission() {
        return permission;
    }

    public List<Dentist> getDentists() {
        return dentists;
    }

    public int getIdDentist() {
        return idDentist;
    }

    public void setIdDentist(int idDentist) {
        this.idDentist = idDentist;
    }

    public String toString() {
        return getClass().getSimpleName() + "№" + this.idDentist +
                " : ( idUser = " + this.idDentist +
                " , nameDentist = " + this.nameDentist +
                " , nicknameDentist = " + this.nicknameDentist +
                " , emailDentist = " + this.emailDentist +
                " , experienceDentist = " + this.experienceDentist +
                " , addressDentist = " + this.adressDentist +
                " , phoneDentist = " + this.phoneDentist +
                " , ServiceDentist = " + this.serviceDentist + " ).";
    }
}
