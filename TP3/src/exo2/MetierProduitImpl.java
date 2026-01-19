package exo2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class MetierProduitImpl implements IProduitMetier {
    private List<Product> products = new ArrayList<>();
    private final String fileName = "products.dat";

    // Constructeur : charge la liste depuis le fichier si il existe
    public MetierProduitImpl() {
        File f = new File(fileName);
        if(f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
                products = (List<Product>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
                products = new ArrayList<>();
            }
        }
    }

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public List<Product> getAll() {
        // retourne la liste en mémoire, pas besoin de relire le fichier
        return products;
    }

    @Override
    public Product findById(long id) {
        for(Product p : products) {
            if(p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Product p = findById(id);
        if(p != null) products.remove(p);
        else System.out.println("Produit non trouvé !");
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
            System.out.println("Liste des produits sauvegardée !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

