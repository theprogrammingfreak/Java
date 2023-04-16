import java.util.*;
public class Solution {
    public boolean validateStackSequences(int[] pushed,int[] popped)
    {
         Stack<Integer> s = new Stack<>();
        int i=0;
        for(int p:pushed){
            s.push(p);
            while(!s.isEmpty() && s.peek() == popped[i]){
                i++;
                s.pop();
            }
        }
        return s.isEmpty()?true:false;
    }
}
