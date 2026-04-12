class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList <Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int maxLength=1;
        int currentLength=1;
       
        
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)-list.get(i)==1){
                currentLength++;
                maxLength = Math.max(maxLength,currentLength);
            }
            else{
                currentLength=1;
            }
           
        }

        return maxLength;

    }
}
