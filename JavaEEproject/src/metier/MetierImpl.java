package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements IMetierCatalaogue {
    @Override
    public List<Produit> getProduitsParMC(String mc) {
        List<Produit> produits = new ArrayList<>();
        Connection connection = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("select * from PRODUITS nom_produit like ?");
            ps.setString(1,"%"+mc+"%");
            ResultSet rs = ps.executeQuery();
            rs.toString();
            while(rs.next()){
                Produit produit = new Produit();
                produit.setIdProduit(rs.getLong("id_produit"));
                produit.setNomProduit(rs.getString("nom_produit"));
                produit.setPrix(rs.getDouble("prix"));
                produits.add(produit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public void addProduit(Produit p) {

    }
}
