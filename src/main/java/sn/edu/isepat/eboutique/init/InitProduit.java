package sn.edu.isepat.eboutique.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import sn.edu.isepat.eboutique.EboutiqueApplication;
import sn.edu.isepat.eboutique.entities.ProduitDiopKhardiata;
import sn.edu.isepat.eboutique.repositories.CategorieRepository;
import sn.edu.isepat.eboutique.repositories.ProduitRepository;

@Component

public class InitProduit implements CommandLineRunner {
    private final ProduitRepository produitRepository;

    public InitProduit(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
@Override
    public void run(String... args) {
        System.out.println("initialisation");
        ProduitDiopKhardiata congelateur = new ProduitDiopKhardiata();
        congelateur.setNom("congelateur");



    produitRepository.save(congelateur);

    //test pull request


    }
}
