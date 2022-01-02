package DemoComparble;

public class BeanDemo implements Comparable {
private String name;
private int roll_no;
public long contact;


public BeanDemo(String name,int roll_no,long contact){
	super();
	this.name=name;
	this.roll_no=roll_no;
	this.contact=contact;
}
	public BeanDemo() {
	super();
	// TODO Auto-generated constructor stub
}
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRoll_no() {
	return roll_no;
}

public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}

public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}

public static void main(String[] args) {
		

	}
	@Override
	public int compareTo(Object o) {
		BeanDemo bn=(BeanDemo)o;
		if(roll_no==bn.roll_no){
				return 0;
		}else if(roll_no>bn.roll_no)
		{
		return 1;
		}else{
			return -1;
		}
	}
	}


