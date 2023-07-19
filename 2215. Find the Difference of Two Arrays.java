class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>(); // Create our List and initialize two empty arrays within it
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        HashSet<Integer> set1=new HashSet<>(); // Create two hashsets which only takes unique elements
        HashSet<Integer> set2=new HashSet<>();

        for(int num:nums1) set1.add(num); //Store the given arrays in the sets
        for(int num:nums2) set2.add(num);

        for(int num:set1)
        {
            if(!(set2.contains(num))) ans.get(0).add(num); //If the element is not present in the second set then add the curret element in the array
        }

        for(int num:set2)
        {
            if(!(set1.contains(num))) ans.get(1).add(num); // If the element in not present in the first set then add the current element in the array
        }
         return ans; // Return answer
    }
}
