class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int s=0;
        while(num!=0){
            int temp=num%10;
            s=s+temp;
            num=num/10;
        }
        return addDigits(s);
    }
}