package pl.sages.points;

import org.omg.PortableServer.POA;

public class Rectangle implements HasArea, HasCircumference {

    // zakładamy, że boki prostokąta są równoległe do osi X,Y
    // w takim wypadku do jego reprezentacji wystarczą nam dwa przeciwległe boki
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean isInside(Point point){
        return bottomLeft.getX() <= point.getX() && bottomLeft.getY() <= point.getY() &&
                topRight.getX() >= point.getX() && topRight.getY() >= point.getY();
    }

    @Override
    public double getArea() {
        return (topRight.getX() - bottomLeft.getX()) * (topRight.getY() - bottomLeft.getY());
    }

    @Override
    public double getCircumference() {
        return 2*(topRight.getX() - bottomLeft.getX()) + 2 * (topRight.getY() - bottomLeft.getY());
    }
}
