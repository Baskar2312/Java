import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class Arraylist{
    public static void main(String[] args){
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(9);
        nums.add(8);
        nums.add(7);
        nums.add(6);
        System.out.print("Return the Value: ");
        System.out.println(nums.get(3));
        System.out.print("Return the index: ");
        System.out.println(nums.indexOf(7));
        System.out.print("Array values are: ");
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}       


