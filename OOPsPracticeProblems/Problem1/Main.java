package OOPsPracticeProblems.Problem1;

/* <1> Write a Java program to create a class called "Person" with a name and age attribute.
   Create two instances of the "Person" class, set their attributes using the constructor,
   and print their name and age.
 */
public class Main {
    public static void main(String[] args) {

        Person obj1 = new Person("Anurag Handique", 23);
        Person obj2 = new Person("Abinash Chutia", 21);

        System.out.println(obj1.getName() + " is " + obj1.getAge() + " years old!!");
        System.out.println(obj2.getName() + " is " + obj2.getAge() + " years old!!");

    }
}
