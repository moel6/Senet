//Van hieruit word het spel gespeeld
//vanaf spelers ophalen tot en met het voorbij is

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Senet
{
    Player player = new Player();
    Dice dice;
    Board board;
    private String input;
    private static BufferedReader stdin = new BufferedReader(
            new InputStreamReader(System.in));
    private Boolean hasStarted = false;
    private Boolean turn = true;

    public Senet()
    {
        play();
    }
    //Call methods for game
    private void play()
    {
        enterAnswers();

        throwStartGameSticks();

        checkBoardType();
    }

    //have player enter desired board and player names
    public void enterAnswers()
    {
        try {
            System.out.print("Welcome to Senet!\n Would you like to start a normal game (0) or a test position (1-\n" +
                    "3)? ->");
            input = stdin.readLine();
            System.out.println("Enter the name of the first player:");
            player.setPlayerName1(stdin.readLine());
            System.out.println("Enter the name of the second player:");
            player.setPlayerName2(stdin.readLine());
        } catch (IOException oops) {
            System.out.println("\n\nInput Error");
            System.exit(1);
        } catch (NumberFormatException oops) {
            System.out.println("\n\nNumber Format Error");
            System.exit(1);
        }
    }

    //check which board should be loaded
    public void checkBoardType()
    {
        if(input.equals("0"))
        {
            board = new Board(0);
        }
        else if(input.equals(1))
        {
            board = new Board(1);
        }
        else if(input.equals(2))
        {
            board = new Board(2);
        }
        else
        {
            board = new Board(3);
        }
    }

    //Throw sticks to decide which player becomes black/white
    public void throwStartGameSticks()
    {
        while(!hasStarted)
        {
            //player 1 throws the sticks
            if(turn)
            {
                dice = new Dice();
                System.out.println(player.getPlayerName1() + " has thrown " + dice.getTrueNum());
                turn = false;
                if(dice.getTrueNum() == 1)
                {
                    System.out.println(player.getPlayerName1() + " starts the game");
                    hasStarted = true;
                    player.setPlayerColour1("x");
                    player.setPlayerColour2("o");
                }
            }
            //player 2 throws the sticks
            else
            {
                dice = new Dice();
                System.out.println(player.getPlayerName2() + " has thrown " + dice.getTrueNum());
                turn = true;
                if(dice.getTrueNum() == 1)
                {
                    System.out.println(player.getPlayerName2() + " starts the game");
                    hasStarted = true;
                    player.setPlayerColour1("o");
                    player.setPlayerColour2("x");
                }
            }

        }

//        recall loop here if game status is finished breakcode or stop
    }

}