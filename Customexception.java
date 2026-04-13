import java.util.Scanner;
class NotValidException extends Exception{
    public NotValidException(String s){
        super(s);
    }
}
public class Customexception{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=scan.nextInt();
        try{
            if(age<18){
              throw new NotValidException("Your age must be greater than 18.");
            }
        }
        catch(NotValidException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("You may be allowed for the party.");
    }
}