import java.util.Scanner;
public class Disariun {
    public static void main(String[] args){
        System.out.print("enter the num: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int count=0;
        int org=num;
        int temp=num;
        while(num!=0){
            num=num/10;
            count++;
        }
        int dis=0;
        while(temp!=0){
            int rem=temp%10;
            int ans=1;
            for(int i=1;i<=count;i++){
                ans*=rem;
            }
            dis+=ans;
            temp=temp/10;
            count--;
        }
        if(dis==org){
            System.out.println("Disarium number");
        }
        else{
            System.out.println("Not an Disarium number");
        }
        s.close();
    }
}
