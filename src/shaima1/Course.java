package shaima1;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {
	private String name;
	private int id;
	private int studentNumber;
	private boolean open = true;
	boolean close = false;
	Mark mark = new Mark();
	ArrayList<Mark> Marklist = new ArrayList<Mark>();

	public ArrayList<Mark> getMarklist() {
		return Marklist;
	}

	public void setMarklist(ArrayList<Mark> marklist) {
		Marklist = marklist;
	}

	boolean openCourse() {

		if (studentNumber > 30) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter Number");
			studentNumber = sc.nextInt();
		}

		return open;

	}

	public boolean isOpenCourse() {
		return openCourse();
	}

	public void setOpenCourse(boolean openCourse) {
		openCourse = openCourse();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

}
