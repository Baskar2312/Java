import java.util.Arrays;
import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums){
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }
}
