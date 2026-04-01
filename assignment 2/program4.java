import java.util.*;

class Book {
    int price;
    Book(int p){ price = p; }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(200));
        list.add(new Book(100));

        Collections.sort(list, (a,b) -> a.price - b.price);

        for(Book b : list)
            System.out.println(b.price);
    }
}