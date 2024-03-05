public class Dessin {
    private Rectangle[] rectangles;
    private int index = 0;
    public static int total = 0;

    public Dessin(int size) {
        rectangles = new Rectangle[size];
    }

    void add(Rectangle r) {
        if (index < rectangles.length) {
            rectangles[index] = r;
            total += rectangles[index].surface();
            index++;
        } else {
            System.out.println("The array is full. Cannot add more rectangles.");
        }
    }

    int totalSurface() {
        return total;
    }

    public static void main(String[] args) {
        Dessin drawing = new Dessin(5);

        Rectangle r1 = new Rectangle(new Point(0, 0), new Point(5, 10));
        Rectangle r2 = new Rectangle(new Point(0, 0), new Point(3, 4));
        Rectangle r3 = new Rectangle(new Point(0, 0), new Point(6, 7));

        drawing.add(r1);
        drawing.add(r2);
        drawing.add(r3);

        System.out.println("The surface area of rectangle 1: " + r1.surface());
        System.out.println("The surface area of rectangle 2: " + r2.surface());
        System.out.println("The surface area of rectangle 3: " + r3.surface());

        System.out.println("Total surface area: " + drawing.totalSurface());
    }
}