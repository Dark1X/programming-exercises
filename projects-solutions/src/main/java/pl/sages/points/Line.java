package pl.sages.points;

public class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length(){
        return start.distanceTo(end);
    }
}
