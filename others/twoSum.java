class twoSum {
    public static int[] twoSum(int[] nums, int target) {

        int max = nums.length;

        for (int i = 0; i < max; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < max; j++) {
                if (nums[j] == diff) {
                    return new int[] { i, j };#from leetcode
                }
            }
        }
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int tar = 3;
        twoSum(arr, tar);
    }
}
