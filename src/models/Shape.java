package models;

import java.util.ArrayList;

public class Shape {

    ArrayList<Point> points = new ArrayList<>();
    //storing data of points that forming shape
    //Shape(param): Constructor to initialize a shape with an array of points.
    public void addPoint(Point point) {
        points.add(point);
    }
    //pushing it to the list
   //perimeter(): Calculate and return the perimeter of the shape.
    public double P() {
        //perimeter
        double p = 0;
        int n = points.size();


        for (int i = 0; i < n; i++) {
            Point ipoint = points.get(i);
            Point inpoint = points.get((i + 1) % n);
            // our index current point and next one
            p += ipoint.distance(inpoint);
        }

        return p;
    }

   //averageSide(): Calculate and return the average length of the sides in the shape.
    public double middlevalue() {
        int v = points.size();
        if (v == 0) {
            return 0;
        }

        return P() / v;
    }
    //longestSide(): Find and return the length of the longest side in the shape.
    public double longestvalue() {
        double x = 0;


        for (int i = 0; i < points.length(); i++) {
            Point ipoint = points.get(i);
            Point inpoint = points.get((i + 1) % points.size());

            double currentSide = ipoint.distance(inpoint);
            if (currentSide > x) {
                x = currentSide;
            }
        }

        return x;
    }
}