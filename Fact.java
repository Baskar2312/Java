import java.util.Scanner;
public class Fact {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num<=0){
            System.out.print("1");
        }
        else{
            int fact=1;
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            System.out.print(fact);
        }
        s.close();
        
    }
} 