package mygroup;

import javax.xml.soap.DetailEntry;
import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees96 {
    public static void main(String[] args) {

        System.out.println(numTrees(10));
        System.out.println(numTrees2(10));
        System.out.println(numTrees3(10));

        }

        public static int numTrees(int n) {
            if(n==0) return 0;
            if(n==1) return 1;
            int result = numTrees(n-1)*2;
            for (int left=1;left<n-1;left++){
                result = result + numTrees(left)*numTrees(n-1-left);
        }

        return result;
    }

    public static int numTrees2(int n) {
        int[] dp = new int[n+1];

        dp[0] = 1;  // 为了计算左子树或右子树为空的情况

        // 构造动态规划的子问题解
        for (int j = 1; j <= n; j++) {
            // 依次将序列中的节点作为根
            for (int i = 1; i <= j; i++) {
                dp[j] += dp[i-1] * dp[j-i];
            }
        }

        return dp[n];
    }

    public static int numTrees3(int n) {

        return count(n,new int[n+1]);
    }

    public static int count(int n,int strg[]){
        if(n<=1){
            return 1;
        }
        if(strg[n]!=0){
            return strg[n];
        }
        int sum=0;

        for(int i=1;i<=n;i++){
            int lp=count(i-1,strg);
            int rp=count(n-i,strg);
            sum+=lp*rp;
        }
        strg[n]=sum;
        return sum;
    }

}

