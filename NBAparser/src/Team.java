import java.util.ArrayList;


public class Team {
	private String name;
	/*
	private double Big3ppg;
	private double Big3assists;
	private double Big3rebounds;
	private double Big3steals;
	private double Big3blocks;
	private int Big3age;
	private int Big3gamesPlayed;
	private int Big3gamesStarted;
	private double Big3minutesPlayed;
	private double Big3fieldGoals;
	private double Big3fgPercent;
	private double Big3fgAttempted;
	private double Big3threePointers;
	private double Big3threePointAttempts;
	private double Big3threePointPercent;
	private double Big3freeThrows;
	private double Big3freeThrowsAttempted;
	private double Big3freeThrowPercentage;
	private double Big3oRebs;
	private double Big3dRebs;
	private double Big3turnovers;
	private double Big3fouls;
	private double Teamppg;
	private double Teamassists;
	private double Teamrebounds;
	private double Teamsteals;
	private double Teamblocks;
	private int Teamage;
	private int TeamgamesPlayed;
	private int TeamgamesStarted;
	private double TeamminutesPlayed;
	private double TeamfieldGoals;
	private double TeamfgPercent;
	private double TeamfgAttempted;
	private double TeamthreePointers;
	private double TeamthreePointAttempts;
	private double TeamthreePointPercent;
	private double TeamfreeThrows;
	private double TeamfreeThrowsAttempted;
	private double TeamfreeThrowPercentage;
	private double TeamoRebs;
	private double TeamdRebs;
	private double Teamturnovers;
	private double Teamfouls;
	*/
	private ArrayList<Player> players;
	
	public Team(String name, Player p1, Player p2, Player p3){
		this.name = name;
		players.add(p1);
		players.add(p2);
		players.add(p3);
	}
	
	public Team(String name){
		this.name = name;
		this.players = new ArrayList<Player>();
	}
	
	public Team(String name, ArrayList<Player> p){
		this.name = name;
		this.players = p;
	}
	
	public String toString(){
		String s = "\t\t\t\t{\n\t\t\t\t\t\"name\" : \"" + name+ "\","+teamStats()+ "\n\t\t\t\t\t\"players\" : [\n";
		
		for (int i=0; i<players.size(); i++){
			if (i!=players.size() -1)
				s+= players.get(i).toString() + ",\n";
			else
				s+= players.get(i).toString() + "\n\t\t\t\t\t]\n\t\t\t\t}";
		}
		//String s = "\t\t\t\tTEAM";
		return s;
	}

	public String teamStats(){
		String tabs =  "\n\t\t\t\t\t";
		String cTabs = ",\n\t\t\t\t\t";
		String s = tabs+"\"big3ppg\" : "+getBig3ppg()+cTabs+"\"big3assists\" : "+getBig3assists()+cTabs+
				"\"big3rebounds\" : "+getBig3rebounds()+cTabs+"\"big3steals\" : "+getBig3steals()+cTabs+
				"\"big3blocks\" : "+getBig3blocks()+cTabs+"\"big3age\" : "+getBig3age()+cTabs+
				"\"big3gamesPlayed\" : "+getBig3gamesPlayed()+cTabs+"\"big3gamesStarted\" : "+getBig3gamesStarted()+cTabs+
				"\"big3minutesPlayed\" : "+getBig3minutesPlayed()+cTabs+"\"big3fieldGoals\" : "+getBig3fieldGoals()+cTabs+
				"\"big3fgPercent\" : "+getBig3fgPercent()+cTabs+"\"big3fgAttempted\" : "+getBig3fgAttempted()+cTabs+
				"\"big3threePointers\" : "+getBig3threePointers()+cTabs+"\"big3threePointAttempts\" : "+getBig3threePointAttempts()+cTabs+
				"\"big3threePointPercentage\" : "+getBig3threePointPercent()+cTabs+"\"big3freeThrows\" : "+getBig3freeThrows()+cTabs+
				"\"big3freeThrowsAttempted\" : "+getBig3freeThrowsAttempted()+cTabs+"\"big3freeThrowPercentage\" : "+getBig3freeThrowPercentage()+cTabs+
				"\"big3oRebs\" : "+getBig3oRebs()+cTabs+"\"big3dRebs\" : "+getBig3dRebs()+cTabs+
				"\"big3turnovers\" : "+getBig3turnovers()+cTabs+"\"big3fouls\" : "+getBig3fouls()+cTabs+
				/////////////////////
				"\"Teamppg\" : "+getTeamppg()+cTabs+"\"Teamassists\" : "+getTeamassists()+cTabs+
				"\"Teamrebounds\" : "+getTeamrebounds()+cTabs+"\"Teamsteals\" : "+getTeamsteals()+cTabs+
				"\"Teamblocks\" : "+getTeamblocks()+cTabs+"\"Teamage\" : "+getTeamage()+cTabs+
				"\"TeamgamesPlayed\" : "+getTeamgamesPlayed()+cTabs+"\"TeamgamesStarted\" : "+getTeamgamesStarted()+cTabs+
				"\"TeamminutesPlayed\" : "+getTeamminutesPlayed()+cTabs+"\"TeamfieldGoals\" : "+getTeamfieldGoals()+cTabs+
				"\"TeamfgPercent\" : "+getTeamfgPercent()+cTabs+"\"TeamfgAttempted\" : "+getTeamfgAttempted()+cTabs+
				"\"TeamthreePointers\" : "+getTeamthreePointers()+cTabs+"\"TeamthreePointAttempts\" : "+getTeamthreePointAttempts()+cTabs+
				"\"TeamthreePointPercentage\" : "+getTeamthreePointPercent()+cTabs+"\"TeamfreeThrows\" : "+getTeamfreeThrows()+cTabs+
				"\"TeamfreeThrowsAttempted\" : "+getTeamfreeThrowsAttempted()+cTabs+"\"TeamfreeThrowPercentage\" : "+getTeamfreeThrowPercentage()+cTabs+
				"\"TeamoRebs\" : "+getTeamoRebs()+cTabs+"\"TeamdRebs\" : "+getTeamdRebs()+cTabs+
				"\"Teamturnovers\" : "+getTeamturnovers()+cTabs+"\"Teamfouls\" : "+getTeamfouls()+",";
		return s;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBig3ppg() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getPpg();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3assists() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getAssists();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3rebounds() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getRebounds();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3steals() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getSteals();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3blocks() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getBlocks();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3age() {
		int ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getAge();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3gamesPlayed() {
		int ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getGamesPlayed();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3gamesStarted() {
		int ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getGamesStarted();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3minutesPlayed() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getMinutesPlayed();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3fieldGoals() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getFieldGoals();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3fgPercent() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getFgPercent();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3fgAttempted() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getFgAttempted();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3threePointers() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getThreePointers();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3threePointAttempts() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getThreePointAttempts();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3threePointPercent() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getThreePointPercent();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3freeThrows() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getFreeThrows();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3freeThrowsAttempted() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getFreeThrowsAttempted();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3freeThrowPercentage() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getFreeThrowPercentage();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3oRebs() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getoRebs();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3dRebs() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getdRebs();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3turnovers() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getTurnovers();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}

	public double getBig3fouls() {
		double ret =0;
		for (int i=0; i<3; i++){
			ret += this.players.get(i).getFouls();
		}
		return Math.round((ret/3.0)*10)/10.0;
	}
	
	public double getTeamppg() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getPpg();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamassists() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getAssists();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamrebounds() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getRebounds();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamsteals() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getSteals();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamblocks() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getBlocks();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamage() {
		int ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getAge();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamgamesPlayed() {
		int ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getGamesPlayed();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamgamesStarted() {
		int ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getGamesStarted();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamminutesPlayed() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getMinutesPlayed();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamfieldGoals() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getFieldGoals();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamfgPercent() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getFgPercent();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamfgAttempted() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getFgAttempted();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamthreePointers() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getThreePointers();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamthreePointAttempts() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getThreePointAttempts();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamthreePointPercent() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getThreePointPercent();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamfreeThrows() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getFreeThrows();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamfreeThrowsAttempted() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getFreeThrowsAttempted();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamfreeThrowPercentage() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getFreeThrowPercentage();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamoRebs() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getoRebs();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamdRebs() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getdRebs();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamturnovers() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getTurnovers();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public double getTeamfouls() {
		double ret =0;
		for (int i=3; i<this.players.size(); i++){
			ret += this.players.get(i).getFouls();
		}
		return Math.round(10*ret/(this.players.size()-3))/10.0;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
}
	