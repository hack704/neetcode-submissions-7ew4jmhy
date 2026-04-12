class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(i, nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){  // Fixed: was j < nums.length-1
                int target = -(map.get(i) + map.get(j));  // We need third number
                
                if(map.containsValue(target)){
                    for(Map.Entry<Integer, Integer> e : map.entrySet()){
                        // Check if it's the target and not same index
                        if(e.getValue() == target && e.getKey() != i && e.getKey() != j){
                            List<Integer> triplet = Arrays.asList(map.get(i), map.get(j), e.getValue());
                            Collections.sort(triplet);  // Sort to avoid duplicates like [0,-1,1] and [-1,0,1]
                            set.add(triplet);
                        }
                    }
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}