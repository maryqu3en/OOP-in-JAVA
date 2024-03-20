public class Automobile extends Vehicule {
    private int reservoir;
    public Automobile(int vi, int reservoir) {
        super(4, vi);
        this.reservoir = reservoir;
    }
    public void faitLePlein(int quantite) {
        reservoir += quantite;
        System.out.println("il me reste " + reservoir + "litres");
    }
}