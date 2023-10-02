class Solution {
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
