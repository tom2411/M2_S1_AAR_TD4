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
    private UFR gerePar;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Salle> salles;
}
