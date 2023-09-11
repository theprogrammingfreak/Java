class Solution {
    public List<Integer> spiralOrder(int[][] a) {
       List<Integer> ans=new ArrayList<>();
        int rs=0,re=a.length-1;
        int cs=0,ce=a[0].length-1;
        while(rs<=re && cs<=ce) {
            for (int i = cs; i < ce; i++) ans.add(a[rs][i]);
            for (int i = rs; i < re; i++) ans.add(a[i][ce]);
            for (int i = ce; i > cs; i--) ans.add(a[re][i]);
            for (int i = re; i > rs; i--) ans.add(a[i][cs]);
            rs++;
            cs++;
            re--;
            ce--;
        }
        if(a.length==a[0].length && a.length%2!=0) {
            int mid=a.length/2;
            ans.add(a[mid][mid]);
        }
        while(ans.size()!=a.length * a[0].length) ans.remove(ans.size()-1);
        return ans;
    }
}
