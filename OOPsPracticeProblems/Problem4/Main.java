package OOPsPracticeProblems.Problem4;

/*
  <4> Write a Java program to create a class called "Circle" with a radius attribute.
      You can access and modify this attribute. Calculate the area and circumference of the circle.
 */

public class Main {
    public static void main(String[] args) {

        Circle obj = new Circle(12);

        obj.area();
        obj.circumference();

        System.out.println("The area of the circle is " + obj.area());
        System.out.println("The perimeter of the circle is " + obj.circumference());

        obj.setRadius(6);
        System.out.println("The area of the new circle is " + obj.area());
        System.out.println("The circumference of the  new circle is " + obj.circumference());
    }
       //We can also use(Math.PI)instead of the value of Pi!!

}
