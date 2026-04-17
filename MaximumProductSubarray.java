public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        int maxProduct=Integer.MIN_VALUE;
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
            maxProduct=Math.max(product,maxProduct);
            if(product==0){
                product=1;
            }
        }
        System.out.println(maxProduct);
    }
}
