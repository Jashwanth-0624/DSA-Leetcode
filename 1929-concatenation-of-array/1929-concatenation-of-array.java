class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n ] = nums[i];
        }
        return ans;

    }
}

// [_ _ _ _ _ _]

// i = 0
// ans[0] = nums[0];
// ans[3] = nums[0];

// ans[0] = 1;
// ans[3] = 1

// [1, 0, 0, 1, 0, 0]
// [1, 2, 0, 1, 2, 0]
// [1, 2, 1, 1, 2, 1]
// O(2N)
// O(N)