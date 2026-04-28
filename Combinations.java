import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(new Combinations().combine(n, k));
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),1,n,k);
        return res;
    }
    public void backtrack(List<List<Integer>> res,List<Integer> current,int start,int n,int k){
        if(current.size()==k){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=n;i++){
            current.add(i);
            backtrack(res,current,i+1,n,k);
            current.remove(current.size()-1);
        }
    }
}
