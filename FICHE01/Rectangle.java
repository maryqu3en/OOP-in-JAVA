public class Rectangle {
    private Point BL;
    private Point TR;
    public static int nbr = 0;

    public Rectangle(Point bl, Point tr) {
        this.BL = bl;
        this.TR = tr;

        nbr++;
    }

    public int length() {
        return Math.abs((int) TR.getX() - (int) BL.getX());
    }

    public int width() {
        return Math.abs((int) TR.getY() - (int) BL.getY());
    }

    public int surface() {
        return length() * width();
    }

    public static void main(String[] args) {
        Point bl = new Point(1, 1);
        Point tr = new Point(3, 4);
        Rectangle rectangle = new Rectangle(bl, tr);

        System.out.println("Length: " + rectangle.length());
        System.out.println("Width: " + rectangle.width());
        System.out.println("Surface Area: " + rectangle.surface());
        System.out.println("Number of rectangles: " + Rectangle.nbr);
    }
}