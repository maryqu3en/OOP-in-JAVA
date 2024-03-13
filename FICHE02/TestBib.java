public class TestBib {
    public static void main(String[] args)
    {
        Bibliotheque bib = new Bibliotheque(3);
        Document doc1 = new Document("Archive");
        Livre doc2 = new Livre("The giver", "Yas", "MES");
        Document doc3 = new Internet("Google", "Google.com");

        bib.ajouter(doc1);
        bib.ajouter(doc2);
        bib.ajouter(doc3);

        bib.listing();
    }
}
