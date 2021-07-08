package com.codeup.catdemo.models;

//import javax.persistence.*;

import javax.persistence.*;

@Entity
@Table(name = "Cats")
public class Cat {

    @Id
//    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long catId;

    @Column(nullable = false)
    private String catType;

    public Cat(){};

    public Cat(String catType) {
        this.catType = catType;
    }

    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
}
