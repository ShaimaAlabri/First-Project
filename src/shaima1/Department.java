package shaima1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
	private String departmentName;
	private int departmentId;

	Teacher tec = new Teacher();
	List<Teacher> techearlist = new ArrayList<>();

	public List<Teacher> getTechearlist() {
		return techearlist;
	}

	public void setTechearlist(List<Teacher> techearlist) {
		this.techearlist = techearlist;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

}
