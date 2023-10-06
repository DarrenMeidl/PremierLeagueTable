import java.util.ArrayList;
import java.util.List;
public class League {
    public static void main(String[] args) {
        List<LeagueEntry> leagueEntryList = new ArrayList<>();
        leagueEntryList.add(new LeagueEntry());
        leagueEntryList.add(new LeagueEntry("Liverpool", 5, 5, 0, 0, 15));

        printTable(leagueEntryList);
        System.out.println(leagueEntryList);
    }

    public void printTable(ArrayList<LeagueEntry> leagueEntryList){
        System.out.printf("%17s%14s%14s%14s%14s%14s\n", "TEAM", "GAMES PLAYED", "WINS", "DEFEATS", "DRAWN", "POINTS");
    }
}
