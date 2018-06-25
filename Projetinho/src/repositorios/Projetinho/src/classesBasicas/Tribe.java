package classesBasicas;
import excecoes.*;

public class Tribe {
	
	private String tribeName;
	private Lider leader;
	private String magic;
	
	public Tribe (String name, Lider leader) {
		this.tribeName = name;
		this.leader = leader;
		this.magic = this.leader.getLeaderMagic();
	}
	
	public String getTribe() {
		return this.tribeName;
	}
	
	public String getMagic() {
		return this.magic;
	}
	
	public String getLeader() {
		return this.leader.getName();
	}

	public void setLeader(Lider lider) throws MesmoLiderException{
		if (this.leader.getName().equals(lider.getName())) {
			throw new MesmoLiderException(lider.getName());
		} else {
			this.leader = lider;
		}
	}
}