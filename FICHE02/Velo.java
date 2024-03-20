public class Velo extends Vehicule {
    private String type;

    public Velo(int vitesseInitiale, String type) {
        super(2, vitesseInitiale);
        this.type = type;
    }
    public void tombe() {
        vitesse = 0;
        System.out.println("je suis tombé!");
    }
}