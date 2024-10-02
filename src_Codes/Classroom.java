import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Classroom {
    private final String name;
    private final List<Student> students = new ArrayList<>();
    private final List<String> assignments = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(Classroom.class.getName());

    public Classroom(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        logger.log(Level.INFO, "Student {0} enrolled in classroom {1}.", new Object[]{student.getId(), name});
    }

    public void addAssignment(String assignment) {
        assignments.add(assignment);
        logger.log(Level.INFO, "Assignment added to classroom {0}.", name);
    }

    public void submitAssignment(String studentId, String assignment) {
        logger.log(Level.INFO, "Student {0} submitted assignment in classroom {1}.", new Object[]{studentId, name});
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getAssignments() {
        return assignments;
    }

    
}