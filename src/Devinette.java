import java.util.Random;
import java.util.Scanner;

public class Devinette {

    public static void main(String[] args) {
        // 1. Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // génère un nombre entre 0 et 99, puis ajoute 1 pour être entre 1 et 100

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        final int MAX_ATTEMPTS = 10; // Nombre maximal d'essais

        System.out.println("Bienvenue au jeu de devinettes !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. À vous de le deviner.");
        System.out.println("Vous avez " + MAX_ATTEMPTS + " essais.");

        // 2. Créer une boucle qui demande à l'utilisateur de deviner un nombre.
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Essai #" + (attempts + 1) + " : Devinez le nombre : ");

            // Valider l'entrée utilisateur pour s'assurer que c'est un entier
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne restante

                // 3. Lire l'entrée de l'utilisateur et la comparer au nombre aléatoire.
                if (guess == randomNumber) {
                    // 5. S'il a deviné le bon nombre, mettez fin à la boucle et dites-lui qu'il a gagné.
                    System.out.println("Félicitations ! Vous avez deviné le bon nombre (" + randomNumber + ") en " + (attempts + 1) + " essais.");
                    break; // Met fin à la boucle
                } else if (guess < randomNumber) {
                    // 4. Indiquer à l'utilisateur si le nombre deviné est supérieur ou inférieur au nombre aléatoire.
                    System.out.println("Trop bas ! Essayez un nombre plus élevé.");
                } else {
                    System.out.println("Trop haut ! Essayez un nombre plus bas.");
                }
                attempts++;
            } else {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
                scanner.nextLine(); // Consommer l'entrée invalide pour éviter une boucle infinie
            }
        }

        // 6. S'il a utilisé les 10 essais, mettez fin à la boucle et dites-lui qu'il a perdu.
        if (attempts == MAX_ATTEMPTS) {
            System.out.println("\nDésolé, vous avez utilisé tous vos " + MAX_ATTEMPTS + " essais.");
            System.out.println("Le nombre que j'avais choisi était : " + randomNumber);
            System.out.println("Meilleure chance la prochaine fois !");
        }

        scanner.close(); // Fermer le scanner pour libérer les ressources
    }
}