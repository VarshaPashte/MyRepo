package DemoComparble;
import java.util.ArrayList;
import java.util.Collections;

public class DemoComparable {

	public static void main(String[] args) {
		BeanDemo bean=new BeanDemo();
		bean.setName("varsha");
		bean.setContact(357567777);
		bean.setRoll_no(23);
		BeanDemo bean1=new BeanDemo("abc",45,456357357);
		BeanDemo bean3=new BeanDemo("xyz",56,757888999);
		
		ArrayList<BeanDemo> list= new ArrayList<BeanDemo>();
		list.add(bean);
		list.add(bean1);
		list.add(bean3);
		
		//Collections.sort(list);
		ContactComparator obj1 = new ContactComparator();
		 
		
		 
		for(BeanDemo obj : list){
			System.out.println(obj.getName()+" : "+obj.getRoll_no()+" : "+obj.getContact());
		}
	
	}

}
