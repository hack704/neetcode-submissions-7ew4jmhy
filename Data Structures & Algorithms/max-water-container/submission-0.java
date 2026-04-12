class Solution {
    public int maxArea(int[] heights) {
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0; i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                set.add(Math.min(heights[i],heights[j])*(j-i));
            }
        }
        int area = Collections.max(set);
        return area;
    }
}
