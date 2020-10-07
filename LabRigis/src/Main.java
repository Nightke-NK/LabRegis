import java.util.Scanner;

public class Main {

	static void printperson(Person p1, Person p2, Person p3, Person p4, Person p5) {
		p1.printInfo(1);
		p2.printInfo(1);
		p3.printInfo(1);
		p4.printInfo(1);
		p5.printInfo(1);
	}
//testuser
	static void printCourse(Course c1, Course c2, Course c3) {
		c1.printCourse();
		c2.printCourse();
		c3.printCourse();
	}

	public static void main(String[] args) {

		Course c1 = new Course("ENG01", "Java", "25", "8.00-11.00AM.", "E1");
		Course c2 = new Course("ENG02", "Software", "12", "13.00-15.00PM.", "E2");
		Course c3 = new Course("ENG03", "Database", "32", "9.00-12.00AM.", "E3");

		Address a1 = new Address("111 Huaykaew", "Muang", "Chiang Mai", "50300");
		Student s1 = new Student(1, "Chris", "Evans", "Student", 4.00);
		s1.setAddress(a1);
		s1.setDOB("11-10-2541");

		Address a2 = new Address("222 Huaykaew", "Muang", "Chiang Mai", "50300");
		Professor p2 = new Professor(2, "Jack", "Owen", "Professer", 12000);
		p2.setAddress(a2);
		p2.setDOB("01-01-2530");

		Address a3 = new Address("333 Huaykaew", "Muang", "Chiang Mai", "50300");
		Student s3 = new Student(3, "Taylor", "Swift", "Student", 3.50);
		s3.setAddress(a3);
		s3.setDOB("29-12-2541");

		Address a4 = new Address("444 Huaykaew", "Muang", "Chiang Mai", "50300");
		Student s4 = new Student(4, "Emma", "Watson", "Student", 2.50);
		s4.setAddress(a4);
		s4.setDOB("13-05-2541");

		Address a5 = new Address("555 Huaykaew", "Muang", "Chiang Mai", "50300");
		Professor p5 = new Professor(5, "Brad", "Pitt", "Professer", 15000);
		p5.setAddress(a5);
		p5.setDOB("18-09-2530");

		Student s0 = new Student();
		Professor p0 = new Professor();

		for (int i = 1; i >= 0; i++) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("------------------------Select-----------------------");
			System.out.print("1 printInfo 2 Student 3 Professor ");
			i = keyboard.nextInt();
			if (i == 1) {
				printperson(s1, p2, s3, s4, p5);
			}
			if (i == 2) {
				System.out.print("------------------------Enter your ID-----------------------");
				int st = keyboard.nextInt();
				if (st == 1 || st == 3 || st == 4) {
					if (st == 1)
						s0 = s1;
					else if (st == 3)
						s0 = s3;
					else if (st == 4)
						s0 = s4;
					for (i = 0; i >= 0; i++) {
						System.out.println("--------------------Welcome " + s0.firstName + " " + s0.lastName
								+ " ------------------");
						System.out.print("Enter Menu [1]:printInfo [2]:regisCourse[0:Exit]  : ");
						int menu = keyboard.nextInt();
						if (menu == 1) {
							s0.printInfo(0);
							s0.listCourse();
						}
						if (menu == 2) {
							printCourse(c1, c2, c3);
							s0.listCourse();
							System.out.print("Regis Course : ");
							int rg = keyboard.nextInt();
							if (rg == 1) {
								s0.registerCourse(c1);
							} else if (rg == 2) {
								s0.registerCourse(c2);
							} else if (rg == 3) {
								s0.registerCourse(c3);
							} else {
								System.out.println("Back");
							}
						}
						if (menu == 0) {
							break;
						}
					}
				}
			}
			if (i == 3) {
				System.out.print("------------------------Enter your ID-----------------------");
				int pr = keyboard.nextInt();
				if (pr == 2 || pr == 5) {
					if (pr == 2)
						p0 = p2;
					else if (pr == 5)
						p0 = p5;
					for (i = 0; i >= 0; i++) {
						System.out.println("--------------------Welcome " + p0.firstName + " " + p0.lastName
								+ " ------------------");
						System.out.print("Enter Menu [1]:printInfo [2]:Create Course [0:Exit]  : ");
						int menu = keyboard.nextInt();
						if (menu == 1) {
							p0.printInfo(0);
							p0.listCourse();
						}
						if (menu == 2) {
							p0.listCourse();
							System.out.print("Regis Course : \n");
							System.out.print("Course Code : ");
							String addCode = keyboard.next();
							System.out.print("Course Name : ");
							String addName = keyboard.next();
							System.out.print("Course  Student : ");
							String addStudent = keyboard.next();
							System.out.print("Course Time  : ");
							String addTime = keyboard.next();
							System.out.print("Course room : ");
							String addRoom = keyboard.next();
							p0.createCourse(new Course(addCode, addName, addStudent, addTime, addRoom));
							p0.listCourse();
						}
						if (menu == 0) {
							break;
						}
					}
				}
			}

		}
	}
}
