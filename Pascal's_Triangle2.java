class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        if(numRows==0)
        {
            prev.add(1);
            return prev;
        }
        if (numRows <= 0) return prev;
        
        prev.add(1);
        output.add(prev);
        for (int i = 2; i <= numRows+1; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);    
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));    
            }
            curr.add(1);    
            output.add(curr);
            prev = curr;
        }
        return output.get(numRows); 
    }
}
