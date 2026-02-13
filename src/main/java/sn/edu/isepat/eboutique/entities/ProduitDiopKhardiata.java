package sn.edu.isepat.eboutique.entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produit_diop_khardiata")
public class ProduitDiopKhardiata {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nom;


    private String description;
}