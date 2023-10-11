public class MainApp {
    public static void main(String[] args) {
        League season2324 = new League();

        season2324.add(new LeagueEntry());
        season2324.add(new LeagueEntry("Liverpool", 5, 5, 0, 0, 15));

        season2324.printTable();
        season2324.playMatch();
        season2324.printTable();
    }
}
