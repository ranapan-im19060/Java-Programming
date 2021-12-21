package com.company;

public class Trapezoid extends Quadrilateral{
    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public Point getPoint1() {
        return super.getPoint1();
    }

    @Override
    public void setPoint1(Point point1) {
        super.setPoint1(point1);
    }

    @Override
    public Point getPoint2() {
        return super.getPoint2();
    }

    @Override
    public void setPoint2(Point point2) {
        super.setPoint2(point2);
    }

    @Override
    public Point getPoint3() {
        return super.getPoint3();
    }

    @Override
    public void setPoint3(Point point3) {
        super.setPoint3(point3);
    }

    @Override
    public Point getPoint4() {
        return super.getPoint4();
    }

    @Override
    public void setPoint4(Point point4) {
        super.setPoint4(point4);
    }

    @Override
    public void area() {
        double side1 = Math.sqrt((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()) + (point2.getY() - point1.getY())*(point2.getY() - point1.getY()));
        double side2 = Math.sqrt((point4.getX() - point3.getX()) * (point4.getX() - point3.getX()) + (point4.getY() - point3.getY())*(point4.getY() - point3.getY()));
        double height = 5.0; /* important */
        System.out.println("Height is: "+height);
        double area = 0.5 * (side1+side2) * height;
        System.out.println("Area is: "+area);
    }
}
