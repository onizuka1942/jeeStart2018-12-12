package metier;

import java.util.List;

public interface IMetierCatalaogue {
    public List<Produit> getProduitsParMC(String mc);
    public void addProduit(Produit p);
}
