package OOPsPracticeProblems.Problem3;

/*
  <3> Write a Java program to create a class called "Rectangle" with width and height attributes.
      Calculate the area and perimeter of the rectangle.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle(7, 6);
        Rectangle obj1 = new Rectangle(7, 6);

        System.out.println("The area of the triangle is " + obj.area() + "(cm)2");
        System.out.println("The perimeter of the triangle is " + obj.perimeter() + "(cm)2");

        obj1.setWidth(16);
        obj1.getHeight(6);

        System.out.println("The area of the  second triangle is " + obj1.area() + "(cm)2");
        System.out.println("The perimeter of the second triangle is " + obj1.perimeter() + "(cm)2");


    }
}
