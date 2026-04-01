class Match {
    void type(){
        System.out.println("Cricket Match");
    }
}

class T20 extends Match {
    void overs(){
        System.out.println("20 Overs");
    }
}

public class Main {
    public static void main(String[] args) {
        T20 obj = new T20();
        obj.type();
        obj.overs();
    }
}