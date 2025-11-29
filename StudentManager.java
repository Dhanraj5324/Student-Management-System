package StudentManagementSystem;
import java.util.*;
public class StudentManager {
	private ArrayList<Student> students = new ArrayList<>();
	public void addstudent(Student student) {
		students.add(student);
		System.out.println("Student Added Successfully ; ");
	}
	public void viewStudents() {
		if(students.isEmpty()) {
			System.out.println("No Students ; ");
			return;
		}
		for(Student student : students) {
			System.out.println(student);
		}
	}
	public Student searchStudent(int rollNumber) {
		for(Student student : students) {
			if(student.getRollNumber()==rollNumber) {
				return student;
			}
		}
		return null;
	}
	public void updateStudent(int rollNumber, String name, int age, double grade) {
		Student student = searchStudent(rollNumber);
		if(student != null) {
			student.setName(name);
			student.setAge(age);
			student.setGrade(grade);
			System.out.println("Updated Successfully ; ");			
		}else {
			System.out.println("Student Not Found ; ");
		}
	}
	public void deleteStudent(int rollNumber) {
		Student student = searchStudent(rollNumber);
		if(student != null) {
			students.remove(student);
			System.out.println("Student Removed ; ");
		}else {
			System.out.println("Student Not found ; ");
		}
	}
	public void sortStudentsByName() {
		students.sort(Comparator.comparing(Student::getName));
		System.out.println("Students Sorted By Name ; ");
	}
}
