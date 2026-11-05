class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; 

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
//[_, 2, 2, _]
// [2, 2, _ _]

// i = 0

// 3!=3 //false

// i = 1
// 2!=3? //true

// nums[0] = nums[1]
// nums[0] = 2
// k = 1
// [2, ]

// i = 2
// nums[1] = 2
// [2, 2, _ , _]

// i = 3
// 3!=3// false

