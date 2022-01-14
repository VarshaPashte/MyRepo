package MyProject;

public class Module1 {
	String name,r_id,uid;
	int sem;
	public Module1(String name, String r_id, String uid, int sem) {
		super();
		this.name = name;
		this.r_id = r_id;
		this.uid = uid;
		this.sem = sem;
	}
	public Module1() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	
	
}
