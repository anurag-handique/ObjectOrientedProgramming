package OOPsPracticeProblems.Problem5;

public class Employee {

    private String name;
    private String jobtitle;
    private double salary;

    public Employee(String name, String jobtitle, double salary) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double oldSalary() {
        return salary;
    }

    public double revicedSalary(int percentage) {
        return salary = salary + salary * percentage / 100;

    }
}
