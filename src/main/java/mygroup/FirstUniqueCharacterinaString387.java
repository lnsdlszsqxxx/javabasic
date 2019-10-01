package mygroup;

public class FirstUniqueCharacterinaString387 {
    public static void main(String[] args) {

        String input = "leetcode";
        String input2 = "loveleetcode";
        String input3 = "aabbddccww";

        System.out.println(firstUniqChar(input));
        System.out.println(firstUniqChar(input2));
        System.out.println(firstUniqChar(input3));
    }

    public static int firstUniqChar(String s) {
        int n = s.length();
        int first=-1;
        int flag=1;

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j==i) continue;
                if(s.charAt(i)==s.charAt(j)) {flag=1;break;}
                flag=0;
            }

            if(flag==0) {first=i;break;}
        }

        return first;
    }
}
