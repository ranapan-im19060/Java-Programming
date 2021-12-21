package com.company;
/*Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Specify the instance variables and methods for each class. The private instance variables of Quadrilateral should be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates objects of your classes and outputs each object’s area (except Quadrilateral).
Hints:
•	Create and use a Point class to represent the corners of the shapes.
*/
public class Main {

    public static void main(String[] args) {
	//Assigning values to Pointers
        Point point1 = new Point(1.1,1.20);
        Point point2 = new Point(6.6,2.8);
        Point point3 = new Point(6.2,9.9);
        Point point4 = new Point(2.2,7.4);

        //All codes relating to the Quadrilateral class (Not need to create Quadrilateral object)
        System.out.println("Coordinates of Quadrilateral are: \n( "+point1.getX()+", "+point1.getY()+" ) , ( "+point2.getX()+", "+point2.getY()+" ) , ( " + point3.getX()+", "+point3.getY()+" ) , ( "+point4.getX()+", "+point4.getY()+" )" );


        //codes relating to the trapezoid
        Point pointT1 = new Point(0.0,0.0);
        Point pointT2 = new Point(10.0,0.0);
        Point pointT3 = new Point(8.0,5.0);
        Point pointT4 = new Point(3.3,5.0);
        Trapezoid trapezoid = new Trapezoid(pointT1,pointT2,pointT3,pointT4);
        System.out.println();
        System.out.println("Coordinates of Trapezoid are: \n( "+pointT1.getX()+", "+pointT1.getY()+" ) , ( "+pointT2.getX()+", "+pointT2.getY()+" ) , ( " + pointT3.getX()+", "+pointT3.getY()+" ) , ( "+pointT4.getX()+", "+pointT4.getY()+" )" );
        trapezoid.area();


        //Codes relating to the parallelogram
        Point pointP1 = new Point(5.0,5.0);
        Point pointP2 = new Point(11.0,5.0);
        Point pointP3 = new Point(12.0,20.0);
        Point pointP4 = new Point(6.0,20.0);
        Parallelogram parallelogram = new Parallelogram(pointP1,pointP2,pointP3,pointP4);
        System.out.println();
        System.out.println("Coordinates of Parallelogram are: \n( "+pointP1.getX()+", "+pointP1.getY()+" ) , ( "+pointP2.getX()+", "+pointP2.getY()+" ) , ( " + pointP3.getX()+", "+pointP3.getY()+" ) , ( "+pointP4.getX()+", "+pointP4.getY()+" )" );
        parallelogram.area();


        //Codes relating to the rectangle class
        Point pointR1 = new Point(17.0,14.0);
        Point pointR2 = new Point(30.0,14.0);
        Point pointR3 = new Point(30.0,28.0);
        Point pointR4 = new Point(17.0,28.0);
        Rectangle rectangle = new Rectangle(pointR1,pointR2,pointR3,pointR4);
        System.out.println();
        System.out.println("Coordinates of Rectangle are: \n( "+pointR1.getX()+", "+pointR1.getY()+" ) , ( "+pointR2.getX()+", "+pointR2.getY()+" ) , ( " + pointR3.getX()+", "+pointR3.getY()+" ) , ( "+pointR4.getX()+", "+pointR4.getY()+" )" );
        rectangle.area();



       //All codes relating to the Square Object
        Point pointS1 = new Point(4.0,0.0);
        Point pointS2 = new Point(8.0,0.0);
        Point pointS3 = new Point(8.0,4.0);
        Point pointS4 = new Point(4.0,4.0);
        Square square = new Square(pointS1,pointS2,pointS3,pointS4);
        System.out.println();
        System.out.println("Coordinates of Suare are: \n( "+pointS1.getX()+", "+pointS1.getY()+" ) , ( "+pointS2.getX()+", "+pointS2.getY()+" ) , ( " + pointS3.getX()+", "+pointS3.getY()+" ) , ( "+pointS4.getX()+", "+pointS4.getY()+" )" );
        square.area();
    }
}
