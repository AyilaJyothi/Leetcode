class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
        int a=salary[0];
        int b=salary[n-1];
        int c=a+b;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+salary[i];
        }
        sum=sum-c;
        return (double)sum/(n-2);
    }
}