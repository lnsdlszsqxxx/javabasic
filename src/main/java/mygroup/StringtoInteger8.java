package mygroup;

public class StringtoInteger8 {
    public static void main(String[] args) {

//        System.out.println(myAtoi("  -42 wdadf"));
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String str) {
        int n=str.length();
        int init=-1; //first non-space character flag.
        int end =0;
        int result=0;

        for(int i=0;i<n;i++){
            if(str.charAt(i)==' ') continue;
            if(init==-1) {init=i; continue;}
            if(!isNum(str.charAt(i))) break;


            if(init>=0&&isNum(str.charAt(i)))
            result=result*10+str.charAt(i)-'0';
            end = i;
        }

        if(str.charAt(init)=='-') result=-result;
        if(Long.valueOf(str.substring(init,end+1))>Integer.MAX_VALUE || Long.valueOf(str.substring(init,end+1))<Integer.MIN_VALUE) result=Integer.MIN_VALUE;
        return result;
    }

    public static boolean isNum(char input){
        int temp = input-'0';
        if(temp>=0&&temp<=9) return true;
        return false;
    }
}
