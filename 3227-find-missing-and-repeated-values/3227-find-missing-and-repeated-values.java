class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // ArrayList<Integer> arr=new ArrayList<>();
        int n=grid.length;
        int a=n*n;
        int s=(a*(a+1))/2;
        int[] arr=new int[a];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[k++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int h=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                h=arr[i];
            }
        }
        System.out.println(s);
        System.out.println(sum);
        s=s-sum;
        return new int[]{h,(h+s)};
    }
}