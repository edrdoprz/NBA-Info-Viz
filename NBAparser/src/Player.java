
public class Player {
	private String name;
	private String position;
	private double ppg;
	private double assists;
	private double rebounds;
	private double steals;
	private double blocks;
	private int age;
	private int gamesPlayed;
	private int gamesStarted;
	private double minutesPlayed;
	private double fieldGoals;
	private double fgPercent;
	private double fgAttempted;
	private double threePointers;
	private double threePointAttempts;
	private double threePointPercent;
	private double freeThrows;
	private double freeThrowsAttempted;
	private double freeThrowPercentage;
	private double oRebs;
	private double dRebs;
	private double turnovers;
	private double fouls;
	
	public String toString(){
		String tabs = "\t\t\t\t\t\t\t";
		String s = "\t\t\t\t\t\t{\n"+tabs+"\"name\" : \"" + name +  "\",\n"+tabs+"\"position\" : \"" + position + "\",\n"+tabs+
				"\"ppg\" : "+ ppg + ",\n" + tabs + "\"assists\" : " + assists + ",\n"+tabs+"\"rebounds\" : " + rebounds + ",\n" +
				tabs+"\"steals\" : " + steals + ",\n"+tabs+"\"blocks\" : " + blocks + ",\n" + tabs + "\"age\" : " + age + ",\n" + 
				tabs+"\"gamesPlayed\" : " + gamesPlayed + ",\n" + tabs + "\"gamesStarted\" : " + gamesStarted + ",\n" +
				tabs+"\"minutesPlayed\" : " + minutesPlayed + ",\n"+tabs+ "\"fieldGoals\" : " + fieldGoals + ",\n" + 
				tabs+"\"fgPercent\" : " + fgPercent + ",\n" + tabs + "\"fieldGoalsAttempted\" : "+fgAttempted + ",\n" +
				tabs+"\"threePointers\" : " + threePointers + ",\n" + tabs + "\"threePointAttempts\" : "+threePointAttempts + ",\n" +
				tabs+"\"threePointPercent\" : " + threePointPercent + ",\n" + tabs + "\"freeThrowsMade\" : "+freeThrows + ",\n" +
				tabs+"\"freeThrowsAttempted\" : " + freeThrowsAttempted + ",\n" + tabs + "\"freeThrowPercentage\" : "+freeThrowPercentage + ",\n" +
				tabs+"\"offensiveRebounds\" : " + oRebs + ",\n" + tabs + "\"defensiveRebounds\" : "+dRebs + ",\n" +
				tabs+"\"turnovers\" : " + turnovers + ",\n" + tabs + "\"foulsCommitted\" : "+fouls +"\n\t\t\t\t\t\t}";
		return s;
	}
	
	public Player(String name){
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getGamesStarted() {
		return gamesStarted;
	}

	public void setGamesStarted(int gamesStarted) {
		this.gamesStarted = gamesStarted;
	}

	public double getMinutesPlayed() {
		return minutesPlayed;
	}

	public void setMinutesPlayed(double minutesPlayed) {
		this.minutesPlayed = minutesPlayed;
	}

	public double getFieldGoals() {
		return fieldGoals;
	}

	public void setFieldGoals(double fieldGoals) {
		this.fieldGoals = fieldGoals;
	}

	public double getFgPercent() {
		return fgPercent;
	}

	public void setFgPercent(double fgPercent) {
		this.fgPercent = fgPercent;
	}

	public double getFgAttempted() {
		return fgAttempted;
	}

	public void setFgAttempted(double fgAttempted) {
		this.fgAttempted = fgAttempted;
	}

	public double getThreePointers() {
		return threePointers;
	}

	public void setThreePointers(double threePointers) {
		this.threePointers = threePointers;
	}

	public double getThreePointAttempts() {
		return threePointAttempts;
	}

	public void setThreePointAttempts(double threePointAttempts) {
		this.threePointAttempts = threePointAttempts;
	}

	public double getThreePointPercent() {
		return threePointPercent;
	}

	public void setThreePointPercent(double threePointPercent) {
		this.threePointPercent = threePointPercent;
	}

	public double getFreeThrows() {
		return freeThrows;
	}

	public void setFreeThrows(double freeThrows) {
		this.freeThrows = freeThrows;
	}

	public double getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public void setFreeThrowsAttempted(double freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}

	public double getFreeThrowPercentage() {
		return freeThrowPercentage;
	}

	public void setFreeThrowPercentage(double freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}

	public double getoRebs() {
		return oRebs;
	}

	public void setoRebs(double oRebs) {
		this.oRebs = oRebs;
	}

	public double getdRebs() {
		return dRebs;
	}

	public void setdRebs(double dRebs) {
		this.dRebs = dRebs;
	}

	public double getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(double turnovers) {
		this.turnovers = turnovers;
	}

	public double getFouls() {
		return fouls;
	}

	public void setFouls(double fouls) {
		this.fouls = fouls;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getPpg() {
		return ppg;
	}

	public void setPpg(double ppg) {
		this.ppg = ppg;
	}

	public double getAssists() {
		return assists;
	}

	public void setAssists(double assists) {
		this.assists = assists;
	}

	public double getRebounds() {
		return rebounds;
	}

	public void setRebounds(double rebounds) {
		this.rebounds = rebounds;
	}

	public double getSteals() {
		return steals;
	}

	public void setSteals(double steals) {
		this.steals = steals;
	}

	public double getBlocks() {
		return blocks;
	}

	public void setBlocks(double blocks) {
		this.blocks = blocks;
	}
	
}
