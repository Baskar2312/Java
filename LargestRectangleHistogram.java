import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(new LargestRectangleHistogram().largestRectangleArea(heights));
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