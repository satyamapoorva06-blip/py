class Solution {
    public double trimMean(int[] arr) {
        
        Arrays.sort(arr);
        int n=arr.length;
        int x=n/20;

        double sum =0;

        for(int i=x;i<n-x;i++){
            sum=sum+arr[i];
        }
         return sum/(n-2 *x);
}
}