import java.util.Date;

public class Student extends Person {
	
	double gpa;
	int numCourses = 0;
	Course[] courses;
	
	public Student() {
	}


	public Student(int id, String firstName, String lastName, String Role, double gpa) {
		super(id, firstName, lastName, Role);
		this.courses = new Course[30];
		this.gpa = gpa;
	}
	



	@Override
	void printInfo(int check) {
		super.printInfo(check);
		if(check == 0)
			System.out.println("GPA : " + gpa + "\n");
		else
			System.out.println("\n");

	}
	
	void registerCourse(Course course) {
		this.courses[numCourses] = course;
		this.numCourses++ ;
	}
	
	void listCourse() {
		System.out.print("Course List :\n");
		for(Course c : this.courses) {
			if(c != null) {
				System.out.println("-" + c.courseName);
			}else {
				System.out.println("No More\n");
				break;
			}
		}
	}
	

}
