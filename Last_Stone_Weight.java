class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        Arrays.sort(stones);
        int n = stones.length;
        while(stones[n - 2] > 0){
            int diff = stones[n - 1] - stones[n - 2];
            stones[n - 2] = 0;
            stones[n - 1] = diff;
            Arrays.sort(stones);
        }
        return stones[n - 1];
    }
}
