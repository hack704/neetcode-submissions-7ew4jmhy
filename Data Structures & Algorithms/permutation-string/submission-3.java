class Solution {
    public boolean checkInclusion(String s1, String s2) {
        ArrayList<String> sub = new ArrayList<>();
        for(int i = 0; i<s2.length();i++){
            if(i+s1.length()<=s2.length()){
                sub.add(s2.substring(i,i+s1.length()));
            }
        }
       for(String el:sub){
        if(isPermutation(el,s1)){
            return true;
        }
       }
       return false;
    }

   private boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
}
