class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){ 
            int[] count = new int[26];

            for(char c : str.toCharArray()){ // ['e', 'a', 't'] 
                count[c - 'a']++; //count[e - a]++ count[4]++
            }

            String key = Arrays.toString(count); // [1,0,0,0,0.......1] --> "[1,0,0,0,0.......1]"
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str); // adding the value associated to the key
        }
        return new ArrayList<>(map.values());
    }
}
