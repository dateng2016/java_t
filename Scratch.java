import java.util.ArrayList;

public class Scratch {

    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("John");
        ls.add("Wick");

        ArrayList<String> ls2 = new ArrayList<>();
        for (var name : ls) {
            if (name.startsWith("Joh")) {
                ls2.add(name);
            }
        }

        System.out.println(ls2);

    }
}