class Solution {
   public List<Integer> selfDividingNumbers(int left, int right)
        {
            List<Integer> ans=new ArrayList<>();
            while(left<=right)
            {
                if(left<10 || dividing(left)) {
                    ans.add(left);
                }
                left++;
            }
            return ans;
        }
        public boolean dividing(int num)
        {
            int original=num;
            while(num>0)
            {
                int lst=num%10;
                if(lst==0 || !(original % lst==0)) return false;
                num=num/10;
            }
            return true;
        }
}
