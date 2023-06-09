class Solution {
    public int countCollisions(String directions) {
        char[] arr = directions.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < arr.length && arr[left] == 'L') {
            left++;
        }
        while (right >= 0 && arr[right] == 'R') {
            right--;
        }
        if (left >= right) {
            return 0;
        }
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (arr[i] != 'S') {
                count++;
            }
        }
        return count;
    }
}
