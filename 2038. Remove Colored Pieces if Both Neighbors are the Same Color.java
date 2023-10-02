1.class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors.length()<3) return false;
        String[] A=colors.split("B+");
        String[] B=colors.split("A+");
        int Acount=0,Bcount=0;
        for(String s:A){
            if(s.length()<3) continue;
            else{
                Acount+=s.length()-2;
            }
        }
        for(String s:B){
            if(s.length()<3) continue;
            else{
                Bcount+=s.length()-2;
            }
        }
        return Acount > Bcount;
    }
}

2.class Solution { //Efficient
    public boolean winnerOfGame(String colors) {
        int Acount=0,Bcount=0;
        int A=0,B=0;
        for(char c:colors.toCharArray()){
            if (c == 'A') {
                B=0;
                A++;
                if(A>=3) Acount++;
            }
            else{
                A=0;
                B++;
                if(B>=3) Bcount++;
            }
        }
        return Acount > Bcount;
    }
}
