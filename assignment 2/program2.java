class PC {
    int data;
    boolean flag = false;

    synchronized void produce(int val) throws Exception {
        if(flag) wait();
        data = val;
        System.out.println("Produced: " + val);
        flag = true;
        notify();
    }

    synchronized void consume() throws Exception {
        if(!flag) wait();
        System.out.println("Consumed: " + data);
        flag = false;
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        PC obj = new PC();

        new Thread(() -> {
            try { obj.produce(10); } catch(Exception e){}
        }).start();

        new Thread(() -> {
            try { obj.consume(); } catch(Exception e){}
        }).start();
    }
}