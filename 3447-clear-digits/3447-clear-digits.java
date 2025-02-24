class Solution {
    public String clearDigits(String s) {
        StringBuilder r=new StringBuilder();
        for(char i:s.toCharArray()){
            if(Character.isDigit(i)){
                if(r.length()>0){
                    r.deleteCharAt(r.length()-1);
                }
            }
            else{
                r.append(i);
                // System.out.println(r);
            }
        }
        return r.toString();
    }
}