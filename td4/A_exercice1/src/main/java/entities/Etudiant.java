package entities;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Etudiant {
    @Id
    private String numEtu;
    private String prenom;
    private String nom;

    @ManyToMany
    private List<Formation> inscritEn;

    @ManyToMany
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
