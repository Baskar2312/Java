import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(new PascalsTriangle().generate(numRows));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int val=li.get(i-1).get(j-1)+li.get(i-1).get(j);
                    row.add(val);
                }
            }
            li.add(row);
        }
        return li;
    }
}
