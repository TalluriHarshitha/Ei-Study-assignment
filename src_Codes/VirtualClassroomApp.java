import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VirtualClassroomApp {
    private static final Logger logger = Logger.getLogger(VirtualClassroomApp.class.getName());

    public static void main(String[] args) {
        // Check if the logger already has handlers to avoid adding multiple ConsoleHandlers
        if (logger.getHandlers().length == 0) {
            ConsoleHandler handler = new ConsoleHandler();
            logger.addHandler(handler);
            logger.setLevel(Level.ALL);
            handler.setLevel(Level.ALL);
        }

        AssignmentManager manager = new AssignmentManager();
        Scanner scanner = new Scanner(System.in);

        logger.log(Level.INFO, "Welcome to the Virtual Classroom Manager!");

        while (true) {
            System.out.println("Enter command:");
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String command = parts[0];

            switch (command) {
                case "add_classroom" -> manager.addClassroom(parts[1]);
                case "add_student" -> {
                    String[] studentData = parts[1].split(" ");
                    manager.getClassrooms().get(studentData[1]).addStudent(new Student(studentData[0]));
                }
                case "schedule_assignment" -> {
                    String[] assignmentData = parts[1].split(" ", 2);
                    manager.scheduleAssignment(assignmentData[0], assignmentData[1]);
                }
                case "submit_assignment" -> {
                    String[] submissionData = parts[1].split(" ", 3);
                    manager.submitAssignment(submissionData[0], submissionData[1], submissionData[2]);
                }
                default -> {
                    System.out.println("Invalid command.");
                    logger.log(Level.WARNING, "Invalid command entered: {0}", command);
                }
            }
        }
    }
}
