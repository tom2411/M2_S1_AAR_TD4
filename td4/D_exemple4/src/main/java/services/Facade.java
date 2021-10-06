package services;

import dtos.EmployeDTO;
import entities.Employe;
import entities.Machine;
import entities.Pays;
import entities.Telephone;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void createEmploye(String prenom, String nom) {
        Employe emp=new Employe(prenom,nom);
        em.persist(emp);
    }

    public Collection<Employe> findAllEmploye() {
        return em.createQuery("From Employe e").getResultList();
    }

    public Machine findMachineById(int idMachine) {
        return em.find(Machine.class,idMachine);
    }

    public Employe findEmployeById(int idEmp) {
        return em.find(Employe.class,idEmp);
    }

    /**
     * Pays du propriétaire d'une machine donnée
     * @param idMachine
     * @return
     */
    public Pays PaysDuProprietaireDe(int idMachine) {
        // on suit ici des relations de type XtoOne : pas de join, juste l'enchainement des attributs...
        Query q=em.createNamedQuery("entities.Machine.paysDeMachine");
        q.setParameter("idm",idMachine);
        return (Pays) q.getSingleResult();
    }

    /**
     * Employés travaillant sur des projets où travaille également l'employé dont l'id est en paramètre
     * @param idEmp
     * @return
     */
    public Collection<Employe> travailleAvec(int idEmp) {
        // A noter la syntaxe du join. Contrairement à l'exemple précédent on ne peut pas se contenter de suivre les relations car elles sont de type XToMany
        Query q=em.createNamedQuery("entities.Employe.projetAvec");
        q.setParameter("id",idEmp);
        return q.getResultList();
    }

    /**
     * Telephones non affectes
     * @return
     */
    public Collection<Telephone> nonAffectes() {
        // le join permet de filtrer les telephones en lien avec un employe...
        // on en profite pour faire une requête imbriquée
        Query q=em.createNamedQuery("entities.Telephone.nonAffectes");
        return q.getResultList();
    }

    /**
     * récupération d'un simple champ
     */
    public String nomDuProjet(String codeProjet) {
        Query q=em.createNamedQuery("entities.Projet.nomProjet");
        q.setParameter("cp",codeProjet);
        return (String) q.getSingleResult();
    }


    /** Une requête native... */
    public List<Employe> sansProjetNatif() {
        Query nq=em.createNamedQuery("entities.Employe.sansProjetNative");
        return nq.getResultList();
    }

    /**
     * Utilisation de DTO
     * @return
     */
    public List<EmployeDTO> sansProjetDto() {
        Query q=em.createNamedQuery("entities.Employe.sansProjet");
        List<Employe>le= q.getResultList();
        return le.stream().map(e->new EmployeDTO(e.getNom(),e.getPrenom())).collect(Collectors.toCollection(ArrayList::new));
/*
        Query q=em.createNamedQuery("entities.Employe.sansProjetDto");
        return q.getResultList();
*/
    }




}
