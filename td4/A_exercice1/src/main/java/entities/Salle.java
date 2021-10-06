package entities;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Salle {
    @Id
    private String numSalle;
    private int capacite;

    @ManyToMany
    private List<Formation> reserve;

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

    public List<Formation> getReserve() {
        return reserve;
    }

    public void setReserve(List<Formation> reserve) {
        this.reserve = reserve;
    }
}
