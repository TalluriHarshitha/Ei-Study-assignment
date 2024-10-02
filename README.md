# Ei-Study-assignment
## Virtual Classroom Manager Programming Exercise

**General Workflow**:
**Classroom Management**: The user can add new classrooms using the add_classroom command. Each classroom is stored in the AssignmentManager’s classrooms map. The user can interact with these classrooms (e.g., enrolling students or scheduling assignments) using the classroom name.
**Student Management**: Students are represented by the Student class and can be added to a classroom using the add_student command. The addStudent method of the Classroom class enrolls a student in the classroom.
**Assignment Management**: The user can schedule assignments for a specific classroom using the schedule_assignment command. Students can then submit assignments for a specific class using the submit_assignment command.

**Explanation of Classes**:
This project contains 4 classes: Classroom class, Student class, AssignmentManager class, VirtualClassroomApp class.
The Classroom class represents a virtual classroom and manages students, assignments, and assignment submissions for that class. 
It provides methods to enroll students, add assignments, and submit assignments. The methods includes addStudent(Student student), addAssignment(String assignment), submitAssignment(String studentId, String assignment), getName(), getStudents(), getAssignments().

The Student class represents a student who can enroll in classrooms and submit assignments. This class contains methods Student(String id), getId().

The AssignmentManager class handles the management of classrooms, assignments, and student assignment submissions. It contains a collection of classrooms and provides methods to add classrooms, schedule assignments, and process assignment submissions.

The VirtualClassroomApp class serves as the entry point for the terminal-based application. It handles user input and calls the appropriate methods in AssignmentManager to perform classroom, student, and assignment management tasks.


To run the codes:
Use the following commands:
add_classroom ClassroomName
add_student ID ClassroomName
schedule_assignment ClassroomName “Assignment-Name”
submit_assignment ID ClassroomName Assignment-Name
