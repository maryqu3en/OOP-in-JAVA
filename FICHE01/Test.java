public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        String s1 = "A";
        String s2 = "B";
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        // System.out.println("Before change"+ x,y,s1,s2,p1.getX(),p1.getY(),p2.getX(),p2.getY());
        System.out.println("Before change: " + x + " " + y + " " + s1 + " " + s2 + " " + p1.getX() + " " + p1.getY() + " " + p2.getX() + " " + p2.getY());
        change(x, y, s1, s2, p1, p2);
        //System.out.println("After change"+ x,y,s1,s2,p1.getX(),p1.getY(),p2.getX(),p2.getY());
        System.out.println("After change: " + x + " " + y + " " + s1 + " " + s2 + " " + p1.getX() + " " + p1.getY() + " " + p2.getX() + " " + p2.getY());
    }

    public static void change(int a, int b, String n, String m, Point p, Point q) {
        // System.out.println("Start change"+ a,b,n,m,p.getX(),p.getY(),q.getX(),q.getY());
        System.out.println("Start change: " + a + " " + b + " " + n + " " + m + " " + p.getX() + " " + p.getY() + " " + q.getX() + " " + q.getY());
        a = 30;
        b = 40;
        n = "C";
        m = "D";
        p.setX(10);
        q = new Point(5, 6);
        // System.out.println("End change"+ a,b,n,m,p.getX(),p.getY(),q.getX(),q.getY());
        System.out.println("End change: " + a + " " + b + " " + n + " " + m + " " + p.getX() + " " + p.getY() + " " + q.getX() + " " + q.getY());
    }
}