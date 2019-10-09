package mygroup;

public class WildcardMatching44 {
    public static void main(String[] args) {
        String s = "abcdefg";
        String p = "a?cdefg";

        System.out.println(isMatch(s,p));

    }

    public static boolean isMatch(String s, String p) {

        int ns=s.length();
        int np=p.length();

        if(ns==0&&np==0) return true;
        if(ns==0&&np!=0&&p.charAt(0)!='*') return false;
        if(ns!=0&&np==0) return false;

        int is=0;

        for (int i = 0; i < np; i++) {
            if (p.charAt(i)=='?') {is++;continue;}

            if (p.charAt(i)=='*') {
                if(i==np-1) break;
                is=findIndex(p.charAt(i+1),s,is);
                if(is<0) return false;
                continue;
            }

            if(isLetter(p.charAt(i))){
                if(p.charAt(i)!=s.charAt(is++)) return false;
            }

        }

        return true;
    }

    public static boolean isLetter(char c){
        if(c-'a'>=0&&c-'a'<=26) return true;
        return false;
    }

    public static int findIndex(char c, String s,int currentIndex){
        int output=-1;
        for(int i=currentIndex;i<s.length();i++){
            if(s.charAt(i)==c) {output=i;break;}
        }
        return output;
    }
}
