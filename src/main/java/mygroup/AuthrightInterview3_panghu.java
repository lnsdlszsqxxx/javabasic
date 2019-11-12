/**
 * 2019.10.29 3:30-4:30pm Authright Interview 3 with Jay Zheng and Victoria Zhang
 * You are going to write a Java program to simulate a betting strategy to guess the next coin toss.
 * Here is the strategy: if you ever see four consecutive heads or tails, you start betting, you will bet against the trend, i.e, if you see four heads, you'll bet next one is a tail. If you win, you'll stop and wait for the next "trend",  if you lose, you'll double your previous wage.
 * Suppose you start with $100, you'll start with $10 when you first see a "trend", whenever you win more than a $100 (i.e., your chip amount is more than $200), you can record a win, whenever you lost everything, you can record a loss.
 * You program should take a parameter of  how many times a user wants to run/play the game, the output how many times the user has won, and the percentage of winning using this strategy.
 * For debug, when asked, you should be able to print out a winning or a losing sequence like 'wwwwlllwwwwlww'...
 */

package mygroup;

import java.util.Random;

public class AuthrightInterview3_panghu {
    public static double winRate(int n){
        boolean[] res = new boolean[n];
        int win = 0;
        for(boolean i:res){
            i = mockGamble();
            if(mockGamble()==true){
                win++;
            }
        }
        System.out.println(win);
        return win*1.0/n;
    }
    public static double generateRandom(){
        Random rand = new Random();
        return rand.nextDouble();
    }
    public static boolean mockGamble(){
        int cash = 100;
        int count = 1;
        while(cash > 0 && cash <200){
            if(generateRandom()>=0.5){
                while(cash > 0 && cash <200) {
                    if(generateRandom()>=0.5){
                        cash -= Math.min(count * 10, cash);
                        if(cash==0) break;
                        count*=2;
                    }else{
                        cash += Math.min(count * 10, cash);
                        count=1;
                        break;
                    }
                }
            }else{
                while(cash > 0 && cash <200) {
                    if(generateRandom()<0.5){
                        cash -= Math.min(count * 10, cash);
                        if(cash==0) break;
                        count*=2;
                    }else{
                        cash += Math.min(count * 10, cash);
                        count=1;
                        break;
                    }
                }
            }
        }
        if(cash==0) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(winRate(10000));
    }
}
