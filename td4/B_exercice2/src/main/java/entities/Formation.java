package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Formation {
    @Id
    @Column(name = "IDFORM")
    private String idForm;
    @Column(name = "INTITULEFORM")
    private String intituleForm;

    @ManyToMany(mappedBy = "reserveeA")
    private List<Salle> reserve;

    @ManyToMany(mappedBy = "inscritEn")
    private List<Etudiant> inscrits;

    @ManyToMany(mappedBy = "etudiantsDe")
    private List<Groupe> groupes;

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

    public List<Etudiant> getInscrits() {
        return inscrits;
    }

    public void setInscrits(List<Etudiant> inscrits) {
        this.inscrits = inscrits;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }
}
