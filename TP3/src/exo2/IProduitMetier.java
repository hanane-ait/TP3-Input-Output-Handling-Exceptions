package exo2;

import java.util.List;

interface IProduitMetier {
    void add(Product p);
    List<Product> getAll();
    Product findById(long id);
    void delete(long id);
    void saveAll();
}