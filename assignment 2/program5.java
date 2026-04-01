import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File f = new File("test.txt");
        Scanner sc = new Scanner(f);

        int count = 0;
        while(sc.hasNext()){
            sc.next();
            count++;
        }
        System.out.println("Words: " + count);
    }
}