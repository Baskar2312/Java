public class Lambdarunnablethread{
    public static void main(String[] args){
        Runnable obj1=()->{
            for(int i=0;i<10;i++){
                System.out.println("Hello!");
            }
            try{
                Thread.sleep(30);
            }catch(Exception e){
                System.out.println(e);
            }
        };
        Runnable obj2=()->{
            for(int i=0;i<10;i++){
                System.out.println("Bye!");
            }
            try{
                Thread.sleep(30);
            }catch(Exception e){
                System.out.println(e);
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(10);
        }catch(Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}