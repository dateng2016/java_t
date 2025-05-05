import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import javax.swing.plaf.FontUIResource;

public class Scratch {

    public static void main(String[] args) {
        // test1();
        // test2();
        // test3();
        // test4();
        // test5();
        // test6();
        // test7();
        // test8();
        // test9();
        // test10();
        // test11();
        // test12();
        test13();
    }

    static void test1() {
        try {
            FileOutputStream fos = new FileOutputStream("a.txt");
            fos.write(97);
            fos.close();
        } catch (IOException e) {
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }
    }

    static void test2() {
        try {
            FileOutputStream fos = new FileOutputStream("myio/a.txt");
            fos.write(99);
            fos.close();
        } catch (IOException e) {
            System.out.println("Exceptions occurred here");
        }
    }

    static void test3() {

        try {
            FileOutputStream fos = new FileOutputStream("myio/a.txt");
            byte[] bytesArr = { 97, 98, 99, 100, 101 };
            fos.write(bytesArr, 1, 2);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void test4() {
        try {
            FileOutputStream fos = new FileOutputStream("myio/a.txt", true);
            String str = "hello\nworld\n";
            byte[] bytesArr = str.getBytes();
            fos.write(bytesArr);
            System.out.println(Arrays.toString(bytesArr));
            fos.close();
        } catch (IOException e) {
        }
    }

    static void test5() {
        try {
            FileInputStream fis = new FileInputStream("myio/a.txt");
            int b1 = fis.read();
            char c1 = (char) b1;
            System.out.println("Original Character -> " + c1);
            System.out.println("Number (Byte) -> " + b1);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void test6() {
        try {
            FileInputStream fis = new FileInputStream("myio/a.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println((char) b);
            }
            fis.close();
        } catch (IOException e) {
        }
    }

    static void test7() {
        try {
            FileInputStream fis = new FileInputStream("myio/a.txt");
            FileOutputStream fos = new FileOutputStream("destination/a_copy.txt");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

        } catch (IOException e) {
        }
    }

    static void test8() {
        try {
            FileInputStream fis = new FileInputStream("myio/a.txt");
            FileOutputStream fos = new FileOutputStream("destination/a_copy.txt");

            byte[] bytesArr = new byte[33];
            int len = fis.read(bytesArr);
            System.out.println("Number char read -> " + len);

            String str = new String(bytesArr);
            System.out.println("String -> " + str);

            fis.close();
            fos.close();
        } catch (IOException e) {
        }
    }

    static void test9() {
        try {
            FileInputStream fis = new FileInputStream("myio/a.txt");
            FileOutputStream fos = new FileOutputStream("destination/a_copy.txt");

            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            fis.close();
            fos.close();
        } catch (Exception e) {
        }
    }

    static void test10() {
        // * JDK 7
        try (FileInputStream fis = new FileInputStream("myio/a.txt");
                FileOutputStream fos = new FileOutputStream("destination/a_copy.txt")) {
        } catch (IOException e) {
        }

    }

    static void test11() throws FileNotFoundException {
        // * JDK 9
        FileInputStream fis = new FileInputStream("myio/a.txt");
        FileOutputStream fos = new FileOutputStream("destination/a_copy.txt");
        try (fis; fos) {
        } catch (IOException e) {
        }
    }

    static void test12() {
        String str = "ai你哟";
        byte[] bytes1 = str.getBytes();
        System.out.println("Bytes 1 -> " + Arrays.toString(bytes1));
        String str1 = new String(bytes1);
        System.out.println("Str1 -> " + str1);
        try {
            byte[] bytes2 = str.getBytes("GBK");
            System.out.println("Bytes 2 -> " + Arrays.toString(bytes2));
            String str2 = new String(bytes2, "GBK");
            System.out.println("Str2 -> " + str2);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    static void test13() {
    }
}