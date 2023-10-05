import java.util.ArrayList;
import java.util.List;

public class League {
    List<LeagueEntry> leagueEntryList = new ArrayList<>();
    leagueEntryList.add(new LeagueEntry());
    leagueEntryList.add(new LeagueEntry("Liverpool", 5, 5, 0, 0, 15));

    System.out.println(leagueEntryList);

}
