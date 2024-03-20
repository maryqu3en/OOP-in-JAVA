public class Circulation {
    public static void main(String[] args) {
        Object a = new Automobile(0, 50);
        Object v = new Velo(0, "VTT");
        Vehicule vh = new Vehicule(3, 10);
        Conducteur c = new Conducteur("Karim", "1234567");
        ((Velo) v).tombe();   // (1)     type casting it to Velo
        c.conduit((Velo) v);  // (2)    cannot cast velo to automobile
        c.conduit((Automobile) a);   // (3)   cannot work
        ((Automobile) a).faitLePlein(10);   // (4)  cannot cast parent to child  || need to use Automobile object
    }
}