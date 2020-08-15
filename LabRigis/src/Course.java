
public class Course {
	String courseName;
	String courseCode;
	String numStudent;
	String timeSlot;
	String room;

	public Course(String courseCode, String courseName, String numStudent, String timeSlot, String room) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.numStudent = numStudent;
		this.timeSlot = timeSlot;
		this.room = room;
	}

	void printCourse() {
		System.out.print("Course: " + courseCode);
		System.out.print(" " + courseName + " " + timeSlot);
		System.out.println(" Room: " + room);
		System.out.println("Regis: " + numStudent + " preson \n");
	}

}
