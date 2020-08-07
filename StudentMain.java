import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentMain {
	Set<Student> store = new HashSet<Student>();

	public static void main(String args[]) {

		StudentMain std = new StudentMain();
		std.run();
	}

	public void run() {
		
			Student student1 = new Student(2,"aa");
			Student student2 = new Student(1,"bb");
			Student student3 = new Student(6,"cc");
			Student student4 = new Student(9,"dd");
			Student student5 = new Student(4,"ee");
			store.add(student1);
			store.add(student2);
			store.add(student3);
			store.add(student4);
			store.add(student5);
			List<Student> studentage = new LinkList<Student>(store);
			display(studentage);
		}
		
		private void display(List<Student> studentage) {
			for (Student std : studentage) {
				if(std.getAge()>21)
				{
				System.out.println("Age"+std.getAge());
			}
		}
	}
	
