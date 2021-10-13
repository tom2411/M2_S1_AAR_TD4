package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etudiant {
    @Id
    @Column(name = "NUMETU")
    private String numEtu;
    @Column(name = "PRENOMETU")
    private String prenom;
    @Column(name = "NOMETU")
    private String nom;

    @ManyToMany
    @JoinTable(name = "INSCRIT", joinColumns = {@JoinColumn(name = "NUMETU")}, inverseJoinColumns = {@JoinColumn(name = "IDFORM")} )
    private List<Formation> inscritEn;

    @ManyToMany
    @JoinTable(name = "MEMBRES", joinColumns = {@JoinColumn(name = "NUMETU")}, inverseJoinColumns = {@JoinColumn(name = "IDGROUPE")} )
    private List<Groupe> appartient;

    public Etudiant() {
    }

    public List<Groupe> getAppartient() {
        return appartient;
    }

    public void setAppartient(List<Groupe> appartient) {
        this.appartient = appartient;
    }

    public String getNumEtu() {
        return numEtu;
    }

    public void setNumEtu(String numEtu) {
        this.numEtu = numEtu;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Formation> getInscritEn() {
        return inscritEn;
    }

    public void setInscritEn(List<Formation> inscritEn) {
        this.inscritEn = inscritEn;
    }


}
