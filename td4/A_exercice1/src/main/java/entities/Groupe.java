package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Groupe {
    @Id
    @GeneratedValue
    private int idGroupe;
    private String intitule;

    @ManyToMany(mappedBy = "appartient")
    private List<Etudiant> membres;

    @ManyToMany
    private List<Formation> etudiantsDe;

    @OneToMany
    private List<Creneau> creneaux;

    public Groupe() {
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public List<Etudiant> getMembres() {
        return membres;
    }

    public void setMembres(List<Etudiant> membres) {
        this.membres = membres;
    }

    public List<Formation> getEtudiantsDe() {
        return etudiantsDe;
    }

    public void setEtudiantsDe(List<Formation> etudiantsDe) {
        this.etudiantsDe = etudiantsDe;
    }

    public List<Creneau> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(List<Creneau> creneaux) {
        this.creneaux = creneaux;
    }
}
