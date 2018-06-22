package classesBasicas;
import excecoes.*;

public class Tribe {
	
	private String tribeName;
	private Viking leader;
	private String magic;
	
	public Tribe (String n, Viking w) {
		this.tribeName = n;
		this.leader = w;
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

	public void setLeader(Viking lider) throws MesmoLiderException{
		if (this.leader.getLeader().equals(lider.getLeader())) {
			throw new MesmoLiderException(lider.getLeader());
		} else {
			this.leader = lider;
		}
	}
}