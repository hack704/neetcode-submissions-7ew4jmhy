class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer>count = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e:count.entrySet()){
            array.add(e.getKey());
        }
        Collections.sort(array, (a, b) -> count.get(b) - count.get(a));
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = array.get(i);
        }
        
        return result;
        
    }
}
