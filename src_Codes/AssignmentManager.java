import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AssignmentManager {
    private final Map<String, Classroom> classrooms = new HashMap<>();
    private static final Logger logger = Logger.getLogger(AssignmentManager.class.getName());

    public void addClassroom(String classroomName) {
        classrooms.put(classroomName, new Classroom(classroomName));
        logger.log(Level.INFO, "Classroom {0} has been created.", classroomName);
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addAssignment(assignmentDetails);
            logger.log(Level.INFO, "Assignment for {0} has been scheduled.", className);
        } else {
            logger.log(Level.WARNING, "Classroom {0} does not exist.", className);
        }
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.submitAssignment(studentId, assignmentDetails);
            logger.log(Level.INFO, "Assignment submitted by Student {0} in {1}.", new Object[]{studentId, className});
        } else {
            logger.log(Level.WARNING, "Classroom {0} does not exist.", className);
        }
    }

    public Map<String, Classroom> getClassrooms() {
        return classrooms;
    }
}
