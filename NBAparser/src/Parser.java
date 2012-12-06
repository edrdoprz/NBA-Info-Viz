import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Parser {

	public static void main(String[] args) {
		int numSeasons = 5;
		ArrayList<Season> seasons = new ArrayList<Season>();
		try {
			BufferedReader input =  new BufferedReader(new FileReader("rawData.txt"));
			for (int z=0;z<numSeasons; z++){
				Season season = new Season(Integer.parseInt(input.readLine()));
				season.setChamp(input.readLine());
				for (int i=0; i<8; i++){
					Team t = new Team(input.readLine());
					int numPlayers = Integer.parseInt(input.readLine());
					for (int j=0; j<numPlayers;j++){
						// parse player
						StringTokenizer s = new StringTokenizer(input.readLine(), ",", false);
						s.nextToken();
						Player p = new Player(s.nextToken());
						p.setAge(Integer.parseInt(s.nextToken()));
						p.setGamesPlayed(Integer.parseInt(s.nextToken()));
						p.setGamesStarted(Integer.parseInt(s.nextToken()));
						p.setMinutesPlayed(Double.parseDouble(s.nextToken()));
						p.setFieldGoals(Double.parseDouble(s.nextToken()));
						p.setFgAttempted(Double.parseDouble(s.nextToken()));
						p.setFgPercent(Double.parseDouble(s.nextToken()));
						p.setThreePointers(Double.parseDouble(s.nextToken()));
						p.setThreePointAttempts(Double.parseDouble(s.nextToken()));
						p.setThreePointPercent(Double.parseDouble(s.nextToken()));
						p.setFreeThrows(Double.parseDouble(s.nextToken()));
						p.setFreeThrowsAttempted(Double.parseDouble(s.nextToken()));
						p.setFreeThrowPercentage(Double.parseDouble(s.nextToken()));
						p.setoRebs(Double.parseDouble(s.nextToken()));
						p.setdRebs(Double.parseDouble(s.nextToken()));
						p.setRebounds(Double.parseDouble(s.nextToken()));
						p.setAssists(Double.parseDouble(s.nextToken()));
						p.setSteals(Double.parseDouble(s.nextToken()));
						p.setBlocks(Double.parseDouble(s.nextToken()));
						p.setTurnovers(Double.parseDouble(s.nextToken()));
						p.setFouls(Double.parseDouble(s.nextToken()));
						p.setPpg(Double.parseDouble(s.nextToken()));
						if (s.hasMoreTokens())
							p.setPosition(s.nextToken());
						else
							p.setPosition("");
						// end parse player

						t.getPlayers().add(p);
					}
					season.getTeams().add(t);
				}
				seasons.add(season);
				//System.out.println(season.toString());
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try{
			// Create file 
			FileWriter fstream = new FileWriter("data.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			String output = "{\n\t\"overview\" : {\n"; 
			//output += seasons.get(0).toString() + ",\n";
			//output += seasons.get(1).toString();
			//output += "\t}\n}";
			//String output = "{\"test\" : {\n\t\"seasons\" : [\n";
			for (int i=0; i < seasons.size(); i++){
				if (i!=seasons.size()-1)
					output+=seasons.get(i).toString()+",\n";
				else
					output+=seasons.get(i).toString();
			}
			output += "\n\t}\n}";
			//output+= "}}";
			out.write(output);
			//Close the output stream
			out.close();
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}
}
