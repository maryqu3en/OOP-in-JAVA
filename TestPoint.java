public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(5);
        p1.setY(3);
        p1.print();
        
        p1.setX(p1.getX() + 2);
        p1.setY(p1.getY() + 4);
        p1.print();
    }
}