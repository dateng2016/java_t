import pkg.Human;

public class Scratch {
    public static void main(String[] args) throws ClassNotFoundException {
        String classFullName = "pkg.Human";

        // System.out.println(Class.forName("pkg.Human"));;

        // Method 1
        Class clazz1 = Class.forName(classFullName);

        System.out.println(clazz1);

        // Method 2
        Class clazz2 = Human.class;

        System.out.println(clazz1 == clazz2);

        // Method 3
        Human h = new Human();
        Class clazz3 = h.getClass();

        System.out.println(clazz1 == clazz3);


    }
}
