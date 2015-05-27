import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Configuration config=new Configuration();
   config.configure();
   SessionFactory facotry=config.buildSessionFactory();
    
   StudentResult result=new StudentResult();
   ArrayList list=new ArrayList();
   list.add(new Grade("A"));
   list.add(new Grade("A"));
   list.add(new Grade("B"));
   
   Integer stu1=result.addStudent("Ranga","Missouri",list);
   
   ArrayList list1=new ArrayList();
   list1.add(new Grade("A"));
   list1.add(new Grade("B"));
   list1.add(new Grade("B"));
	}

}
