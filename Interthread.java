class Q {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try { 
                wait(); 
            } catch (Exception e) {}
        }
        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {
            try { 
                wait(); 
            } catch (Exception e) {}
        }
        System.out.println("Get : " + num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

class Consumer implements Runnable {
    Q q;
    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

public class Interthread {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}


//In the put(int num) Method (Producer):

//Condition Check: The producer thread first checks if valueSet is true. If valueSet is true, this indicates that there is already a value in num that the consumer hasn't yet consumed. The producer must wait until the consumer retrieves this value.
//Setting the Value: Once valueSet becomes false (meaning the consumer has retrieved the previous value), the producer proceeds to set a new value in num.
//Flag Update and Notification: The producer sets valueSet to true (indicating a new value is ready for consumption) and calls notify() to wake up the waiting consumer.
//In the get() Method (Consumer):

//Condition Check: The consumer thread first checks if valueSet is false. If valueSet is false, it means there is no new value available in num, so the consumer must wait until the producer sets a value.
//Retrieving the Value: Once valueSet is true (meaning the producer has produced a new value), the consumer retrieves the value of num.
//Flag Update and Notification: After consuming the value, the consumer sets valueSet to false (indicating the value has been consumed) and calls notify() to wake up the waiting producer.