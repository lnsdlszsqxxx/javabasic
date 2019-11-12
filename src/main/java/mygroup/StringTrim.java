//trim a String, so the substring contains all the letters in the String.
//only need to return the length of the String.

package mygroup;

public class StringTrim {
    public static void main(String[] args) {

        String input = "abdbacc";
        String input2 = "abcdef";
        System.out.println(StringTrim(input));
        System.out.println(StringTrim(input2));
    }

    public static int StringTrim(String s){
        int[] flag = new int[26];

        setFlag(s,flag);

        for(int window=1;window<s.length();window++){
            for(int i=0;i<s.length()-window;i++){
                String subs = s.substring(i,i+window);
                if(subContainsAllLetters(flag,subs)) return window;
            }
        }
        return s.length();
    }

    public static void setFlag(String s, int[] flag){
        for(int i=0;i<s.length();i++){
            flag[s.charAt(i)-'a']=1;
        }
    }

    public static boolean subContainsAllLetters(int[] flag, String subs){
        int[] subFlag=new int[26];
        setFlag(subs,subFlag);
        for (int i=0;i<flag.length;i++){
            if(flag[i]!=subFlag[i]) return false;
        }
        return true;
    }
}
