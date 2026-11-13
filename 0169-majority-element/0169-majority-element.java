class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }

            if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}

// //Boyer-Moore Voting Algorithm
// // [3, 2, 3]
// // 3, count = 1
// // 2, count = 0, 
// // Time : O(n)
// // Auxliary Space : O(1)
// // Total space : O(n)

// Dry run: 
//  i = 0
