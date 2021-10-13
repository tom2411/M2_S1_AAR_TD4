package entities;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    private String numEtu;
    private String prenom;
    private String nom;

    @ManyToMany
    private Set<Formation> inscritEn;

    @ManyToMany
    private Set<Groupe> appartient;

    public String getNumEtu() {
        return numEtu;
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

    public Set<Formation> getInscritEn() {
        return inscritEn;
    }

    public void setInscritEn(Set<Formation> inscritEn) {
        this.inscritEn = inscritEn;
    }

    public Set<Groupe> getAppartient() {
        return appartient;
    }

    public void setAppartient(Set<Groupe> appartient) {
        this.appartient = appartient;
    }
}
