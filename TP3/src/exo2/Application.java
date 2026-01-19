package exo2;
import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();

        while(true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par ID");
            System.out.println("3. Ajouter un produit");
            System.out.println("4. Supprimer un produit par ID");
            System.out.println("5. Sauvegarder les produits");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // consommer le retour à la ligne

            switch(choix) {
                case 1:
                    System.out.println("\nListe des produits :");
                    for(Product p : metier.getAll()) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Entrez l'ID du produit : ");
                    long idSearch = scanner.nextLong();
                    scanner.nextLine();
                    Product pFound = metier.findById(idSearch);
                    if(pFound != null) System.out.println(pFound);
                    else System.out.println("Produit non trouvé !");
                    break;

                case 3:
                    System.out.print("ID : "); long id = scanner.nextLong(); scanner.nextLine();
                    System.out.print("Nom : "); String name = scanner.nextLine();
                    System.out.print("Marque : "); String brand = scanner.nextLine();
                    System.out.print("Prix : "); double price = scanner.nextDouble(); scanner.nextLine();
                    System.out.print("Description : "); String desc = scanner.nextLine();
                    System.out.print("Quantité en stock : "); int qty = scanner.nextInt(); scanner.nextLine();

                    Product newProduct = new Product(id, name, brand, price, desc, qty);
                    metier.add(newProduct);
                    System.out.println("Produit ajouté !");
                    break;

                case 4:
                    System.out.print("Entrez l'ID du produit à supprimer : ");
                    long idDelete = scanner.nextLong();
                    scanner.nextLine();
                    metier.delete(idDelete);
                    break;

                case 5:
                    metier.saveAll();
                    break;

                case 6:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide !");
            }
        }
    }
}