import java.util.ArrayList;
import java.util.List;
public class League {
    private List<LeagueEntry> leagueEntryList = new ArrayList<>();
    public League(){
        leagueEntryList.add(new LeagueEntry());
        leagueEntryList.add(new LeagueEntry("Liverpool", 5, 5, 0, 0, 15));
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

    }
}
