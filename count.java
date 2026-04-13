import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The array list:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        s.close();
    }
}
