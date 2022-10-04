class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []le = new int[n];
        int []ri = new int[n];
        int []ans = new int[n];
        int temp=1;
        for(int i=0;i<n;i++){
            temp *= nums[i];
            le[i] = temp;
        }
        temp=1;
        for(int i=n-1;i>=0;i--){
            temp *= nums[i];
            ri[i] = temp;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                ans[i] = ri[1];
            }
            else if(i==n-1){
                ans[i] = le[n-2];
            }
            else{
                ans[i] = le[i-1]*ri[i+1];
            }
        }
        return ans;
    }
}
