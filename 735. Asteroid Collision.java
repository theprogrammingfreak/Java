public class Solution {
    public int[] asteroidCollision(int[] a)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            if(st.isEmpty() || a[i]>0) //allowing only the positive asteroids into the stack
                st.push(a[i]);
            else{//checking if the tos is positive and the negative asteroid's magnitude is greater to calculate collision result
                while(!(st.isEmpty()) && st.peek()>0 && st.peek()<Math.abs(a[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(a[i])) st.pop();
                    else if(st.isEmpty() || st.peek()<0)
                        st.push(a[i]);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}
