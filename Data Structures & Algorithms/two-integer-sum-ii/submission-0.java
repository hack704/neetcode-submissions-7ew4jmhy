class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<numbers.length;i++){
            map.put(i,numbers[i]);
        }
        for(int i=0;i<numbers.length;i++){
            int res= target- map.get(i);
            if(map.containsValue(res)){
                for(Map.Entry<Integer,Integer> e:map.entrySet()){
                    if(e.getValue()==res){
                        return new int[]{i+1,e.getKey()+1};
                    }
                }
            }
        }
        return new int[]{};
    }
}
