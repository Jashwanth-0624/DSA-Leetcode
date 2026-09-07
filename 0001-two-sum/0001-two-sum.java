class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map <Integer,Integer> map=new HashMap<>(); // <key-> integer, value->integer> , number->index

    for(int i=0;i<nums.length;i++){

      //subtracting target and nums[i]
      int remainder=target-nums[i];

      //checking if the remainder is alreday in the hashmap
      if(map.containsKey(remainder)){
        //if it is present,return the index of the remainder and the current number index
        return new int[]{map.get(remainder),i};
      }
      //else add the current number and its index to the hashmap
      map.put(nums[i],i);
    } 
    //return an empty array if no solution is found(this case won't occur as per the problem constraint)
    return new int[] {};   
  }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
                
//                 if (nums[i] + nums[j] == target) { 
//                     return new int[]{i, j};
//                 }
//             } 1, 2
//         }
        
//         return new int[]{}; // not in our case
//     }
//     }
// Time Complexity  = O(n^2)
// Space Complexity = O(1)

// Hashmap

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for(int i = 0; i<nums.length; i++){
//             int rem = target - nums[i];

//             if(map.containsKey(rem)){
//                 return new int[]{map.get(rem), i};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{};
//     }
// }






// 2, 7, 11 , 15 - containsKey
// map.get - 1(7)

// 2 -> 0















