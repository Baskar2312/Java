import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
        if(num==0){
            System.out.println("0");
        }
        else{
            for(int i=2;i<=num;i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
        }
        System.out.println(n3);
    }
}
