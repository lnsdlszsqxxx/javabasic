//https://leetcode.com/problems/custom-sort-string/description/
package mygroup;

public class CustomSortString791 {
    public static void main(String[] args) {
        String s="hij";
        String t="dbabcbienfosdfadfewfsdfkjaohirgwaefaoijfaskdfjpqoqzmnvaskfiakjdfqwoeifha";

        System.out.println(customSortString(s,t));
    }

    public static String reorder(String s, String t){
        boolean isExixt=false;
        int counter=0;
        char temp;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for (int i=0;i<tChar.length;i++) {
            isExixt = match(tChar[i], s);
            if (isExixt) {
                temp = tChar[counter];
                tChar[counter] = tChar[i];
                tChar[i] = temp;
                counter++;
            }
        }

        if(counter>0) sort(tChar,0,counter-1);

        String output=new String(tChar);

        return output;
    }

    public static boolean match(char char1, String string1) {

        char[] sChar = string1.toCharArray();

        for (int i=0;i<sChar.length;i++){
            if(char1==sChar[i]) return true;
        }
        return false;
    }

    public static void sort(char[] input, int i1, int i2){

    }

    public static String customSortString(String S, String T) {
       int sLength = S.length();
       int tLength = T.length();
       if (sLength ==0 | tLength == 0) return "";

       StringBuilder sb = new StringBuilder();
       int[] sMap=new int[26];
       int[] tMap=new int[26];
       for (int i=0;i<S.length();i++){
           sMap[S.charAt(i)-'a']=1;
       }

        for (int i=0;i<T.length();i++){
            if(sMap[T.charAt(i)-'a']==0) sb.append(T.charAt(i));
            else tMap[T.charAt(i)-'a']++;
        }

        int count=0;
        for (int i=0;i<S.length();i++){
            count=tMap[S.charAt(i)-'a'];

            while (count>0){
                sb.append(S.charAt(i));
                count--;
            }
        }

        return sb.toString();
    }

}
