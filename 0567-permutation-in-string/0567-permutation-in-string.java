class Solution {
    public Boolean sort(String x,String sorts1){
        char[] arr1=x.toCharArray();
        Arrays.sort(arr1);
        String sorts2=new String(arr1);
        if(sorts1.equals(sorts2)){
            return true;
        }
        return false;
    }
    public boolean checkInclusion(String s1, String s2) {
        int a=s1.length();
        int b=s2.length();
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        String sorts1=new String(arr1);
        int i=0;
        int j=s1.length()-1;
        while(j<s2.length()){
            String x=s2.substring(i,j+1);
            if(sort(x,sorts1)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}