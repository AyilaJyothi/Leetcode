class Solution {
    public boolean reorderedPowerOf2(int n) {
        if(n<=0){
            return false;
        }
        if((n&(n-1))==0){
            return true;
        }
        else{
            String str=String.valueOf(n);
            // System.out.println(str.length());
            char[] ch=new char[str.length()];
            for(int i=0;i<str.length();i++){
                ch[i]=str.charAt(i);
            }
            Arrays.sort(ch);
            String s=String.valueOf(ch);
            for(int i=0;i<32;i++){
                int d=1<<i;
                char[] l=String.valueOf(d).toCharArray();
                Arrays.sort(l);
                String c=String.valueOf(l);
                if(c.equals(s)){
                    return true;
                }
                // return false;
            }
        }
        return false;
    }
}