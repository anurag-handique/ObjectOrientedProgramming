package OOPsPracticeProblems.Problem2;

/*
 <2> Write a Java program to create a class called "Dog" with a name and breed attribute.
     Create two instances of the "Dog" class, set their attributes using the constructor and modify
     the attributes using the setter methods and print the updated values.
 */
public class Main {
    public static void main(String[] args) {

        Dog obj = new Dog("Kitty", "Labrador");//Dog object
        //Note obj is not the object it is the reference of Dog object.

        System.out.println("My dog name is " + obj.getName() + " he is a breed of " + obj.getBreed() + ".");

        obj.setName("Rocky");//Update value using setters
        obj.setBreed("Siberian Husky");//Update value using setters

        System.out.println("My dog name is " + obj.getName() + " he is a breed of " + obj.getBreed() + ".");

    }
}
