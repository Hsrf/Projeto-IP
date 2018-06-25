package classesBasicas;
import excecoes.*;

public class Tribe {
	
	private String tribeName;
	private Leader leader;
	private String magic;
	
	public Tribe (String name, Leader leader) {
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

	public void setLeader(Leader lider) throws MesmoLiderException{
		if (this.leader.getName().equals(lider.getName())) {
			throw new MesmoLiderException(lider.getName());
		} else {
			this.leader = lider;
		}
	}
}