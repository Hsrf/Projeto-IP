package comoTreinarDragao;

public class Lider extends Viking  {
	
	private String leaderMagic;

	Lider(String name, Tribe tribe, String magic) {
		super(name, tribe);
		leaderMagic = magic;
		
	}
	
	public String getLeaderMagic () {
		return leaderMagic;
	}
	
	public void setLeaderMagic (String magic) {
		leaderMagic = magic;
	}

}
