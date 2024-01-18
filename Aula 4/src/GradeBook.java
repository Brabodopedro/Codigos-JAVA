
public class GradeBook{
	private String courseName;
	private String instructorName;
	
	public GradeBook(String courseName) {
		this.courseName = courseName;
		this.instructorName = "Not defined yet";
	}
	
	public GradeBook(String courseName, String instructorName) {
	}{
		setCourseName(courseName);
		this.setInstructorName(instructorName);
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	public void displyMessage() {
		System.out.println("Seja bem vindo ao curso" + getCourseName() + ". Seu prfessor sera " + getInstructorName());
	}
}