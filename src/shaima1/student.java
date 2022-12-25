package shaima1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class student {
	private String studentName;
	private int studentId;
	Course cou=new Course();
	 ArrayList<Course> courselist = new ArrayList<Course>();
		
	
	public ArrayList<Course> getCourselist() {
		return courselist;
	}

	public void setCourselist(ArrayList<Course> courselist) {
		this.courselist = courselist;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public HashMap<String, Integer> addID() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put(studentName,studentId);
		System.out.println("student:");
		
		return map;

	}

}
