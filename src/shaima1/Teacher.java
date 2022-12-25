package shaima1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Teacher {
	private String teacherName;
	private int teacherID;
	private int tecNumber;
	ArrayList<student> studentlist = new ArrayList<student>();

	public ArrayList<student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(ArrayList<student> studentlist) {
		this.studentlist = studentlist;
	}

	Scanner scanner = new Scanner(System.in);

	public int getTecNumber() {
		return tecNumber;
	}

	public void setTecNumber(int tecNumber) {
		this.tecNumber = tecNumber;
	}

	student stu = new student();

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public HashMap<String, Integer> addID() {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put(teacherName, teacherID);
		System.out.println("theacher:" + map);

		return map;

	}
}
