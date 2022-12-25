package shaima1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecutionClass {// TODO: Is this a looop or class? Also make capital

	public static void main(String[] args) { // TODO: Break this func into smaller functions
		School sch = new School();
		Department dep = new Department();
		Teacher tec = new Teacher();
		student stu = new student();
		Course cou = new Course();
		Mark mark = new Mark();

		List<Department> departmentlist = new ArrayList<>();
		boolean addDepartment = true;
		
		int sum = 0;

		// boolean condition = true;

//		while (condition == true) {
//			System.out.println("1- School Details");
//			System.out.println("2- Depatment Details");
//			System.out.println("3- Teacher Details");
//			System.out.println("4- Student Details");
//			System.out.println("5- Course Details");
//			System.out.println("6- Mark Details");
//			System.out.println("7- Print Report");

		Scanner sc = new Scanner(System.in);
		// int input = sc.nextInt();

		System.out.println("Enter School Name:");
		String sName = sc.next();
		sch.setSchoolName(sName);

		/*
		 * boolean open = true;
		 * 
		 * if (open) { System.out.println("School is open"); } else if (open = false) {
		 * System.out.println("School is close"); }
		 */

		while (addDepartment) {

			

			System.out.println("Enter Department Name:");
			String depName = sc.next();
			dep.setDepartmentName(depName);

			System.out.println("Enter Deparment id:");
			int deptId = sc.nextInt();
			dep.setDepartmentId(deptId);
			boolean addTeacher = true;
			
			while (addTeacher) {
				

				

				System.out.println("Enter techear Name:");
				String tecName = sc.next();
				tec.setTeacherName(tecName);

				System.out.println("Enter techear id:");
				int tecId = sc.nextInt();
				tec.setTeacherID(tecId);

				System.out.println("Do you want to add Teacher yes/no");
				String answer1 = sc.next();
				
			    
				
				if (answer1.equals("yes")) {
					System.out.println("Next Teacher:");
					addTeacher = true;

				} else if (answer1.equals("no")) {
					addTeacher = false;
					System.out.println("Student:");
					break;

				}
				dep.techearlist.add(tec);

			} // while teacher
			boolean addStudent = true;

			while (addStudent) {

				

				System.out.println("Enter Student Name:");
				String stuName = sc.next();
				stu.setStudentName(stuName);

				System.out.println("Enter Studentid:");
				int stuId = sc.nextInt();
				

				System.out.println("Do you want to add Student yes/no");
				String answer12 = sc.next();
				
				if (answer12.equals("yes")) {
					System.out.println("Next Student:");
					addStudent = true;
					dep.tec.studentlist.add(stu);
					 
				} else if (answer12.equals("no")) {
					addStudent = false;
					System.out.println("course:");
					break;

				}
				stu.setStudentId(stuId);
			} // while stud
			boolean addCourse = true;
			while (addCourse) {

				

				System.out.println("Enter Course Name:");
				String couName = sc.next();
				cou.setName(couName);

				System.out.println("Enter Courseid:");
				int couId = sc.nextInt();
				cou.setId(couId);

				System.out.println("Do you want to add Course yes/no");
				String answer100 = sc.next();
				
				if (answer100.equals("yes")) {
					System.out.println("Next Course:");
					addCourse = true;

				} else if (answer100.equals("no")) {
					addCourse = false;
					System.out.println("Marke:");
					break;

				}
				dep.tec.stu.courselist.add(cou);

			} // course while
			boolean addMarks = true;
			while (addMarks) {

				

				System.out.println("Enter Arabic Mark:");
				int AM = sc.nextInt();
				mark.setArabicMark(AM);

				System.out.println("Enter Math Mark:");
				int Mm = sc.nextInt();
				mark.setMathMark(Mm);
				sum=mark.getArabicMark() +mark.getMathMark();
				mark.setSum(sum);

				mark.setSum(sum);
				System.out.println("Do you want to add Mark yes/no");
				String answer10 = sc.next();
				
				if (answer10.equals("yes")) {
					System.out.println("Next student mark:");

					addMarks = true;
				} else if (answer10.equals("no")) {
					addMarks = false;
					System.out.println("end");
					break;

				}
				dep.tec.stu.cou.Marklist.add(mark);
			} // mark while

			departmentlist.add(dep);

			System.out.println("Do you want to add a Department yes/no?");
			String answer = sc.next();
			if (answer.equals("yes")) {
				addDepartment = true;
				System.out.println("next department");
			} else if (answer.equals("no")) {
				addDepartment = false;

				System.out.println("Thanks");
				System.out.println("School Name:" + sch.getSchoolName());

				for (Department dep1 : departmentlist) {
					System.out.println("Deparment name :" + dep1.getDepartmentName());
					System.out.println("Deparment id:" + dep1.getDepartmentId());

					for (Teacher T : dep1.getTechearlist()) {
						System.out.println("Teacher Name:" + T.getTeacherName());
						System.out.println("Teacher Id:" + T.getTeacherID());

						for (student S :dep1.tec.getStudentlist()) {
							System.out.println("Student Name:" + S.getStudentName());
							System.out.println("Student Id:" + S.getStudentId());

							for (Course cou1 : dep1.tec.stu.getCourselist()) {
								System.out.println("Course Status:" + cou1.getName());
								System.out.println("Course Status:" + cou1.getId());

								for (Mark mark1 : dep1.tec.stu.cou.getMarklist()) {
									System.out.println("Arabic Mark:" + mark1.getArabicMark());
									System.out.println("Math Mark:" + mark1.getMathMark());

									System.out.println("Total Marks:" + mark1.getSum());
									System.out.println("+++++++++++++++++++++++++++");
								} // dep for
							} // tech for
						} // stud for
					} // cor for

				} // mark for

			} // dep if

		} // dep while

	}
}

//System.out.println(sch.openSchool());
//System.out.println(dep.addDep());
//System.out.println(dep.getDepartmentId());
//System.out.println(tec.addID());
//System.out.println(stu.addID());
//System.out.println(cou.isOpenCourse());
//System.out.println(mark.getArabicMark());
//System.out.println(mark.getMathMark());
