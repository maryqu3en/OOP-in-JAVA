public class Document {
    public String titre;
    public int nbrDocument = 0;

    public Document()
    {
        nbrDocument++;
    }

    public Document(String t)
    {
        this.titre = t;
        nbrDocument++;
    }

    public void affiche()
    {
        System.out.println(this.titre);
    }
}
