class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> arr=new ArrayList<>();
        String s=String.valueOf(x);
        for(int i=0;i<n;i++){
            if(words[i].contains(s)){
                arr.add(i);
            }
        }
        return arr;
    }
}