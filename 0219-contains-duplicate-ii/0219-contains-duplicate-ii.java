class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) { // getting the value of the index

                int previousIndex = map.get(nums[i]); // if it already exixts, get the index of the prev index of the number, like when it was last seen

                if (i - previousIndex <= k) { // main part
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }
}

// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         Set<Integer> set = new HashSet<>();

//         for (int i = 0; i < nums.length; i++){
//             if(set.contains(nums[i])){
//                 return true;
//             }
//             set.add(nums[i]);
//             if(set.size() > k){
//                 set.remove(nums[i - k]);
//             }
//         }
//         return false;
//     }
// } // Hashset + sliding window. [1, [0, 1, 1]



// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for(int i = 0; i < nums.length; i++){
//             if(map.containsKey(nums[i])){
//                 int prevIndex = map.get(nums[i]);

//                 if(i - prevIndex <= k){
//                 return true;
//             }
//         }
//             map.put(nums[i], i);
            
//         }
//         return false;
//     }
// }


        
  
        


























