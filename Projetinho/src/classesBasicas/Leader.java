package classesBasicas;


public class Lider extends Viking  {
	
	private String leaderMagic;
	private Competition niceLilFight;

	Lider(String name, Tribe tribe, String magic) {
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

}
