class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> st=new ArrayList<>();
        combine(n,k,st,0);
        return str;
    }
    List<List<Integer>> str=new ArrayList<>();
    public void combine(int n,int k,List<Integer> st,int idx)
    {
        if(st.size()==k){
            str.add(new ArrayList<>(st));
            return;
        }
        for(int j=idx+1;j<=n;j++)
        {
            st.add(j);
            combine(n,k,st,j);
            st.remove(st.size()-1);
        }

    }
        
    }
