import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor{
    public static void main(String a[]){
        String[] game = {"rock", "paper", "scissor"};
        String Comptmove = game[new Random().nextInt(game.length)];
        Scanner sc = new Scanner(System.in);
        String usermove;
        while(true){
        System.out.println("please enter your move(rock, paper, or scissor)");
        usermove = sc.nextLine();
        if (usermove.equals("rock") || usermove.equals("paper") || usermove.equals("scissor")){
            break;
        }
        System.out.println(usermove + "is not valid move");
    }
    System.out.println("Compt move : " + Comptmove);
    if (usermove.equals(Comptmove)){
        System.out.println("The game is tie!");
    }
    else if(usermove.equals("rock")){
        if(Comptmove.equals("paper")){
            System.out.println("you lose");
        }else if(Comptmove.equals("scissor")){
         System.out.println("you win");
        }
    }
     else if(usermove.equals("paper")){
        if(Comptmove.equals("rock")){
            System.out.println("you win");
        }else if(Comptmove.equals("scissor")){
         System.out.println("you win");
        }
    }
     else if(usermove.equals("scissor")){
        if(Comptmove.equals("paper")){
            System.out.println("you win");
        }else if(Comptmove.equals("rock")){
         System.out.println("you lose");
        }
    }
}
}