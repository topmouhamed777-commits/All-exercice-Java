import java.util.Scanner;

public class Statistique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le texte : ");
        String texte = sc.nextLine();
        int nbVoyelles = 0;
        int nbConsonne = 0;
        int nbChiffre = 0;
        int nbEspace = 0, nbAutre = 0;
        for (int i = 0; i < texte.length(); i++) {
            char c = Character.toLowerCase(texte.charAt(i));
             String Voyelles = "eéèêàùiouy";

             if (Voyelles.indexOf(c) != -1) 

                
                nbVoyelles++;
            /***if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'é' || c == 'è'
                    || c == 'ê' || c == 'à' || c == 'ù')***/
                nbVoyelles++;
            else if (Character.isLetter(c))
                nbConsonne++;
            else if (Character.isDigit(c))
                nbChiffre++;
            else if (c == ' ')
                nbEspace++;
            else
                nbAutre++;
        }
        System.out.println("Le Statistique du texte :");
        System.out.println("Voyelles : " + nbVoyelles);
        System.out.println("Consonnes : " + nbConsonne);
        System.out.println("Chiffres : " + nbChiffre);
        System.out.println("Espaces : " + nbEspace);
        System.out.println("Autres : " + nbAutre);

        sc.close();

    }
}
