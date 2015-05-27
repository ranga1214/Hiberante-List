import java.util.List;


public class Student {
	private int id;
	public Student(){
		
	}
	   
	   public Student(String name, String sadd) {
		
		this.name = name;
		this.sadd = sadd;
		
	}
	private String name;   
	   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public List getGrades() {
		return grades;
	}

	public void setGrades(List grades) {
		this.grades = grades;
	}
	private String sadd;
	   private List grades;
}
