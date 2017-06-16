package pl.sages.points;

import java.util.ArrayList;
import java.util.List;

public class Polygon implements HasArea, HasCircumference{

    // punkty muszą być w porządku przeciwnym do kierunku wskazówek zegara
    private List<Point> nodeList;

    public Polygon(List<Point> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public double getCircumference() {
        double circumference = 0.0;
        //aby policzyć obwód należy zsumować długości wszystkich boków
        // w pętli liczymy odległość od danego wierzchołka do poprzedniego, dlatego zaczynamy od i=1
        for (int i = 1; i < nodeList.size(); i++) {
            circumference += nodeList.get(i-1).distanceTo(nodeList.get(i));
        }
        // na koniec należy dodać odległość z ostatniego do pierwszego!
        circumference += nodeList.get(nodeList.size()-1).distanceTo(nodeList.get(0));
        return circumference;
    }

    @Override
    public double getArea() {
        double area = 0.0;
        for (int i = 1; i < nodeList.size(); i++) {
            Point prev = nodeList.get(i - 1);
            Point next = nodeList.get(i);
            area += prev.getX() * next.getY() - next.getX() * prev.getY();
        }
        // na koniec należy dodać odległość z ostatniego do pierwszego!
        Point last = nodeList.get(nodeList.size() - 1);
        Point first = nodeList.get(0);
        area += last.getX() + first.getY() - first.getX() * last.getY();
        return area/2;
    }

    public static void main(String[] args) {
        // test pola kwadratu
        List<Point> points = new ArrayList<>();
        // punkty posortowane przeciwnie do kierunku wskazówek zegara
        points.add(new Point(0,0));
        points.add(new Point(2,0));
        points.add(new Point(2,2));
        points.add(new Point(0,2));
        Polygon polygon = new Polygon(points);
        System.out.println(polygon.getArea());
    }
}
