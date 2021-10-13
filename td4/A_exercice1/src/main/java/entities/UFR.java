package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class UFR {
    @Id @GeneratedValue
    private int idUFR;
    private String sigleUFR;

    @OneToMany(mappedBy = "gerePar")
    private List<Batiment> batiments;

    public int getIdUFR() {
        return idUFR;
    }

    public void setIdUFR(int idUFR) {
        this.idUFR = idUFR;
    }

    public void setSigleUFR(String sigleUFR) {
        this.sigleUFR = sigleUFR;
    }

    public List<Batiment> getBatiments() {
        return batiments;
    }

    public void setBatiments(List<Batiment> batiments) {
        this.batiments = batiments;
    }
}
