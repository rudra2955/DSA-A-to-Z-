class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];
                    if (a + b > c && a + c > b && b + c > a) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
