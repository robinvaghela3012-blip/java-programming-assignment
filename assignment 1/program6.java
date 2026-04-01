abstract class Cipher {
    abstract void encrypt(String s);
}

class SimpleCipher extends Cipher {
    void encrypt(String s){
        String res = "";
        for(char c : s.toCharArray()){
            res += (char)(c + 1);
        }
        System.out.println("Encrypted: " + res);
    }
}

public class Main {
    public static void main(String[] args) {
        Cipher c = new SimpleCipher();
        c.encrypt("abc");
    }
}