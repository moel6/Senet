import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//hierin staan de gegevens van de speler
//bijv. naam en kleur


public class Player
{
    private static BufferedReader stdin = new BufferedReader(
            new InputStreamReader(System.in));

    private String playerName1;
    private String playerName2;
    private String playerColour1;
    private String playerColour2;

    public Player()
    {

    }



    public String getPlayerName1() {
        return playerName1;
    }

    public void setPlayerName1(String playerName1) {
        this.playerName1 = playerName1;
    }

    public String getPlayerName2() {
        return playerName2;
    }

    public void setPlayerName2(String playerName2) {
        this.playerName2 = playerName2;
    }

    public String getPlayerColour1() {
        return playerColour1;
    }

    public void setPlayerColour1(String playerColour1) {
        this.playerColour1 = playerColour1;
    }

    public String getPlayerColour2() {
        return playerColour2;
    }

    public void setPlayerColour2(String playerColour2) {
        this.playerColour2 = playerColour2;
    }
}