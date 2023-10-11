import java.util.ArrayList;
import java.util.List;
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
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random team1 = new Random();
        Random team2 = new Random();

        int g1;
        int g2;
        int t1;
        int t2;

        g1 = rand1.nextInt(10) + 1;
        g2 = rand2.nextInt(10) + 1;

        t1 = team1.nextInt(leagueEntryList.size() + 1);
        t2 = team2.nextInt(leagueEntryList.size() + 1);

        if (t1 == t2){
            for (int i = 1; i > 0; i++){
                Random rand3 = new Random();
                t2 = rand3.nextInt(leagueEntryList.size() + 1);
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

            leagueEntryList.get(t2).setGamesLost(leagueEntryList.get(t2).getGamesLost() + 1);
            leagueEntryList.get(t2).setGamesPlayed(leagueEntryList.get(t2).getGamesPlayed() + 1);
        }

        //If Team 2 Wins the game
        else if (g1 < g2){
            leagueEntryList.get(t2).setGamesWon(leagueEntryList.get(t2).getGamesWon() + 1);
            leagueEntryList.get(t2).setGamesPlayed(leagueEntryList.get(t2).getGamesPlayed() + 1);
            leagueEntryList.get(t2).setTotalPoints(leagueEntryList.get(t2).getTotalPoints() + 3);

            leagueEntryList.get(t1).setGamesLost(leagueEntryList.get(t1).getGamesLost() + 1);
            leagueEntryList.get(t1).setGamesPlayed(leagueEntryList.get(t1).getGamesPlayed() + 1);
        }

        //If both Teams Draw the game
        else if (g1 == g2){
            leagueEntryList.get(t2).setGamesDrew(leagueEntryList.get(t2).getGamesDrew() + 1);
            leagueEntryList.get(t2).setGamesPlayed(leagueEntryList.get(t2).getGamesPlayed() + 1);
            leagueEntryList.get(t2).setTotalPoints(leagueEntryList.get(t2).getTotalPoints() + 1);

            leagueEntryList.get(t1).setGamesDrew(leagueEntryList.get(t1).getGamesDrew() + 1);
            leagueEntryList.get(t1).setGamesPlayed(leagueEntryList.get(t1).getGamesPlayed() + 1);
            leagueEntryList.get(t1).setTotalPoints(leagueEntryList.get(t1).getTotalPoints() + 1);
        }
    }
    //3. Adds team to League
    public void add(LeagueEntry team){
        leagueEntryList.add(team);
    }
}
