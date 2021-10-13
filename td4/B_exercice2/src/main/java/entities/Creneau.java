package entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Creneau {

    @Id @GeneratedValue
    private int creneau;
    @Basic
    private LocalDateTime debut;
    @Basic
    private LocalDateTime fin;

    @OneToOne
    private Groupe concerne;

    @ManyToOne
    private Salle dans;

    public Creneau() {
    }

    public int getCreneau() {
        return creneau;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }

    public LocalDateTime getDebut() {
        return debut;
    }

    public void setDebut(LocalDateTime debut) {
        this.debut = debut;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public Groupe getConcerne() {
        return concerne;
    }

    public void setConcerne(Groupe concerne) {
        this.concerne = concerne;
    }

    public Salle getDans() {
        return dans;
    }

    public void setDans(Salle dans) {
        this.dans = dans;
    }


}
