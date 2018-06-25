package classesBasicas;


public class Leader extends Viking  {
	private String leaderMagic;
	private Competition niceLilFight;

	Leader(String name, Tribe tribe, String magic) {
		super(name, tribe);
		leaderMagic = magic;
		niceLilFight = null;
	}
	
	public String getLeaderMagic () { 
		return leaderMagic;
	}
	
	public void setLeaderMagic (String magic) {
		leaderMagic = magic;
	}
	
	public void startCom(String place) {
		niceLilFight = new Competition(place);
	}
	
	public void createCompetition(String place) {
		this.niceLilFight = new Competition(place);
	}
	
	public void addCompetitors(Dragon dragon) {
		this.niceLilFight.addDragon(dragon);
	}
	
	public Dragon[] startCompetition() {
		return this.niceLilFight.compete();
	}
}
