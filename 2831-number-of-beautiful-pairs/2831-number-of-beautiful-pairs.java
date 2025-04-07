class Solution {
    public static int Gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int First(int num1){
        while(num1>=10){
            num1=num1/10;
        }
        return num1;
    }
    public static int last(int num2){
        while(num2>=10){
            num2=num2%10;
        }
        return num2;
    }
    public int countBeautifulPairs(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int o=nums[i];
                int p=nums[j];
                if(Gcd(First(o),last(p))==1){
                    System.out.println(nums[i]);
                    System.out.println(nums[j]);
                    c=c+1;
                }
            }
        }
        return c;
    }
}