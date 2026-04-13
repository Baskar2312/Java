import java.util.Scanner;
public class Trycatch{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number");
        int a=s.nextInt();
        System.out.print("Enter the number");
        int b=s.nextInt();
        try{
            int c=a/b;
            System.out.println("The final result is: "+c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Program ended.");
    }
}