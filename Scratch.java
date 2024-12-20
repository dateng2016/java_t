import pkg.Teacher;

public class Scratch {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.teach();
        System.out.println(t.getAge());
        System.out.println(t.getName());
    }
}
