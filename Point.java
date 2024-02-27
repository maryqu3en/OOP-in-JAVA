// WORK DONE BY : SOUBIH Meriem || GROUP 8 || L2

public class Point {
    
    private float x;
    private float y;

    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}