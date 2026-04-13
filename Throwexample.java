import java.util.Scanner;
public class Throwexample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        try{
            System.out.print("Enter the age: ");
            int age=scan.nextInt();
            if(age<1){
                throw new ArithmeticException("Age should be greater than 1.");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Program Ended.");
    }
}