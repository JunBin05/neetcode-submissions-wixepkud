class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        for (int i=0; i<(s.length()+1)/2;i++){
            char first = s.charAt(i);
            char last = s.charAt(s.length()-1-i);
            if (first!=last){
                return false;
            }
        }
        return true;
    }
}
