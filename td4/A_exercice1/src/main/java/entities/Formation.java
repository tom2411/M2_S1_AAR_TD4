package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Formation {
    @Id
    private String idForm;
    private String intituleForm;

    @ManyToMany(mappedBy = "reserve")
    private List<Salle> reserveeA;

    public Formation() {}

    public Formation(String intituleForm) {
        this.intituleForm = intituleForm;
    }

    public String getIdForm() {
        return idForm;
    }

    public void setIdForm(String idForm) {
        this.idForm = idForm;
    }

    public String getIntituleForm() {
        return intituleForm;
    }

    public void setIntituleForm(String intituleForm) {
        this.intituleForm = intituleForm;
    }

    public Salle getReserveeA() {
        return reserveeA;
    }

    public void setReserveeA(Salle reserveeA) {
        this.reserveeA = reserveeA;
    }
}
