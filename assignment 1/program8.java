class MyException extends Exception {
    MyException(String msg){
        super(msg);
    }
}

class Bank {
    int balance = 500;

    void withdraw(int amt) throws MyException {
        if(amt > balance)
            throw new MyException("Low Balance");
        else
            balance -= amt;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(1000);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}