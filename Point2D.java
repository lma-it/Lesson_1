public class Point2D {

    private int x;
    private int y;


    public static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D(){
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    } 

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }
}
