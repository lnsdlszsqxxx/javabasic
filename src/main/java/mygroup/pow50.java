package mygroup;

public class pow50 {
    public static void main(String[] args) {

        System.out.println(myPow(2.0,-2));
        System.out.println(myPow(2.1,3));
    }

    public static double myPow(double x, int n) {

        double temp=x;

        if(n>0){
            for(int i=0;i<n-1;i++){
                x=x*temp;
            }
        }
        else {
            n=-n;
            for(int i=0;i<n-1;i++){
                x=x*temp;
            }
            x=1.0/x;
        }

        return x;
    }
}
