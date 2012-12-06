import java.util.ArrayList;


public class Season {
	private ArrayList<Team> teams;
	private int year;
	private String champ;
	
	public Season(ArrayList<Team> t, int y, String c){
		this.year = y;
		this.teams = t;
		this.champ = c;
	}
	
	public Season(int year){
		this.year=year;
		teams = new ArrayList<Team>();
	}

	public String toString(){
		String s = "\t\t\""+year+"\" : {\n\t\t\t\"year\" : " + year + ",\n\t\t\t\"winner\" : \"" + champ + "\",\n\t\t\t\"teams\": [\n";
		
		//String s = "{\n \t\"season\" : {\n\t\t\"year\" : " + year + ",\n\t\t\"winner\" : \"" + champ + "\",\n\t\t\"teams\": [\n";
		//String s = "\t\t{\n\t\t\t\"year\" : " + year + ",\n\t\t\t\"winner\" : \"" + champ + "\",\n\t\t\t\"teams\": [\n";
		for (int i=0; i<teams.size(); i++){
			if(i!=teams.size() -1)
				s+= teams.get(i).toString() + ",\n";
			else
				s+= teams.get(i).toString() + "\n\t\t\t]\n\t\t}";
		}
		
		//s+= teams.get(0).toString() + "]}}";
		//s+= teams.get(0).toString() + "\n]\n}";
		return s;
	}
	
	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getChamp() {
		return champ;
	}

	public void setChamp(String champ) {
		this.champ = champ;
	}
	
}
