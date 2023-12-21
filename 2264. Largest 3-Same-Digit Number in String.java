class Solution { // 5ms Runtime
    public String largestGoodInteger(String nums) {
        for(int i=9;i>=0;i--){
            String fx=Integer.toString(i);
            fx+=fx+fx;
            int idx=nums.indexOf(fx);
            if(idx!=-1){
                return fx;
            }
        }
        return "";
    }
}

class Solution { // 0ms Runtime
    public String largestGoodInteger(String nums) {
        String[] str={"999","888","777","666","555","444","333","222","111","000"};
        for(int i=0;i<10;i++){
            if(nums.contains(str[i])) return str[i];
        }
        return "";
    }
}
