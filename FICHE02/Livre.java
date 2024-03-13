public class Livre extends Document{
    public String editeur, auteur;

    public Livre(String t, String e, String a)
    {
        super(t);
        this.editeur = e;
        this.auteur = a;
    }

    public void affiche()
    {
        super.affiche();
        System.out.println(this.auteur + " " + this.editeur);
    }
}
