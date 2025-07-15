class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int count=0;
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                mul = mul * nums[i];
            }
            else{
                count=count+1;
                if(count==1){
                    a=i;
                }
            }
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            if(count>1){
                arr[i]=0;
            }
            else if(count==1){
                Arrays.fill(arr,0);
                arr[a]=mul;
            }
            else{
                arr[i]=mul/nums[i];
            }
        }
        return arr;
    }
}