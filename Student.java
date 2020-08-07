
public class Student {
	
	

	public class Student
	{
	    private String rollno;
	    private int age;

	    public Student(int age,String rollno)
	    {
	        this.age=age;
	        this.rollno=rollno;
	    }
	    public Student()
	    {
	    	this("1",18);
	    }
	    public String getRollno() {
	        return rollno;
	    }

	    public void setRollno(String rollno) {
	        this.rollno = rollno;
	    }
	    
	    public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		  
		public int hashCode() {
			return Objects.hash(age, rollno);
		}

}
