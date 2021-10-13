package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Formation {
    @Id
    private String idForm;
    private String intituleForm;

    @ManyToMany(mappedBy = "reserveeA")
    private Set<Salle> reserve;

    @ManyToMany(mappedBy = "inscritEn")
    private Set<Etudiant> inscrits;

    @ManyToMany(mappedBy = "etudiantsDe")
    private Set<Groupe> groupes;

    public String getIdForm() {
        return idForm;
    }

    public String getIntituleForm() {
        return intituleForm;
    }

    public void setIntituleForm(String intituleForm) {
        this.intituleForm = intituleForm;
    }

    public Set<Salle> getReserve() {
        return reserve;
    }

    public void setReserve(Set<Salle> reserve) {
        this.reserve = reserve;
    }

    public Set<Etudiant> getInscrits() {
        return inscrits;
    }

    public void setInscrits(Set<Etudiant> inscrits) {
        this.inscrits = inscrits;
    }

    public Set<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(Set<Groupe> groupes) {
        this.groupes = groupes;
    }
}
