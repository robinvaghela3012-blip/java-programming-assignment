import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:/");

        String[] files = f.list();

        for(String s : files)
            System.out.println(s);
    }
}