import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Setexample{
    public static void main(String[] args){
        Set<Integer> nums=new TreeSet<Integer>();
        nums.add(9);
        nums.add(8);
        nums.add(7);
        nums.add(6);
        Iterator<Integer> values=nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
