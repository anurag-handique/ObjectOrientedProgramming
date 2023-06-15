package OOPsPracticeProblems.Problem5;

/*
    <5> Write a Java program to create a class called "Employee" with a name,
        job title, and salary attributes, and methods to calculate and update salary.
 */
public class Main {

    public static void main(String[] args) {
        Employee person1 = new Employee("Anurag Handique", "Full Stack Developer", 55000);
        Employee person2 = new Employee("Abinash Goyal", "Front-End Developer", 40000);

        System.out.println("Employee Name: " + person1.getName() + "  | Job title: " + person1.getJobtitle() + " | Salary inclusive all tax Rs: " + person1.getSalary() + "/-");
        System.out.println("Employee Name: " + person2.getName() + "  | Job title: " + person2.getJobtitle() + " | Salary inclusive all tax Rs: " + person2.getSalary() + "/-");

        person1.setName("Arpan Gogoi");
        person1.setJobtitle("Backend Developer");
        person1.setSalary(37000);

        System.out.println("Employee Name: " + person1.getName() + "  | Job title: " + person1.getJobtitle() + " | Salary inclusive all tax Rs: " + person1.getSalary() + "/-");

        person2.setName("Sahil Reddy");
        person2.setJobtitle("Buisness Developement Executive");
        person2.setSalary(65000);

        System.out.println("Employee Name: " + person2.getName() + "  | Job title: " + person2.getJobtitle() + " | Salary inclusive all tax Rs: " + person2.getSalary() + "/-");


        System.out.println("Updated Salary of " + person1.getName() + " : Rs- " + person1.revicedSalary(5) + "-/");
        System.out.println("Updated Salary of " + person2.getName() + " : Rs- " + person2.revicedSalary(9) + "-/");
    }

}
