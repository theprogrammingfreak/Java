class Solution {
    public int calPoints(String[] operations)
    {
        int sum=0;
        int j=0;
        int[] records=new int[operations.length];
        for(int i=0;i<operations.length;i++)
        {
            if(Character.isDigit(operations[i].charAt(0)))
            {
                records[j]=Integer.parseInt(operations[i]);
                j++;
            }
            else if(operations[i].charAt(0)=='D')
            {
                records[j]=(2*records[j-1]);
                j++;
            }
            else if(operations[i].charAt(0)=='C')
            {
                --j;
                records[j]=0;
            }
            else if(operations[i].charAt(0)=='+')
            {
                records[j]=records[j-1]+records[j-2];
                j++;
            }
            else 
            {
               records[j]=Integer.parseInt(operations[i]);
                j++;
            }
        }
        for(int num:records)
        {
            sum=sum+num;
        }
        return sum;
    }
}
