package pl.sages.points;

public class Circle implements HasArea, HasCircumference, HasCommonArea<Circle> {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean isInside(Point point){
        return center.distanceTo(point) <= radius;
    }

    public boolean isOutside(Point point){
        return !isInside(point);
    }

    @Override
    public boolean hasCommonArea(Circle other){
        // jeśli środki dwóch okręgów są oddalone od siebie o mniej
        // niż suma ich promienio to maja ze sobą część wspólna
        return this.center.distanceTo(other.center) < this.radius + other.radius;
    }

    @Override
    public double getArea() {
        // pole kola wynosi pi * r^2
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        // obwód to 2 * pi * r
        return 2 * Math.PI * radius;
    }
}
