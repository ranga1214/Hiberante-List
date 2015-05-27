import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentResult {
private static SessionFactory factory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Configuration config=new Configuration();
   config.configure();
   factory=config.buildSessionFactory();
    
   StudentResult result=new StudentResult();
   ArrayList list1=new ArrayList();
   list1.add(new Grade("A"));
   list1.add(new Grade("A"));
   list1.add(new Grade("B"));
   
   Integer stu1=result.addStudent("Ranga","Missouri",list1);
   
   ArrayList list2=new ArrayList();
   list2.add(new Grade("A"));
   list2.add(new Grade("B"));
   list2.add(new Grade("B"));
   
   Integer stu2=result.addStudent("Sanjay", "Kansas", list2);
   
   result.listStudents();
   
	}
	private void listStudents() {
		// TODO Auto-generated method stub
		 Session session = factory.openSession();
	      Transaction tx = null;
	      
	         tx = session.beginTransaction();
	         List students = session.createQuery("FROM Student").list(); 
	         for (Iterator iterator1 = 
	                           students.iterator(); iterator1.hasNext();){
	            Student student = (Student) iterator1.next(); 
	            System.out.println("Name: "+student.getName());
	            System.out.println("Address: "+student.getSadd());
	            List grades= student.getGrades();
	            for (Iterator iterator2 = 
	                         grades.iterator(); iterator2.hasNext();){
	                  Grade gradeDetail = (Grade) iterator2.next(); 
	                  System.out.println("Grade: " + gradeDetail.getSname()); 
	            
	            }
	            tx.commit();
	         }
	         
	         session.close();
	}
	private Integer addStudent(String name, String sadd, ArrayList remarks) {
		// TODO Auto-generated method stub
		 Session session=factory.openSession();

		 Transaction tx = null;
		 	      Integer studentID = null;
		 	     
		 	         tx = session.beginTransaction();
		 	         Student student = new Student(name,sadd);
		 	        student.setGrades(remarks);
		 	         studentID = (Integer) session.save(student); 
		 	         tx.commit();
		return studentID;
	}

}
