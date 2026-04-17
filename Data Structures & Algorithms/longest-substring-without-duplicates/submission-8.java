class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>uni=new HashMap<>();
        int left=0;
        int max=0;
        for (int i=0; i<s.length();i++){
            char op = s.charAt(i);
            if (uni.containsKey(op)){
                max=Math.max(max,i-left);
                left=Math.max(left,uni.get(op)+1);
            }
            uni.put(op,i);
        }
        return Math.max(max,s.length()-left);
    }
}
