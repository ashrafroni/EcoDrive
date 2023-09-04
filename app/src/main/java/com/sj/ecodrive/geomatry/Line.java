package com.sj.ecodrive.geomatry;

public class Line {
    public Line(){
        firstPoint = new Point();
        lastPoint = new Point();
    }
    public Line(double p1dx, double p1dy,double p2dx, double p2dy){
        firstPoint = new Point(p1dx,p1dy);
        lastPoint = new Point(p2dx,p2dy);
    }
    private Point firstPoint;
    private Point lastPoint;

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getLastPoint() {
        return lastPoint;
    }

    public void setLastPoint(Point lastPoint) {
        this.lastPoint = lastPoint;
    }
}
