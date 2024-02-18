import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        System.out.println("welcome to Rock, Paper, Scissors");

        String playerA = "";
        String playerB = "";
        String trash = "";
        String doneStatement = "";

        Scanner in = new Scanner(System.in);

        boolean done = false;
        boolean gameOver = false;

        do {
            do{
                System.out.print("player A input your move [R,P,S]: ");
                if(in.hasNext()){
                    playerA = in.next();
                    in.nextLine();
                    playerA = playerA.toUpperCase();
                    done = true;

                    switch(playerA){
                        case "R":
                            System.out.println("player A chose Rock");
                            done = true;
                            break;
                        case "P":
                            System.out.println("player A chose Paper");
                            done = true;
                            break;
                        case "S":
                            System.out.println("player A chose Scissors");
                            done = true;
                            break;
                        default:
                            System.out.println("player A chose invalid input: " + playerA);
                            done = false;
                            break;
                    }
                }
                else{
                    trash = in.next();
                    System.out.println("invalid input detected: " + trash);
                    in.nextLine();
                }
            }while(!done);//playerA input loop
            done = false;
            do{
                System.out.print("player B input your move [R,P,S]: ");
                if(in.hasNext()){
                    playerB = in.next();
                    in.nextLine();
                    playerB = playerB.toUpperCase();
                    done = true;

                    switch(playerB){
                        case "R":
                            System.out.println("player B chose Rock");
                            done = true;
                            break;
                        case "P":
                            System.out.println("player B chose Paper");
                            done = true;
                            break;
                        case "S":
                            System.out.println("player B chose Scissors");
                            done = true;
                            break;
                        default:
                            System.out.println("player B chose invalid input: " + playerA);
                            done = false;
                            break;
                    }
                }
                else{
                    trash = in.next();
                    System.out.println("invalid input detected: " + trash);
                    in.nextLine();
                }
            }while(!done);//playerB input loop
            done = false;



            if(playerA.equals("R")){
                if(playerB.equals("P")){
                    System.out.println("paper covers rock, player B wins");
                }
                else if(playerB.equals("S")){
                    System.out.println("rock crushes scissors, player A wins");
                }
            }
            else if(playerA.equals("P")){
                if(playerB.equals("R")){
                    System.out.println("paper covers rock, player A wins");
                }
                else if(playerB.equals("S")){
                    System.out.println("scissors cuts paper, player B wins");
                }
            }
            else if(playerA.equals("S")){
                if(playerB.equals("R")){
                    System.out.println("rock crushes scissors, player B wins");
                }
                else if(playerB.equals("P")){
                    System.out.println("scissors cuts paper, player A wins");
                }
            }
            else{
                System.out.println("it's a tie!");
            }







            do {
                System.out.print("would you like to play again? [Y/N]: ");
                if (in.hasNext()) {
                    doneStatement = in.next();
                    in.nextLine();
                    doneStatement = doneStatement.toUpperCase();
                    if (doneStatement.equals("N")) {
                        System.out.println("come back soon!");
                        done=true;
                        gameOver = true;
                    } else if (doneStatement.equals("Y")) {
                        System.out.println("restarting");
                        done=true;
                    } else {
                        System.out.println("invalid input detected: " + doneStatement);
                        done=false;
                    }


                }
            }while(!done);//this checks to see if the game is done

        }while(!gameOver);//game loop

    }
}