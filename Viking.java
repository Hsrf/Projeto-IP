package comoTreinarDragao;

public class Viking {
	
	private String name;
	private Tribe tribe;
	
	Viking (String name, Tribe tribe) {
		this.name = name;
		this.tribe = tribe;
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getTribeName() {
		return tribe.getTribe();
	}
	 
	public void setName (String name) {
		this.name = name;
	}
	
	public void setTribe (Tribe tribe) {
		this.tribe = tribe;
	}

}
