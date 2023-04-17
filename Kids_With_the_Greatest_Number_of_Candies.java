class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> str = new ArrayList<>();
        int[] candy = new int[candies.length];
        for (int i = 0; i < candies.length; i++) {
            candy[i] = candies[i];
        }
        Arrays.sort(candy);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= candy[candies.length - 1]) {
                str.add(true);
            } else {
                str.add(false);
            }
        }
        return str;
        
    }
}
