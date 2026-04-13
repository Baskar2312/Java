class A implements Runnable{
    public void run(){
        System.out.println("This is Runnable interface.");
    }
}

public class Threadrunnable{
    public static void main(String[] args){
        A obj=new A();
        Thread t = new Thread(obj);
        t.start();
    }
}