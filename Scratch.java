import java.util.Arrays;
import java.util.Comparator;

public class Scratch {
    public static void main(String[] args) {
        test2();
    }

    static void test1() {

        Integer[] arr = { 3, 1, 34, 54, 72, 11, 3, 4 };
        // Arrays.sort(arr, new Comparator<Integer>() {
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return o2 - o1;
        // }
        // });

        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }

    static void test2() {
        Integer[] arr = { 3, 1, 34, 54, 72, 11, 3, 4 };
        Arrays.sort(arr, Scratch::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}