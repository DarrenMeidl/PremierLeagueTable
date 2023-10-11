import java.util.ArrayList;
import java.util.Random;
public class League {
    ArrayList<LeagueEntry> leagueEntryList;
    public League(){
        this.leagueEntryList = new ArrayList<>();
    }

    //METHODS
    //1. Prints Table
    public void printTable() {
        System.out.printf("%17s%14s%14s%14s%14s%14s\n", "TEAM", "GAMES PLAYED", "WINS", "DEFEATS", "DRAWN", "POINTS");
        for (int i = 0; i < leagueEntryList.size(); i++){
            System.out.printf("%17s%14d%14d%14d%14d%14d\n",  leagueEntryList.get(i).getName(),leagueEntryList.get(i).getGamesPlayed(), leagueEntryList.get(i).getGamesWon(), leagueEntryList.get(i).getGamesLost(), leagueEntryList.get(i).getGamesDrew(), leagueEntryList.get(i).getTotalPoints());
        }
    }
    //2. Plays Random Match Between 2 Teams
    public void playMatch(){
        //Variables
        int g1;
        int g2;
        int t1;
        int t2;
        Random rand1;
        Random rand2;
        Random team1;
        Random team2;

        rand1 = new Random();
        rand2 = new Random();
        team1 = new Random();
        team2 = new Random();

        g1 = rand1.nextInt(10) + 1;
        g2 = rand2.nextInt(10) + 1;
        t1 = team1.nextInt(leagueEntryList.size());
        t2 = team2.nextInt(leagueEntryList.size());
        //Ensures two different teams are selected instead of the same team twice
        if (t1 == t2){
            for (int i = 1; i > 0; i++){
                Random rand3;
                rand3 = new Random();
                t2 = rand3.nextInt(leagueEntryList.size());
                if (t1 == t2){
                    i = 1;
                }
                else {
                    i = -1;
                }
            }
        }
        //If Team 1 Wins the game
        if (g1 > g2){
            leagueEntryList.get(t1).addGamesWon();
            leagueEntryList.get(t1).addGamesPlayed();
            leagueEntryList.get(t1).addThreePoints();

            leagueEntryList.get(t2).addGamesLost();
            leagueEntryList.get(t2).addGamesPlayed();
        }

        //If Team 2 Wins the game
        else if (g1 < g2){
            leagueEntryList.get(t2).addGamesWon();
            leagueEntryList.get(t2).addGamesPlayed();
            leagueEntryList.get(t2).addThreePoints();

            leagueEntryList.get(t1).addGamesLost();
            leagueEntryList.get(t1).addGamesPlayed();
        }

        //If both Teams Draw the game
        else if (g1 == g2){
            leagueEntryList.get(t2).addGamesDrew();
            leagueEntryList.get(t2).addGamesPlayed();
            leagueEntryList.get(t2).addOnePoint();

            leagueEntryList.get(t1).addGamesDrew();
            leagueEntryList.get(t1).addGamesPlayed();
            leagueEntryList.get(t1).addOnePoint();
        }
    }
    //3. Adds team to League
    public void add(LeagueEntry team){
        leagueEntryList.add(team);
    }
}
