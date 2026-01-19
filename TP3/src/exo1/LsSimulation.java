package exo1;

import java.io.File;
import java.util.Scanner;

public class LsSimulation {

    public static void main(String[] args) {

        // 1. Lire le chemin du dossier depuis le clavier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le chemin du dossier : ");
        String chemin = scanner.nextLine();

        // 2. Créer un objet File à partir du chemin
        File dossier = new File(chemin);

        // 3. Vérifier si le chemin existe et si c’est bien un dossier
        if (!dossier.exists() || !dossier.isDirectory()) {
            System.out.println("Chemin invalide ou ce n'est pas un dossier.");
            return;
        }

        // 4. Récupérer la liste des fichiers et dossiers
        File[] fichiers = dossier.listFiles();

        // 5. Parcourir chaque fichier/dossier
        for (File f : fichiers) {

            // Afficher le chemin complet
            System.out.print(f.getAbsolutePath() + " ");

            // 6. Afficher le type : FILE ou DIR
            if (f.isDirectory()) {
                System.out.print("<DIR> ");
            } else {
                System.out.print("<FILE> ");
            }

            // 7. Afficher les droits d’accès
            // Lecture
            if (f.canRead()) {
                System.out.print("r");
            } else {
                System.out.print("-");
            }

            // Écriture
            if (f.canWrite()) {
                System.out.print("w");
            } else {
                System.out.print("-");
            }

            // Caché
            if (f.isHidden()) {
                System.out.print("h");
            } else {
                System.out.print("-");
            }

            // Aller à la ligne
            System.out.println();
        }

        scanner.close();
    }
}

