import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {
    private final String id;
    private static final Logger logger = Logger.getLogger(Student.class.getName());

    public Student(String id) {
        this.id = id;
        logger.log(Level.INFO, "Student created with ID: {0}", id);
    }

    public String getId() {
        return id;
    }
}