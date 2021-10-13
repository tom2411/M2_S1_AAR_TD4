package entities;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Salle {
    @Id
    private String numSalle;
    private int capacite;

    @ManyToMany
    private Set<Formation> reserveeA;

    @OneToMany(mappedBy = "dans")
    private List<Creneau> occupation;

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

    public Set<Formation> getReserveeA() {
        return reserveeA;
    }

    public void setReserveeA(Set<Formation> reserveeA) {
        this.reserveeA = reserveeA;
    }

    public List<Creneau> getOccupation() {
        return occupation;
    }

    public void setOccupation(List<Creneau> occupation) {
        this.occupation = occupation;
    }
}
