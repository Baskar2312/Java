class A extends Thread{
    int j=0;
    public void run(){
        for(int i=0;i<10;i++){
            j=i;
        }
    }
}

public class Jointhread{
    public static void main(String[] args){
        A a1=new A();
        a1.start();
        try{
            a1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(a1.j);
    }
}