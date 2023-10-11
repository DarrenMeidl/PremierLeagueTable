public class LeagueEntry implements Comparable<LeagueEntry>{
    //Fields
    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrew;
    private int totalPoints;
    //Full Constructor
    public LeagueEntry(String name, int gamesPlayed, int gamesWon, int gamesLost, int gamesDrew, int totalPoints){
        this.name = name;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesDrew = gamesDrew;
        this.totalPoints = totalPoints;
    }
    //Default Constructor
    public LeagueEntry(){
        this.name = "DEFAULT TEAM";
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.gamesDrew = 0;
        this.totalPoints = 0;
    }
    //Getters
    public String getName(){ return this.name;}
    public int getGamesPlayed(){ return this.gamesPlayed;}
    public int getGamesWon(){ return this.gamesWon;}
    public int getGamesLost(){ return this.gamesLost;}
    public int getGamesDrew(){ return this.gamesDrew;}
    public int getTotalPoints(){ return this.totalPoints;}
    //Setters
    public void setName(String name){ this.name = name;}
    public void setGamesPlayed(int gamesPlayed){ this.gamesPlayed = gamesPlayed;}
    public void setGamesWon(int gamesWon){ this.gamesWon = gamesWon;}
    public void setGamesLost(int gamesLost){ this.gamesLost = gamesLost;}
    public void setGamesDrew(int gamesDrew){ this.gamesDrew = gamesDrew;}
    public void setTotalPoints(int totalPoints){ this.totalPoints = totalPoints;}

    @Override
    public String toString() {
        return "TEAM: " + name + ", Games Played: " + gamesPlayed + ", Games Won: "+gamesWon+
                ", Games Lost: "+gamesLost+", Games Drew: "+gamesDrew+", Total Points: "+totalPoints;
    }

    @Override
    public int compareTo(LeagueEntry other){
        return this.name.compareTo(other.name);
    }

}
