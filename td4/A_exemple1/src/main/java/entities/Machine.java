package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Machine {
    @Id @GeneratedValue
    private int idMachine;
    private String adresseMac;
    private String modele;
    @OneToOne(mappedBy = "machine")
    private Employe affecteeA;

    public int getIdMachine() {
        return idMachine;
    }

    public String getAdresseMac() {
        return adresseMac;
    }

    public void setAdresseMac(String adresseMac) {
        this.adresseMac = adresseMac;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Employe getAffecteeA() {
        return affecteeA;
    }

    public void setAffecteeA(Employe affecteeA) {
        this.affecteeA = affecteeA;
    }
}
