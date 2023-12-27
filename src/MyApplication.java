import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    private static String[] args;

    public static void main(String[] args) throws FileNotFoundException {
        MyApplication.args = args;

        File file = new File("/Users/ayaulymorazbayeva/Documents/GitHub/oop-asn1/src/inf");

        Scanner sc = new Scanner(file);
        //linkin my inf file

        Shape shape = new Shape();
        //creating shape for points

        Point p1 = null;
        Point pn = null;
        //new variables for points, first-point and previous-point
        //and read points from that inf file
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();


            Point point = new Point(x, y);
            //a point with x/y coordinate

            shape.addPoint(point);
            //pushing point to the shape

            if (pn != null) {
                double d = pn.distance(point);
                System.out.println("Distance between " + pn + " and " + point + " = " + d);
            } else {
                p1 = point;
            }
            //finding distanse between points

            pn = point;
            //update previos->current
        }

        //result distance
        if (pn != null && p1 != null) {
            double d = pn.distance(p1);
            System.out.println("Distance between " + pn + " and " + p1 + " = " + d);
        }

        //Final output
        System.out.println("Perimeter: " + shape.P());
        System.out.println("Average side: " + shape.middlevalue());
        System.out.println("Longest side: " + shape.longestvalue());
    }
}