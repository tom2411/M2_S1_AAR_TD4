package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pays {
    @Id
    private String codePays;
    private String nomPays;


    public String getCodePays() {
        return codePays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
}
