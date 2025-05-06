import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Scratch {
    public static void main(String[] args) throws Exception {
        // test1();
        // test2();
        // test3();
        // test4();
        // test5();
        test6();
    }

    static void test1() throws IOException {
        int ch;
        FileReader fr = new FileReader("a.txt");
        ch = fr.read();
        System.out.println((char) ch);
        ch = fr.read();
        System.out.println((char) ch);
        ch = fr.read();
        System.out.println((char) ch + " -> " + ch);
        ch = fr.read();
        System.out.println((char) ch + " -> " + ch);
        ch = fr.read();
        fr.close();

        char ch2 = '哈';
        System.out.println(ch2);
    }

    static void test2() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a_copy.txt"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bis.close();
        bos.close();
    }

    static void test3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a_copy.txt"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bis.close();
        bos.close();
    }

    static void test4() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("a_copy.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        line = br.readLine();
        System.out.println(line);

        br.close();
        bw.close();
    }

    static void test5() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        bw.write("Hi, how are you doing?");
        bw.newLine();
        bw.close();
    }

    static void test6() {
    }

}