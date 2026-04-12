class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        for (String s : strs) {
            // Append length + '#' + actual string
            encoded.append(s.length()).append('#').append(s);
        }
        
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the delimiter '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Extract the length
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the actual string (starts after '#')
            String word = str.substring(j + 1, j + 1 + length);
            decoded.add(word);
            
            // Move to the next encoded string
            i = j + 1 + length;
        }
        
        return decoded;
    }
}