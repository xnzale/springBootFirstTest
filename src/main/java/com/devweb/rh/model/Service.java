package com.devweb.rh.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.*;
@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 25)
    private String libelle;
    @OneToMany(mappedBy = "service")
    @JsonBackReference
    private List<Employe> employes;


    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Employe e) {
        List<Employe> employes = new ArrayList<Employe>();
        employes.add(e);
        this.employes = employes;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}