package shaima1;

import java.io.Serializable;

public class Course1 implements Serializable {
private String courseName;
private int coursID;
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getCoursID() {
	return coursID;
}
public void setCoursID(int coursID) {
	this.coursID = coursID;
}

}
