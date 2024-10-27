class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        char c;
        int i=0;
        int count=0;
        while(i!=s.length()){
            c=s.charAt(i);
            if(i<s.length()-1 && map.get(c)<map.get(s.charAt(i+1))){
                count+=map.get(s.charAt(i+1))-map.get(c);
                i=i+2;
            }
            else{
                count+=map.get(c);
                i=i+1;
            }
        }
        return count;
    }
}