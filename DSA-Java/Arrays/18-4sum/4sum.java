class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1, r = n - 1;
                while (k < r) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[r];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[r]));

                        while (k < r && nums[k] == nums[k + 1]) k++;
                        while (k < r && nums[r] == nums[r - 1]) r--;

                        k++;
                        r--;
                    } 
                    else if (sum < target) {
                        k++;
                    } 
                    else {
                        r--;
                    }
                }
            }
        }
        return result;
    }
}
