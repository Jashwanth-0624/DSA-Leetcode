// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int[] answer = new int[nums.length];

//         int prefix = 1;

//         for (int i = 0; i < nums.length; i++) {
//             answer[i] = prefix;
//             prefix *= nums[i];
//         }
//         int suffix = 1;

//         for (int i = nums.length - 1; i >= 0; i--) {
//             answer[i] *= suffix;
//             suffix *= nums[i];
//         }

//         return answer;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums){
        int[] answer = new int[nums.length];

        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            answer[i] = prefix;
            prefix *= nums[i]; // prefix = prefix * nums[i]
        }

        int suffix = 1;
        for(int i = nums.length - 1; i>=0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;

    }
}
 
//  i = 0, nums[i] = 1
//  answer = [1]
//  prefix = 1 * 1 = 1

//  i = 1, nums[i] = 2
//  answer = [1, 1, ]
//  prefix = 1 * 2 = 2

// i = 2, nums[i] = 3
// answer = [1, 1, 2,]
// prefix = 1 * 2 * 3 = 6

// i = 3, nums[i] = 4
// answer[i] = [ 1, 1, 2, 6]


// i = 3, answer[3] = 6
// 6 * 1 = 6
// 1 * 4 = 4

// i = 2, answer[2] = 2
// 2 * 4 = 8
// 4 * 3 = 12

// i = 1, answer[1] = 1
// 1 * 12 = 12
// 12 * 2 = 24

// i = 0, answer[0] = 1
// 1 * 24 = 24
// 24 * 1 = 24


























