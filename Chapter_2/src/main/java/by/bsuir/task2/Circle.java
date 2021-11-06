package by.bsuir.task2;

public class Circle {
    private double radius;
    private double xCenter;
    private double yCenter;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double xCenter, double yCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public Circle(double radius, double xCenter, double yCenter) {
        this.radius = radius;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public void updateCenter(double addToX, double addToY) {
        this.xCenter += addToX;
        this.yCenter += addToY;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * Math.sqrt(radius);
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                '}';
    }
}
