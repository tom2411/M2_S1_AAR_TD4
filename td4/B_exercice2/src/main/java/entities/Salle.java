package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Salle {
    @Id
    private String numSalle;
    private int capacite;

    @ManyToMany
    private List<Formation> reserveeA;

    public List<Creneau> getOccupation() {
        return occupation;
    }

    public void setOccupation(List<Creneau> occupation) {
        this.occupation = occupation;
    }

    @OneToMany(mappedBy = "dans")
    private List<Creneau> occupation;

    public Salle() {
    }

    public Salle(int capacite) {
        this.capacite = capacite;
    }

    public String getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(String numSalle) {
        this.numSalle = numSalle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

}
