package com.sj.ecodrive.geomatry;


public class Point {
    public Point(){
    }
    public Point(double x, double y){
        dx = x;
        dy = y;
    }
    private double dx;
    private double dy;

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }
}
