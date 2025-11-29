package StudentManagementSystem;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\nStudent Management System");
			System.out.println("1.Add Student");
			System.out.println("2.View Students");
			System.out.println("3.Search Student");
			System.out.println("4.Update Student");
			System.out.println("5.Delete Student");
			System.out.println("6.Sort Student by Name");
			System.out.println("7.Exit");
			System.out.println("Choose an option: ");

		try{
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("Enter Roll Number : ");
				int roll = sc.nextInt();
				System.out.println("Enter Name : ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter Age : ");
				int age = sc.nextInt();
				System.out.println("Enter Grade : ");
				double grade = sc.nextDouble();
				manager.addstudent(new Student(roll, name, age, grade));
				break;
			case 2 :
				manager.viewStudents();
				break;
			case 3 :
				System.out.println("Enter roll number to search : ");
				Student found = manager.searchStudent(sc.nextInt());
				System.out.println((found != null)? found : "Student not found.");
				break;
			case 4 :
				System.out.println("Enter New Roll Number : ");
				int newroll = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter New Name : ");
				String newName = sc.nextLine();
				System.out.println("Enter New Age : ");
				int newAge = sc.nextInt();
				System.out.println("Enter New Grade : ");
				double newGrade = sc.nextDouble();
				manager.updateStudent(newroll, newName, newAge, newGrade);
				break;
			
			case 5 :
				System.out.println("Enter roll number to delete : ");
				manager.deleteStudent(sc.nextInt());
				break;
			
			case 6 :
				manager.sortStudentsByName();
				break;
			
			case 7:
				System.out.println("Good Byee... ");
				sc.close();
				return;
			default:
				System.out.println("Invalid Choice ! ");
			}
		} catch(InputMismatchException e){
			System.out.println("Error : Invalid Input. Please enter a valid number.");
			sc.nextLine();
		}
		}

	}

}


