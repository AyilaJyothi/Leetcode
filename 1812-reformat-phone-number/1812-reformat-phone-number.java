class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)>=48 && number.charAt(i)<=57){
                sb.append(number.charAt(i));
            }
        }
        int a=sb.length();
        StringBuilder sb1=new StringBuilder();
        if(a%3==0){
            int g=(a/3)-1;
            int j=0;
            for(int i=0;i<a;i++){
                sb1.append(sb.charAt(i));
                if((i+1)%3==0 && i!=a-1){
                    sb1.append("-");
                }
            }
        }
        else if(a%3==1){
            int z=a-4;
            for(int i1=0;i1<z;i1++){
                sb1.append(sb.charAt(i1));
                if((i1+1)%3==0){
                    sb1.append("-");
                }
            }
            for(int j1=z;j1<a;j1++){
                 sb1.append(sb.charAt(j1));
                if (j1 == z + 1) {
                    sb1.append("-");
                }
            }
        }
        else{
            int z=a-2;
            for(int i1=0;i1<z;i1++){
                sb1.append(sb.charAt(i1));
                if ((i1 + 1) % 3 == 0) {
                    sb1.append("-");
                }
            }
            for (int j1 = z; j1 < a; j1++) {
                sb1.append(sb.charAt(j1));
            }
        }
        return sb1.toString();
    }
}