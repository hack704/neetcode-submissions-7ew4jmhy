class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        str = str.trim();
        String regex = "[\\s!?,._'@:]+";
        String [] arr = str.split(regex);
        String strJoin = String.join("",arr);
        String reverse = new StringBuilder(strJoin).reverse().toString();
        return strJoin.equals(reverse);
     
    }
}
