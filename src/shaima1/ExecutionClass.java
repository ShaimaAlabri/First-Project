package shaima1;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class ExecutionClass {// TODO: Is this a looop or class? Also make capital

	public static void main(String[] args) throws IOException { // TODO: Break this func into smaller functions
		School sch = new School("Musct", 55);
		Department dep = new Department();
		Teacher tec = new Teacher();
		student stu = new student();
		Course cou = new Course();
		Mark mark = new Mark();
        Stack stk=new Stack();
		List<Department> departmentlist = new ArrayList<>();
		boolean addDepartment = true;

		float sum = 0;

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
		 //System.out.println("Enter School Name:");
	     //String sName = sc.next();
		 //sch.setSchoolName(sName);

		/*
		 * boolean open = true;
		 * 
		 * if (open) { System.out.println("School is open"); } else if (open = false) {
		 * System.out.println("School is close"); }
		 */
		
		try {
			File myObj=new File("C:\\Users\\Lenovo\\Desktop\\shaima1\\Shaima_test.txt");
			if(myObj.createNewFile()) {
			System.out.println("file craeted:"+myObj.getName());
			}else {
				System.out.println("file already exit.");
			}
		}catch(IOException e){
			
			System.out.println("an erorr occurred.");
			
			e.printStackTrace();
			  
		}
		FileWriter writer = new FileWriter("C:\\Users\\Lenovo\\Desktop\\shaima1\\Shaima_test.txt");
	


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

				dep.techearlist.add(tec);

				if (answer1.equals("yes")) {
					System.out.println("Next Teacher:");
					addTeacher = true;

				} else if (answer1.equals("no")) {
					addTeacher = false;
					System.out.println("Student:");
					break;

				}

			} // while teacher
			boolean addStudent = true;

			while (addStudent) {

				System.out.println("Enter Student Name:");
				String stuName = sc.next();
				stu.setStudentName(stuName);

				System.out.println("Enter Studentid:");
				int stuId = sc.nextInt();
				stu.setStudentId(stuId);

				tec.studentlist.add(stu);

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

			} // while stud
			boolean addCourse = true;
			while (addCourse) {

				System.out.println("Enter Course Name:");
				String couName = sc.next();
				cou.setName(couName);
				stk.push(couName);
				
				

				System.out.println("Enter Courseid:");
				int couId = sc.nextInt();
				cou.setId(couId);

				stu.courselist.add(cou);

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

			} // course while

			boolean addMarks = true;

			while (addMarks) {

				// System.out.println("Student Name:" + stu.getStudentName());
				System.out.println("Enter Arabic Mark:");
				float AM =  (float) sc.nextDouble();
				mark.setArabicMark(AM);

				System.out.println("Enter Math Mark:");
				float Mm = (float) sc.nextDouble();
				mark.setMathMark(Mm);
				sum = (float) mark.getArabicMark() + (float) mark.getMathMark();
				mark.setSum(sum);

				cou.Marklist.add(mark);

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

			} // mark while
			
	
				

		
			
		
	

	
			departmentlist.add(dep);

			System.out.println("Do you want to add a Department yes/no?");
			String key = sc.next();
            if(key.equals("yes")) {
            	addDepartment=true;
            }else if(key.equals("no")) {
            	
            	

				//System.out.println("Thanks");
				//System.out.println("School Name:" + sch.getSchoolName());
		
				
				
				
				 for (Department dep1 : departmentlist) {
					System.out.println("Deparment name :" + dep1.getDepartmentName());
					writer.write("Deparment name :" + dep1.getDepartmentName() +"\n");
					
					System.out.println("Deparment id:" + dep1.getDepartmentId());
					writer.write("Deparment id:" + dep1.getDepartmentId()+"\n");

					for (Teacher T : dep1.getTechearlist()) {
						System.out.println("Teacher Name:" + T.getTeacherName());
						writer.write("Teacher Name:" + T.getTeacherName()+"\n");
						System.out.println("Teacher Id:" + T.getTeacherID());
						writer.write("Teacher Id:" + T.getTeacherID()+"\n");

						for (student S : T.getStudentlist()) {
							System.out.println("Student Name:" + S.getStudentName());
							writer.write("Student Name:" + S.getStudentName()+"\n");
							System.out.println("Student Id:" + S.getStudentId());
							writer.write("Student Id:" + S.getStudentId()+"\n");

							for (Course cou1 : S.getCourselist()) {
								System.out.println("Course Status:" + cou1.getName());
								writer.write("Course Status:" + cou1.getName()+"\n");
								System.out.println("Course Status:" + cou1.getId());
								writer.write("Course Status:" + cou1.getId()+"\n");

								for (Mark mark1 : cou1.getMarklist()) {
									System.out.println("Arabic Mark:" + mark1.getArabicMark());
									writer.write("Arabic Mark:" + mark1.getArabicMark()+"\n");
									System.out.println("Math Mark:" + mark1.getMathMark());
									writer.write("Math Mark:" + mark1.getMathMark()+"\n");

									System.out.println("Total Marks:" + mark1.getSum());
									writer.write("Total Marks:" + mark1.getSum()+"\n");
									System.out.println("");
									writer.write(""+"\n");
									System.out.println("+++++++++++++++++++++++++++");
									writer.write("+++++++++++++++++++++++++++"+"\n");
									System.out.println("");
									writer.write(""+"\n");
								
								} // dep for
							} // tech for
						} // stud for
					} // cor for

				} // mark for

			} // dep if
            System.out.println("Do you want to add Course History?");
			String answer100 = sc.next();
			if (answer100.equals("yes")) {
				for ( int i=0;i<=stk.size();i++) {
					
					System.out.println(stk.pop());
		addDepartment=false;
				} 
				} else{
					System.out.println("Thanks");

			}	
		
	
		} 

		
		writer.close();
	
	}
		
	} // dep while
		

	
	




//System.out.println(sch.openSchool());
//System.out.println(dep.addDep());
//System.out.println(dep.getDepartmentId());
//System.out.println(tec.addID());
//System.out.println(stu.addID());
//System.out.println(cou.isOpenCourse());
//System.out.println(mark.getArabicMark());
//System.out.println(mark.getMathMark());
