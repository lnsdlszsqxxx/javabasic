package mygroup;

public class UniquePaths62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(7,3));
    }

    public static int uniquePaths(int m, int n) {
        int path=0;
        path=computePath(m,n,path);
        return path;
    }

    public static int computePath(int m,int n, int path){
        if(m<=0||n<=0) return 0;
        if(m==1||n==1) return 1;
        path = path+ uniquePaths(m-1,n) + uniquePaths(m,n-1);
        return path;
    }
}
