package pl.sages.points;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point other){
        double xDist = this.x - other.x;
        double yDist = this.y - other.y;
        return Math.sqrt(xDist * xDist + yDist * yDist);
    }


}
