package entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Groupe {
    @Id @GeneratedValue
    private int idGroupe;
    private String intitule;

    @ManyToMany(mappedBy = "appartient")
    private Set<Etudiant> membres;

    @ManyToMany
    private Set<Formation> etudiantsDe;

    @OneToMany(mappedBy = "concerne")
    private List<Creneau> creneaux;

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Set<Etudiant> getMembres() {
        return membres;
    }

    public void setMembres(Set<Etudiant> membres) {
        this.membres = membres;
    }

    public Set<Formation> getEtudiantsDe() {
        return etudiantsDe;
    }

    public void setEtudiantsDe(Set<Formation> etudiantsDe) {
        this.etudiantsDe = etudiantsDe;
    }

    public List<Creneau> getCreneaux() {
        return creneaux;
    }

    public void setCreneaux(List<Creneau> creneaux) {
        this.creneaux = creneaux;
    }
}
