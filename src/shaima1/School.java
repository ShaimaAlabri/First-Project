package shaima1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
   
     School(String name){
    
    	 System.out.println(name);
     }
	private String schoolName;
	private String schoolLocation;
	Department depat = new Department();

	ArrayList<Department> departmentName = new ArrayList<Department>();
	ArrayList<Department> departmentId = new ArrayList<Department>();
	Scanner scanner = new Scanner(System.in);

	public ArrayList<Department> getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(ArrayList<Department> departmentName) {
		this.departmentName = departmentName;
	}

	public ArrayList<Department> getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(ArrayList<Department> departmentId) {
		this.departmentId = departmentId;
	}

	{

	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolLocation() {
		return schoolLocation;
	}

	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}

}