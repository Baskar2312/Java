import java.util.HashMap;

public class LongestHarmonious {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(new LongestHarmonious().findLHS(nums));
    }
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxLen=0;
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                int currLen=map.get(key)+map.get(key+1);
                maxLen=Math.max(maxLen,currLen); 
            }
        }
        return maxLen;
    }
}
