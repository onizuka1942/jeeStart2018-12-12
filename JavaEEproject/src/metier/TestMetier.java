package metier;

import java.util.List;

public class TestMetier {

    public static void main(String[]args){
        MetierImpl metier = new MetierImpl();
        List<Produit> produitList = metier.getProduitsParMC("is");
        if(produitList!=null) {
            produitList.toString();
        }
    }
}
