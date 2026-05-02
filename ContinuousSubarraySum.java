import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k)); // Output: true
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }
            else{
                map.put(rem,i);
            }
        }
        return false;
    }
}
