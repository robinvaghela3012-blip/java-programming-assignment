import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");

        list.set(1,"C"); // update

        list.remove("A"); // delete

        for(String s: list)
            System.out.println(s);
    }
}