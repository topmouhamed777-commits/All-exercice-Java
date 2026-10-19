
import java.util.Scanner;

public class MinMaxMoyenne {

    public static int min(int[] tableau) {
        int minimum = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < minimum) {
                minimum = tableau[i];
            }
        }

        return minimum;
    }

    public static int max(int[] tableau) {
        int maximum = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }
        }

        return maximum;
    }

    public static double moyenne(int[] tableau) {
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme = somme + tableau[i];
        }

        return (double) somme / tableau.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien d'entiers voulez-vous saisir ? ");
        int n = sc.nextInt();

        // Verification de n
        if (n <= 0) {
            System.out.println("Erreur : n doit etre strictement positif.");
            sc.close();
            return;
        }

        int[] tableau = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'entier numero " + (i + 1) + " : ");
            tableau[i] = sc.nextInt();
        }

        int minimum = min(tableau);
        int maximum = max(tableau);
        double moy = moyenne(tableau);

        int compteur = 0;

        for (int i = 0; i < n; i++) {
            if (tableau[i] > moy) {
                compteur++;
            }
        }

        System.out.println("\n--- RESULTATS ---");
        System.out.println("Minimum : " + minimum);
        System.out.println("Maximum : " + maximum);
        System.out.printf("Moyenne : %.2f%n", moy);
        System.out.println("Nombre de valeurs superieures a la moyenne : " + compteur);

        sc.close();
    }
}
