package models;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //Point(param): Constructor to initialize a point with given x and y coordinates.

    public double distance(Point d) {
        double dx = this.x - d.x;
        double dy = this.y - d.y;
        return Math.sqrt(Math.pow(destination.x - this.x, 2) + Math.pow(destination.y - this.y, 2))
    }
    //distanceTo(param): Calculate and return the distance from the current point to the destination point.

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    //toString(): Provide a string representation of the point in the format
}