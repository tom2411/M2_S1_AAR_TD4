package entities;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Batiment {
    @Id @GeneratedValue
    private int idBatiment;
    private String nomBatiment;

    @ManyToOne
    @Nullable
    private UFR gerePar;

    @OneToMany
    @Nullable
    private List<Salle> salles;

    public Batiment() { }

    public Batiment(String nomBatiment) {
        this.nomBatiment= nomBatiment;
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public String getNomBatiment() {
        return nomBatiment;
    }

    public void setNomBatiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    public UFR getGerePar() {
        return gerePar;
    }

    public void setGerePar(UFR gerePar) {
        this.gerePar = gerePar;
    }
}
