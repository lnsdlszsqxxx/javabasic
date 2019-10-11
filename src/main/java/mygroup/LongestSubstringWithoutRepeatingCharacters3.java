package mygroup;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s1="abcabcbb";
        String s2="aaaaaaa";
        String s3="pwwkew";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength=1;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(!isRepeat(s,i,j)) maxLength=Math.max(maxLength,j-i+1);
                else break;
            }
        }

        return maxLength;
    }

    public static boolean isRepeat(String s,int start,int end){
        for(int i=start;i<=end;i++) {
            for(int j=i+1;j<=end;j++){
                if(s.charAt(i)==s.charAt(j)) return true;
            }
        }
        return false;
    }

}
