TextBlocks.java
public class TextBlocks {
 public static void main(String[] args) {
 String sql = """
 SELECT p.reference, p.libelle, p.prix
 FROM produit p
 WHERE p.categorie = ?
 AND p.stock > 0
 ORDER BY p.prix DESC
 """;
 System.out.print(sql);
 String client = "Fatou Sow";
 long total = 18_500;
 String json = """
 {
 "client": "%s",
 "total": %d,
 "devise": "XOF",
 "livraison": "Parcelles Assainies"
 }""".formatted(client, total);
 System.out.println(json);
 String message = """
 Bonjour, votre commande est en cours de \
 livraison. Merci de votre confiance !""";
 System.out.println(message);
 }
}
