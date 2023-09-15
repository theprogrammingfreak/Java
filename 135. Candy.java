class Solution {
    public int candy(int[] ratings) {
        int orgCount=0;
        // if(count==1) return count;
        int[] candyCount=new int[ratings.length];
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]) candyCount[i]=candyCount[i-1]+1;
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]) candyCount[i]=Math.max(candyCount[i+1]+1,candyCount[i]);
        }
        for(int can:candyCount){
            orgCount+=can+1;
        }
        return orgCount;
    }
}
