package sandbox;

public class Distance {

    public static void main(String[] args) {

        Point p1 = new Point(100, 100);
        Point p2 = new Point(200, 200);

        System.out.println("Distance between two points = " + Point.distance(p1, p2));
    }

}
