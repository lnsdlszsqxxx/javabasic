package mygroup;

public class FourSum454 {
    public static void main(String[] args) {
        int[] A={1,2};
        int[] B={-2,-1};
        int[] C={-1,2};
        int[] D={0,2};

        int result=fourSumCount(A,B,C,D);
        System.out.println(result);
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int counter=0;
        int n=A.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    for(int t=0;t<n;t++){
                        if (A[i] + B[j] + C[k] + D[t]==0){
                            counter++;
                            System.out.println(A[i]+" "+B[j]+" "+C[k]+" "+D[t]);
                        }
                    }
                }
            }
        }

        return counter;
    }
}
