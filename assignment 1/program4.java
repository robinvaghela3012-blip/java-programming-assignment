class Bank {
    int balance = 1000;

    void deposit(int amt){
        balance += amt;
    }

    void withdraw(int amt){
        if(amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }

    void show(){
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(500);
        b.withdraw(200);
        b.show();
    }
}