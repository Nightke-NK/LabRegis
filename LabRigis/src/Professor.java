
public class Professor extends Person {
	double salary;
	int numCourses = 0;
	Course[] courses;

	public Professor() {

	}


	public Professor(int id, String firstName, String lastName, String Role, double salary) {
		super(id, firstName, lastName, Role);
		this.salary = salary;
		this.courses = new Course[30];
	}

	@Override
	void printInfo(int check) {
		super.printInfo(check);
		if(check == 0)
			System.out.println("Salary : " + salary + "\n");
		else
			System.out.println("\n");
	}
	
	void createCourse(Course course) {
		this.courses[numCourses] = course;
		this.numCourses++ ;
	}
	
	void listCourse() {
		System.out.print("Course List :\n");
		for(Course c : this.courses) {
			if(c != null) {
				System.out.print("Course: "+ c.courseCode );
				System.out.print(" "+c.courseName + " " + c.timeSlot);
				System.out.println(" Room: "+c.room);
				System.out.println("Regis: "+c.numStudent+" preson \n");
			}else {
				System.out.println("No More\n");
				break;
			}
		}
	}

}
