public class Main {
    public static void main(String[] args) {

        int a = 10;
        Integer obj = a; // boxing
        int b = obj;     // unboxing

        System.out.println("Wrapper: " + obj);

        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer: " + sb);
    }
}