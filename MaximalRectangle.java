import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        System.out.println(new MaximalRectangle().maximalRectangle(matrix));
    }
    public int maximalRectangle(char[][] matrix) {
        int[] heights=new int[matrix[0].length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }
                else{
                    heights[j]=0;
                }
            }
            max=Math.max(max,largestRectangleArea(heights));
        }
        return max;
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] left=new int[heights.length];
        int[] right=new int[heights.length];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int current=heights[i];
            while(!st.isEmpty() && heights[st.peek()]>=current){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=0;i<n;i++){
            int current=heights[i];
            while(!st.isEmpty() && heights[st.peek()]>=current){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int area=heights[i]*width;
            max=Math.max(area,max);
        }
        return max;
    }
}
