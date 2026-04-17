class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>check=new HashMap<>();
        int left=0;
        int freq=0;
        int max=0;
        for (int i=0; i<s.length();i++){
            check.put(s.charAt(i),check.getOrDefault(s.charAt(i),0)+1);
            freq=Math.max(freq,check.get(s.charAt(i)));
            while ((i-left+1-freq)>k){
                check.put(s.charAt(left),check.get(s.charAt(left))-1);
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}

