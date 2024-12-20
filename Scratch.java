import pkg.Itfc1;

public class Scratch {
    public static void main(String[] args) {
        Outer.Inner1 obj = new Outer().new Inner1();
        obj.f();

        Outer.Inner2 obj2 = new Outer().new Inner2();
        obj2.f();

    }
}

class Outer {
    public class Inner1 {
        public void f() {
            System.out.println("Inner class 1");
        }
    }

    class Inner2 {
        public void f() {
            System.out.println("Inner class 2");
        }
    }
}