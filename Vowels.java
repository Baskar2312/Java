import java.util.Scanner;
public class Vowels {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
            else if(str.charAt(i)=='e'){
                count++;
            }
            else if(str.charAt(i)=='i'){
                count++;
            }
            else if(str.charAt(i)=='o'){
                count++;
            }
            else if(str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}
