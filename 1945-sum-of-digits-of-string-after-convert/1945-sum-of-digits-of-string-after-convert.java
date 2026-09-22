class Solution {
    public static int digitSum(int  num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int getLucky(String s, int k) {
        int reqnum=0;

        for(int i=0;i<s.length();i++){
            reqnum=reqnum+digitSum(s.charAt(i)-96);
        }
        for(int i=1;i<=k-1;i++){
            reqnum=digitSum(reqnum);
        }
        return reqnum;
    }
}