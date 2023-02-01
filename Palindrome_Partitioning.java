class Solution {
    public List<List<String>> partition(String s) {
        List<String> st=new ArrayList<>();
        Partitioning(s,st);
        return str;
    }
    List<List<String>> str=new ArrayList<>();
    public void Partitioning(String ques,List<String> st)
    {
        if(ques.length()==0){
            str.add(new ArrayList<>(st));
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String part=ques.substring(0,i);
            boolean flag=true;
            int j = part.length() - 1;
            int stt =0;
            while (stt<j) {
                if(part.charAt(stt) != part.charAt(j))
                {
                    flag=false;
                    break;
                }
                stt++;
                j--;
            }
            if (flag){
                st.add(part);
                Partitioning(ques.substring(i),st);
                st.remove(st.size()-1);
            }
        }
    }
}
