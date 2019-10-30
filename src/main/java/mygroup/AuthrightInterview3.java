/**
 * 2019.10.29 3:30-4:30pm Authright Interview 3 with Jay Zheng and Victoria Zhang
 * You are going to write a Java program to simulate a betting strategy to guess the next coin toss.
 * Here is the strategy: if you ever see four consecutive heads or tails, you start betting, you will bet against the trend, i.e, if you see four heads, you'll bet next one is a tail. If you win, you'll stop and wait for the next "trend",  if you lose, you'll double your previous wage.
 * Suppose you start with $100, you'll start with $10 when you first see a "trend", whenever you win more than a $100 (i.e., your chip amount is more than $200), you can record a win, whenever you lost everything, you can record a loss.
 * You program should take a parameter of  how many times a user wants to run/play the game, the output how many times the user has won, and the percentage of winning using this strategy.
 * For debug, when asked, you should be able to print out a winning or a losing sequence like 'wwwwlllwwwwlww'...
 */

package mygroup;

public class AuthrightInterview3 {
    public static void main(String[] args) {
        int numberOfGames=10000; //a parameter of how many times a user wants to run/play the game
        int numberOfWin=0;  //when total money is >= 200, that is a win.
        int numberOfLose=0; //when total money is <= 0, that is a lose.
                            //numberOfWin + numberOfLose = numberOfGames.

        for(int i=0;i<numberOfGames;i++) {

            int total=100; //for each game, we have $100 at the beginning.
            boolean bet=false;  //if we find four consecutive heads or tails (i.e. a "trend"), we set bet to be true.
            int numberOfHead=0; //number of consecutive heads
            int numberOfTail=0; //number of consecutive tails
            int currentBet=10;  //when we find a "trend", we start betting from $10 for the opposite side of the trend.
                                //If we win, we get the amount of money of currentBet and wait for the next trend.
                                //If we lose, we lose currentBet and we immediately bet for the next round with money of 2*currentBet.
                                //If currentBet is more than total, then currentBet=total.
            double randomNumber=-1.0; //uniformly distributed between 0.0 and 1.0, randomNumber<0.5 means head, randomNumber>=0.5 means tail.

            while (total > 0 && total < 200) { //we keep betting if 0<total<200

                randomNumber=random(); //get a random number to simulate flipping a coin.

                bet=numberOfHead==4||numberOfTail==4?true:false; //whether we bet or not

                if(!bet) {

                        if (randomNumber < 0.5) { //if coin is head
                            numberOfHead++;
                            numberOfTail=0; //if we don't have a trend yet, reset tail when we get a head. If tail is already 0, it does not matter we reset again.
                        }
                        else { //if coin is tail
                            numberOfTail++;
                            numberOfHead=0; //if we don't have a trend yet, reset head when we get a tail. If head is already 0, it does not matter we reset again.
                        }

                }

                else {

                    //if we get four heads, then we bet tail (randomNumber >= 0.5). Therefore, if the current one is still head (randomNumber < 0.5), we lose
                    //if we lose, we don't need to count the number of head, so numberOfHead is still 4 for the next bet.
                    if(numberOfHead==4 && randomNumber < 0.5) { //if we lose
                        total-=currentBet;
                        currentBet=Math.min(total,currentBet*2); //reset bet for the next round
                        continue;
                    }

                    //similar to above, but for tail case
                    if(numberOfTail==4 && randomNumber >= 0.5) {
                        total-=currentBet;
                        currentBet=Math.min(total,currentBet*2);
                        continue;
                    }

                    //When the code comes here, it means we win (for head or tail it doesn't matter.)
                    total+=currentBet;
                    currentBet=10; //reset currentBet if we win
                    numberOfHead=0;
                    numberOfTail=0;

                }

            }

            //when the game ends, save records
            if(total<=0){
                System.out.print("l");
                numberOfLose++;
            }
            else {
                System.out.print("w");
                numberOfWin++;
            }

        }

        System.out.println();
        System.out.println("numberOfGames = "+numberOfGames+", numberOfLose = "+numberOfLose+", numberOfWin = "+ numberOfWin);
        System.out.println("Percentage of winning (numberOfWin/numberOfGames) = "+numberOfWin*1.0/numberOfGames);

    }

    public static double random(){
        return Math.random();
    }

}
