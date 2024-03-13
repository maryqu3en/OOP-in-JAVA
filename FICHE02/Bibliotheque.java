public class Bibliotheque {
    public Document[] bibTable;
    public int nbrDoc;

    public Bibliotheque(int n)
    {
        this.bibTable = new Document[n];
        this.nbrDoc = 0;
    }

    public void ajouter(Document d)
    {
        this.bibTable[nbrDoc] = d;
        this.nbrDoc++;
    }

    public void listing()
    {
        for (int i = 0; i < nbrDoc; i++)
        {
            bibTable[i].affiche();
        }
    }
}
