class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>(); // make a HashMap of (int,int) pair
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int search=target-num;
            if(map.containsKey(search)){ //          search for the key (int,int) in the HashMap using containsKey function
                return new int[]{map.get(search),i};//                    ^
            }
            map.put(num,i); // If not found add the key value pairs into the map
        }
        return new int[2]; // return an empty array this way or (new int[]{})
    }
}
