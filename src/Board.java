//Hierin staat de positie op het bord en en worden zetten uitgevoerd
//volgens de spelregels

import java.util.ArrayList;

public class Board {
    //private HashMap<Integer, > hMap = new HashMap<>();
    private ArrayList<String> tileList = new ArrayList<>();
    private ArrayList<String> blackPawnList = new ArrayList<>();
    private ArrayList<String> whitePawnList = new ArrayList<>();

    public Board(int boardNumber) {
        fillLists();
        if (boardNumber == 0)
        {
            printBoard();
        } else if (boardNumber == 1)
        {
            printTestPositionOne();
        } else if (boardNumber == 2)
        {
            printTestPositionTwo();
        } else if (boardNumber == 3)
        {
            printTestPositionThree();
        }
    }

    private void fillLists()
    {
        //fill list of tiles
        for (int i = 1; i <= 30; i++)
        {
            tileList.add(".");
        }
        //fill lists of black pawns and white pawns
        for(int i = 1; i <= 5; i++)
        {
            whitePawnList.add("O");
            blackPawnList.add("X");
        }
    }

    private void printBoard()
    {

        for(int y = 0; y < 10; y++)
        {
            tileList.set(y,"O");
            tileList.set(y += 1, "X");
        }

        System.out.println("+----------+");
        for (int i = 1; i <= 30; i++)
        {
            if (i == 1 || i == 21)
            {
                System.out.print("|");
                System.out.print(tileList.get(i - 1));
            }
            else if(i == 11)
                System.out.println();


            if (i % 10 == 0)
            {
                System.out.println("|");
            }
        }
        System.out.print("+----------+");
    }

    private void printTestPositionOne() {
        System.out.println("PRINT TEST POSITION THREE 111");
    }

    private void printTestPositionTwo() {
        System.out.println("PRINT TEST POSITION THREE 222");
    }

    private void printTestPositionThree() {
        System.out.println("PRINT TEST POSITION THREE 333");
    }
}