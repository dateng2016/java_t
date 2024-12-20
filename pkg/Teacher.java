package pkg;

public class Teacher extends Human {
    private double salary;

    public void teach() {
        System.out.println("Teacher is teaching...");
    }

    public double getSalary() {
        return salary; 
    }
}