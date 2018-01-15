import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Dice
{
    //Hierin staat het gooien van de latjes

    private ArrayList<Boolean> boolList;
    private Boolean stick1;
    private Boolean stick2;
    private Boolean stick3;
    private Boolean stick4;
    private int totalStickValue;
    private int trueNum;

    private Boolean start = false;
    public Dice()
    {
        if(!start)
        {
            startGameSticks();
        }
        else
        {
            throwSticks();
        }
    }
    private int throwSticks()
    {
        //throw dem sticks in here
        boolList = new ArrayList<Boolean>();
        //Throw sticks for 1
        Random r = new Random();
        stick1 = r.nextBoolean();
        stick2 = r.nextBoolean();
        stick3= r.nextBoolean();
        stick4 = r.nextBoolean();

        boolList.add(stick1);
        boolList.add(stick2);
        boolList.add(stick3);
        boolList.add(stick4);



        //Determine total value
        trueNum = Collections.frequency(boolList, true);

        if(trueNum == 1)
        {
            totalStickValue = 1;
        }
        else if(trueNum == 2)
        {
            totalStickValue = 2;
        }
        else if(trueNum == 3)
        {
            totalStickValue = 3;
        }
        else if(trueNum == 4)
        {
            totalStickValue = 4;
        }
        else
        {
            totalStickValue = 6;
        }
        return totalStickValue;

    }
    private void startGameSticks()
    {
        boolList = new ArrayList<Boolean>();
        Random r = new Random();

        //Throw sticks for 1
        stick1 = r.nextBoolean();
        stick2 = r.nextBoolean();
        stick3= r.nextBoolean();
        stick4 = r.nextBoolean();

        boolList.add(stick1);
        boolList.add(stick2);
        boolList.add(stick3);
        boolList.add(stick4);

        //check for result
        trueNum = Collections.frequency(boolList, true);
        //Check if player has thrown 1
        if(trueNum == 1)
        {
            start = true;
            //player word zwart en verzet pion van 10 naar 11
            //andere player word wit en zet pion op 9
        }
        else
        {

            boolList.clear();
        }

    }

    public int getTotalStickValue()
    {
        return totalStickValue;
    }

    public int getTrueNum()
    {
        return trueNum;
    }
}