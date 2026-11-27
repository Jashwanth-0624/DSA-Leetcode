class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int num : nums){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            
        }
        return count;
    }
}


// i = 0
// sum = 1

// 1 - 3 = -2
// {0->1, 1->1, }

// i = 1
// 1 + 2 = 3 = sum

// 3 - 3
// map.get(0)
// count = 0 + 1 = 1
// {0->2, 1->1, 3->1 }

// i = 2
// sum = 3
// count  = 1

// sum = 3 + 3 = 6
// count = 1 + 1 = 2
// {0->2, 1->1, 3->1, 6->1 }

// return 2;




