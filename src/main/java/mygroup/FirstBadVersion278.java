package mygroup;

public class FirstBadVersion278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(7));

    }

    public static int firstBadVersion(int n) {

        int l=1;
        int r=n;

        while (l<r) {
            int m = (l + r) / 2;
            if (isBadVersion(m)) r = m;
            else l = m+1;
        }

        return l;
    }

    public static boolean isBadVersion(int version){
        if(version<4) return false;
        return true;
    }
}
