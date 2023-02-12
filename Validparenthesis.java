public boolean isValid(String s) { //using stack
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}

public class Solution {// without using stack
    public boolean isValid(String s)
    {
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                int a=s.charAt(i);
                int b=s.charAt(j);
                if((a==40 && b==41) || (a==91 && b==93) || (a==123 && b==125)){
                if(i+1==(l-1) )
                    return true;
                }
                else if(a==41 || a==93 || a==125)
                continue;
            }
            
        }
        return false;
    }
}
