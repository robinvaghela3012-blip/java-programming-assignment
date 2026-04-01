class Prime extends Thread {
    public void run(){
        for(int i=2;i<20;i++){
            boolean prime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime)
                System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Prime p = new Prime();
        p.start();
    }
}