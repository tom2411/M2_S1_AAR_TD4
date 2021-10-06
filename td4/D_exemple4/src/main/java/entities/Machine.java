package entities;

import javax.persistence.*;

@NamedQuery(name = "entities.Machine.paysDeMachine",query = "Select m.affecteeA.adresse.pays From Machine m where m.idMachine=:idm")

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
