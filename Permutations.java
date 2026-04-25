import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new Permutations().permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backtrack(res,new ArrayList<>(),nums,used);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> current,int[] nums,boolean[] used){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            current.add(nums[i]);
            backtrack(res,current,nums,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}
