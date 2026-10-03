class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Start counting only if this is the beginning
            // of a consecutive sequence.
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Set<Integer> set = new HashSet<>();

//         for( int num : nums){
//             set.add(num);
//         }
//         int longest = 0; 

//         for(int num : set){
//             if(!set.contains(num-1)){ // 100, 100 - 1? current =  100
//                 int current = num;
//                 int count = 1;

//                 while(set.contains(current + 1)){
//                     current++;
//                     count++;
//                 }
//                 longest = Math.max(longest, count); // Math.max(4, 4) longest = 4
//             }
//         }
//             return longest;
//         }
//     }

//     // [100, 4, 200, 201, 202, 1, 3, 2]


// // count = 4
// // longest = 4

// // count = 3
// // longest = 4

// //Math.max(4, 3) = 4





















