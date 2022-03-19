import java.util.ArrayList;
import java.util.List;

public class StudentManager extends UserManager{
	List<Student> students = new ArrayList<Student>();
	
	public List<Student> getAll() {
		return students;
	}
}
