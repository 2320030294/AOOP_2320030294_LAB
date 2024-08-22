package Com.StudentInformationSystem;

import java.util.List;

public interface coursee {
	
	    String getCourseId();
	    String getCourseName();
	    void enrollStudent(student student);
	    List<student> getEnrolledStudents();
	}