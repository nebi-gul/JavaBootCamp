
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id=1;
		student.firstName="Nebi";
		student.lastName="Gül";
		student.nationalyId="21775654264";
		student.coursesId=new int[] {1,2,3};
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiro ";
		instructor.nationalyId= "454454654544";
		instructor.instructorsCoursesId = new int[] {3,2,1};
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
		
		
	}

}
