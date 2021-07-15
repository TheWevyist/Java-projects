/* Kevin Sims
   This program is designed to let a user play "Rock, Paper, Scissors"
   against the computer, which will use a random number generator to
   play against the user. At the end, how many games were won, lost, or
   tied will be printed for the user's benefit.
*/
import java.util.*; //for the Scanner and Random class

class GameKS{
   public static void main(String [] args){
      
      //objects and variables
      Scanner kb = new Scanner(System.in);
      Random shoot = new Random();
      int human, baron, humanWins = 0, baronWins = 0, tie = 0, nitwit = 0;
      boolean check = true;
      
      //intro and user input
      System.out.println("I AM BARON VON CRAVENSWORTH, MASTER OF GAMES! Let's play Rock, Paper, Scissors! CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
      human = kb.nextInt();
      kb.nextLine();
      
      while(check){
         if(human==0){ //exits program
            check = false;
         } else if(human<1 || human>3){ //invalid input
            nitwit++;
            System.out.println("SNAKE! Play with honor or be banished to the wastes! NOW CHOOSE:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
            human = kb.nextInt();
            kb.nextLine();
         } else{
            baron = shoot.nextInt(3) + 1; //computer decision
            if(human==baron){ //tie scenarios
               if(human==1){ //rock tie
                  tie++;
                  System.out.println("Aha! We both chose rock. One of life's cruel jests. CURSE YOU, O GODS! CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               } else if(human==2){ //paper tie
                  tie++;
                  System.out.println("Aha! We both chose paper. One of life's cruel jests. CURSE YOU, O GODS! CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               } else{ //scissors tie
                  tie++;
                  System.out.println("Aha! We both chose scissors. One of life's cruel jests. CURSE YOU, O GODS! CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               }
            } else if(human==1){ //rock scenarios
               if(baron==2){ //baron wins
                  baronWins++;
                  System.out.println("You chose rock. I wisely chose paper. A victory for the baron! CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               } else{ //baron loses
                  humanWins++;
                  System.out.println("You chose rock. I chose scissors like an idiot. STUPID BARON! Your victory. CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               }
            } else if(human==2){ //paper scenarios
               if(baron==1){ //baron loses
                  humanWins++;
                  System.out.println("You chose paper. I chose rock. HOW DOES PAPER UNDO STONE?! STUPID BARON! Your victory. CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               } else{ //baron wins
                  baronWins++;
                  System.out.println("You chose paper. I wisely chose scissors, which snips your PATHETIC PAPER! A victory for the baron! CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               }
            } else{ //scissors scenarios
               if(baron==1){ //baron wins
                  baronWins++;
                  System.out.println("I CRUSH YOUR MISERABLE SHEERS WITH THE MIGHT OF MY ROCK! A victory for the baron! CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               } else{ //baron loses
                  humanWins++;
                  System.out.println("\"If you cut me, do I not bleed?\" I believe Yeats wrote that. Anyway, you, scissors. I, paper. STUPID BARON! Your victory. CHOOSE WISELY:\n1 - Rock\n2 - Paper\n3 - Scissors\n0 - Cry mercy and end this trial");
                  human = kb.nextInt();
                  kb.nextLine();
               }
            }
         }
      }
      //statistics
      System.out.println("You won " + humanWins + " time(s).\nI won " + baronWins + " time(s).\nWe tied " + tie + " time(s).\nOh, and you acted like a nitwit " + nitwit + " time(s).");
      //exit statement scenarios
      if(humanWins>baronWins){
         System.out.println("Enough of your smug gloating. You and I will meet again, and on that day, you will learn how to kneel.");
      } else if(humanWins<baronWins){
         System.out.println("NYAH NYAH! NOW BE BANISHED FROM THESE LANDS, AND IF YOU EVER RETURN, AT THINE OWN PERIL SHALL IT BE!");
      } else {
         System.out.println("...right. BE GONE, COWARD!");
      }
   }
}