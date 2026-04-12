class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
             List<List<String>> result = new ArrayList<>();
             boolean[] used = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(used[i]){
                continue;
            }
            List <String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i]=true;
            for(int j =i+1;j<strs.length;j++){
                if(used[j]){
                    continue;
                }
                int count[]=new int[26];
                if(strs[i].length()!=strs[j].length()){
                    continue ;
                }
                for(int k=0;k<strs[i].length();k++){
                    count[strs[i].charAt(k)-'a']++;
                    count[strs[j].charAt(k)-'a']--;
                }
                boolean isAnagram=true;
                for(int l=0;l<count.length;l++){
                    if(count[l]!=0){
                        isAnagram= false;
                        break;
                    }
                }
                if(isAnagram){
                   group.add(strs[j]);
                   used[j]=true;
                }
            }
            result.add(group);
        }
        return result;
    }
}
