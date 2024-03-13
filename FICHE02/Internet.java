public class Internet extends Document{
    public String URL;

    public Internet(String titre, String u)
    {
        super(titre);
        this.URL = u;
    }

    public void affiche()
    {
        super.affiche();
        System.out.println(this.URL);
    }
}
